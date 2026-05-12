package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel3.servicios.GeneradorReportesFacturacionEnunciado.*;

class GeneradorReportesFacturacionTest {

    @Test
    void testGenerarResumen() {
        GeneradorReportesFacturacionEnunciado servicio = new GeneradorReportesFacturacionEnunciado();
        List<Factura> facturas = List.of(
            new Factura("F1", 100.0),
            new Factura("F2", 600.0),
            new Factura("F3", 300.0)
        );

        ReporteFacturacion reporte = servicio.generarResumen(facturas);

        assertNotNull(reporte);
        assertEquals(1000.0, reporte.subtotal());
        assertEquals(1150.0, reporte.totalConImpuestos());
        assertEquals(1, reporte.facturasVipCount());
    }
}
