package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Calculadora de IVA. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dada una lista de precios base, calcula el total sumando todos los precios
 * con un 21% de IVA aplicado a cada uno de ellos.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Precios: [100.0, 200.0, 50.0]
 * Con IVA: [121.0, 242.0, 60.5]
 * Total:   423.5
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa `stream().mapToDouble(p -> p * 1.21).sum()`.</li>
 * <li>Si la lista es nula o vacía, retorna 0.0.</li>
 * </ul>
 */
public class CalculadoraIVAEnunciado {

	/**
	 * Calcula el precio total con IVA (21%) para una lista de precios base.
	 *
	 * @param precios Lista de precios base.
	 * @return El total de todos los precios con IVA incluido.
	 */
	public double calcularTotalConIVA(List<Double> precios) {
		// TODO: Implementa usando stream, mapToDouble y sum

		double precioTotal = precios.stream().mapToDouble(e -> e.doubleValue() * 1.21).reduce(0, (a, b) -> a + b);

		return precioTotal;
	}
}
