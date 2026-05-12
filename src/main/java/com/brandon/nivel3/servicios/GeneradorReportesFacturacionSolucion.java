package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * SOLUCIÓN A: Generador de Reportes de Facturación.
 * 
 * <p>Teoría:
 * Usamos streams para procesar la lista eficientemente. 
 * Records de Java 21 facilitan la creación de estructuras de datos inmutables.</p>
 */
@Service
public class GeneradorReportesFacturacionSolucion {

    public record Factura(String id, double monto) {}
    public record ReporteFacturacion(double subtotal, double totalConImpuestos, long facturasVipCount) {}

    public ReporteFacturacion generarResumen(List<Factura> facturas) {
        if (facturas == null || facturas.isEmpty()) {
            return new ReporteFacturacion(0, 0, 0);
        }

        double subtotal = facturas.stream()
                .mapToDouble(Factura::monto)
                .sum();

        double total = subtotal * 1.15;

        long vipCount = facturas.stream()
                .filter(f -> f.monto() > 500)
                .count();

        return new ReporteFacturacion(subtotal, total, vipCount);
    }
}
