package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.Factura;
import com.algoritmia.nivel02.logica.GeneradorReportesFacturacionEnunciado.ReporteFacturacion;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 🏆 SOLUCIÓN: Servicio de Reportes de Inventario.
 *
 * <p>Teoría:
 * Este servicio demuestra <b>composición de lógica de negocio con servicios
 * algorítmicos</b>. La idea es que un servicio de Spring no tiene que hacer
 * toda la lógica: puede delegar cálculos pesados a clases de lógica pura
 * (nivel 02) inyectadas como dependencias.</p>
 */
public class ReporteInventarioSolucion {

    private final GestorInventarioEnunciado inventario;
    private final GeneradorReportesFacturacionEnunciado facturacion;

    public ReporteInventarioSolucion(GestorInventarioEnunciado inventario,
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
     * @param facturas        Lista de facturas.
     * @return Mapa con estado y reporte de facturación.
     */
    public Map<String, Object> generarReporteCompleto(int stockActual,
                                                     int cantidadPedida,
                                                     boolean esVital,
                                                     List<Factura> facturas) {
        EstatusOrden estado = inventario.procesarOrden(stockActual, cantidadPedida, esVital);
        ReporteFacturacion reporte = facturacion.generarResumen(facturas);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("estado", estado.name());
        resultado.put("reporte", reporte);
        return resultado;
    }
}
