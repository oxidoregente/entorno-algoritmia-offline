package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * RETO A: Generador de Reportes de Facturación.
 * 
 * Este servicio debe consolidar un reporte resumen a partir de una lista de facturas.
 * 
 * Requerimientos:
 * 1. Calcular el subtotal sumando todos los montos.
 * 2. Aplicar un impuesto del 15% al subtotal.
 * 3. Contar cuántas facturas superan los $500 (Facturas VIP).
 * 4. Devolver un record 'ReporteFacturacion'.
 */
@Service
public class GeneradorReportesFacturacionEnunciado {

    public record Factura(String id, double monto) {}
    public record ReporteFacturacion(double subtotal, double totalConImpuestos, long facturasVipCount) {}

    public ReporteFacturacion generarResumen(List<Factura> facturas) {
        // TODO: Implementa la lógica de consolidación
        return null;
    }
}
