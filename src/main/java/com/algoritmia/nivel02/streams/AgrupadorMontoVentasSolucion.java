package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🏆 SOLUCIÓN: Agrupador de Monto por Moneda.
 */
public class AgrupadorMontoVentasSolucion {

    public record Venta(double monto, String moneda) {}

    public Map<String, Double> calcularTotalesPorMoneda(List<Venta> ventas) {
        if (ventas == null) return Map.of();
        return ventas.stream()
                .collect(Collectors.groupingBy(
                        Venta::moneda,
                        Collectors.summingDouble(Venta::monto)
                ));
    }
}
