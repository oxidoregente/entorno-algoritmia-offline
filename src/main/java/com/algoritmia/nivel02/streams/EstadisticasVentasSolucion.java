package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Estadísticas de Ventas con Streams.
 * 
 * <p>Teoría:
 * - .groupingBy(): Crea un mapa basado en una propiedad.
 * - .summingDouble(): Realiza una suma agregada.</p>
 */
public class EstadisticasVentasSolucion {

    public record Venta(String categoria, double monto) {}

    public Map<String, Double> calcularTotalesPorCategoria(List<Venta> ventas) {
        return ventas.stream()
            .collect(Collectors.groupingBy(
                Venta::categoria,
                Collectors.summingDouble(Venta::monto)
            ));
    }
}
