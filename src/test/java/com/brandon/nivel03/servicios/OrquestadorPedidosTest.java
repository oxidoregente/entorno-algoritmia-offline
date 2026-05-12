package com.brandon.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.brandon.nivel14.mensajeria.ProductorMensajesEnunciado;
import com.brandon.nivel03.servicios.GestorInventarioEnunciado.EstatusOrden;
import com.brandon.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrquestadorPedidosTest {

    @Mock private GestorInventarioEnunciado inventario;
    @Mock private ProcesadorPagosFintechEnunciado pagos;
    @Mock private ProductorMensajesEnunciado productor;

    @InjectMocks
    private OrquestadorPedidosEnunciado orquestador;

    @Test
    void testPedidoExitoso() {
        // ARRANGE: Configuramos los mocks para que digan que todo está OK
        when(inventario.procesarOrden(anyInt(), anyInt(), anyBoolean()))
            .thenReturn(EstatusOrden.PROCESADO_EXITOSO);

        // ACT
        boolean resultado = orquestador.procesarPedido("Laptop", 1, 1000.0, "CREDITO");

        // ASSERT
        // assertTrue(resultado);
        
        // Verificamos que se llamó a los tres servicios
        // verify(inventario).procesarOrden(anyInt(), anyInt(), anyBoolean());
        // verify(pagos).calcularComision(anyDouble(), any());
        // verify(productor).enviarEvento(anyString());
    }

    @Test
    void testPedidoFallidoPorStock() {
        // ARRANGE: El inventario dice que no hay stock
        when(inventario.procesarOrden(anyInt(), anyInt(), anyBoolean()))
            .thenReturn(EstatusOrden.RECHAZADO_SIN_STOCK);

        // ACT & ASSERT: El orquestador debería fallar
        // assertThrows(RuntimeException.class, () -> {
        //    orquestador.procesarPedido("Laptop", 1, 1000.0, "CREDITO");
        // });
        
        // El pago y la notificación NUNCA deberían haberse llamado
        // verifyNoInteractions(pagos, productor);
    }
}
