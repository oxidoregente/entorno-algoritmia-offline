package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.Factura;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.ReporteFacturacion;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Servicio de Reportes de Inventario.
 * <b>Dificultad: Media</b>
 *
 * <p>Combina lógica algorítmica (nivel 02) con inyección de Spring para
 * generar reportes que cruzan información de inventario y facturación.</p>
 *
 * <p><b>Funcionalidad:</b> Dado un stock disponible y un conjunto de facturas,
 * genera un reporte con el estado del inventario y el resumen de facturación.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * servicio.generarReporteCompleto(
 *   100, 5, false,
 *   List.of(
 *     new Factura("F001", 1500.0),
 *     new Factura("F002",   50.0)
 *   )
 * )
 *
 * // Retorna un Map con:
 * // - "estado": "PROCESADO_EXITOSO"
 * // - "reporte": { subtotal, totalConImpuestos, facturasVipCount }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Las dependencias se inyectan por constructor (sin {@code @Autowired}).</li>
 *   <li>{@code GestorInventario} usa {@code procesarOrden(stock, cantidad, esVital)}.</li>
 *   <li>{@code GeneradorReportesFacturacion} usa {@code generarResumen(facturas)}.</li>
 *   <li>Combina ambos resultados en un {@code Map<String, Object>} para retornar.</li>
 * </ul>
 */
@Service
public class ReporteInventarioEnunciado {

    private final GestorInventarioEnunciado inventario;
    private final GeneradorReportesFacturacionEnunciado facturacion;

    public ReporteInventarioEnunciado(GestorInventarioEnunciado inventario,
                                      GeneradorReportesFacturacionEnunciado facturacion) {
        this.inventario = inventario;
        this.facturacion = facturacion;
    }

    /**
     * Genera un reporte combinado de inventario y facturación.
     *
     * @param stockActual     Stock actual del producto.
     * @param cantidadPedida  Cantidad solicitada en la orden.
     * @param esVital         Si el producto es crítico.
     * @param facturas        Lista de facturas para resumir.
     * @return Mapa con claves "estado" (String) y "reporte" (ReporteFacturacion).
     */
    public Map<String, Object> generarReporteCompleto(int stockActual,
                                                      int cantidadPedida,
                                                      boolean esVital,
                                                      List<Factura> facturas) {
        // TODO: Implementa el reporte combinado
        return null;
    }
}
