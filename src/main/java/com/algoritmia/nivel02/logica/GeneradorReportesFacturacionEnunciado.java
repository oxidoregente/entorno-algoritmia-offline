package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Generador de Reportes de Facturación. <b>Dificultad: Media</b>
 *
 * <p>
 * Consolida un reporte resumen a partir de una lista de facturas.
 * </p>
 *
 * <p>
 * <b>Requerimientos:</b>
 * </p>
 * <ol>
 * <li>Calcular el subtotal sumando todos los montos de las facturas.</li>
 * <li>Aplicar un impuesto del 15% al subtotal para obtener el total con
 * impuestos.</li>
 * <li>Contar cuántas facturas superan los $500 (Facturas VIP).</li>
 * <li>Devolver un record `ReporteFacturacion` con los datos consolidados.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Facturas: [("F001", 300), ("F002", 600), ("F003", 150)]
 * Subtotal: 300 + 600 + 150 = 1050.0
 * Total con impuestos: 1050 * 1.15 = 1207.5
 * Facturas VIP (> 500): 1 (F002)
 * </pre>
 */
@Service
public class GeneradorReportesFacturacionEnunciado {

    public record Factura(String id, double monto) {
    }

    public record ReporteFacturacion(double subtotal, double totalConImpuestos, long facturasVipCount) {
    }

    /**
     * Genera un reporte resumen a partir de una lista de facturas.
     *
     * @param facturas Lista de facturas a consolidar.
     * @return Reporte con subtotal, total con impuestos y conteo VIP.
     */
    public ReporteFacturacion generarResumen(List<Factura> facturas) {
        // TODO: Implementa la consolidación de facturas
        int vip = 0;
        double subtotal = 0;
        for (var f : facturas) {
            if (f.monto > 500)
                vip++;
            subtotal += f.monto;
        }
        
        var reporte = new ReporteFacturacion(subtotal, subtotal * 1.15, vip);
        
        System.out.println(reporte);

        return reporte;
    }
}
