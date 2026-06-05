package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.algoritmia.nivel02.logica.CalculadoraEnviosInternacionalesEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import java.util.Map;

/**
 * Test para el Servicio de Checkout Completo.
 * Valida orquestación de 4 dependencias.
 */
@ExtendWith(MockitoExtension.class)
class CheckoutCompletoTest {

    @Mock private GestorInventarioEnunciado inventario;
    @Mock private CalculadoraEnviosInternacionalesEnunciado envios;
    @Mock private ProcesadorPagosFintechEnunciado pagos;
    @Mock private ApplicationEventPublisher publicadorEventos;

    @InjectMocks
    private CheckoutCompletoEnunciado servicio;

    @Test
    void testCheckoutExitoso() {
        when(inventario.procesarOrden(anyInt(), anyInt(), anyBoolean()))
            .thenReturn(EstatusOrden.PROCESADO_EXITOSO);
        when(envios.calcularCosto(anyDouble(), anyString())).thenReturn(50.0);
        when(pagos.calcularComision(anyDouble(), any())).thenReturn(30.0);

        Map<String, Object> resumen = servicio.checkoutCompleto(
            100, 2, false, "EUROPA", 2.5, 1000.0, TipoTarjeta.CREDITO
        );

        assertEquals("PROCESADO_EXITOSO", resumen.get("estado"));
        assertNotNull(resumen.get("costoEnvio"));
        assertNotNull(resumen.get("comision"));
        verify(publicadorEventos).publishEvent(anyString());
    }

    @Test
    void testCheckoutRechazado() {
        when(inventario.procesarOrden(anyInt(), anyInt(), anyBoolean()))
            .thenReturn(EstatusOrden.RECHAZADO_SIN_STOCK);

        Map<String, Object> resumen = servicio.checkoutCompleto(
            1, 10, false, "EUROPA", 2.5, 1000.0, TipoTarjeta.CREDITO
        );

        assertEquals("RECHAZADO_SIN_STOCK", resumen.get("estado"));
        verifyNoInteractions(envios, pagos, publicadorEventos);
    }
}
