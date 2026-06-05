package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.Factura;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.ReporteFacturacion;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

/**
 * Test para el Servicio de Reportes de Inventario.
 * Valida la composición de servicios de lógica pura.
 */
@ExtendWith(MockitoExtension.class)
class ReporteInventarioTest {

    @Mock private GestorInventarioEnunciado inventario;
    @Mock private GeneradorReportesFacturacionEnunciado facturacion;

    @InjectMocks
    private ReporteInventarioEnunciado servicio;

    @Test
    void testReporteCompleto() {
        when(inventario.procesarOrden(100, 5, false)).thenReturn(EstatusOrden.PROCESADO_EXITOSO);
        when(facturacion.generarResumen(anyList()))
            .thenReturn(new ReporteFacturacion(1550.0, 1782.5, 1L));

        Map<String, Object> reporte = servicio.generarReporteCompleto(
            100, 5, false,
            List.of(new Factura("F001", 1500.0), new Factura("F002", 50.0))
        );

        assertEquals("PROCESADO_EXITOSO", reporte.get("estado"));
        assertNotNull(reporte.get("reporte"));
    }
}
