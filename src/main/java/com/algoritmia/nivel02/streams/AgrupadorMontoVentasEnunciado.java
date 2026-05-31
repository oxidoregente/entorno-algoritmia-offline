package com.algoritmia.nivel02.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Agrupador de Monto por Moneda. <b>Dificultad: Media</b>
 * 
 * <p>
 * Dada una lista de ventas (record Venta), agrúpalas por moneda y calcula la
 * suma total del monto para cada una.
 * </p>
 */
public class AgrupadorMontoVentasEnunciado {

	public record Venta(double monto, String moneda) {
	}

	public Map<String, Double> calcularTotalesPorMoneda(List<Venta> ventas) {
		// TODO: Implementa usando groupingBy y summingDouble

		return ventas.stream()
				.collect(Collectors.groupingBy(Venta::moneda, Collectors.summingDouble(Venta::monto)));
	}
}
