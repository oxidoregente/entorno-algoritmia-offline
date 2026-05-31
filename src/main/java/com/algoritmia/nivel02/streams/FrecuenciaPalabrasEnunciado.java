package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Frecuencia de Palabras. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dada una lista de palabras, devuelve un Mapa donde la clave es la palabra y
 * el valor es la cantidad de veces que aparece en la lista.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Palabras: ["java", "python", "java", "ruby", "python", "java"]
 * Resultado: {"java": 3, "python": 2, "ruby": 1}
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa `Collectors.groupingBy(Function.identity(),
 * Collectors.counting())`.</li>
 * <li>Si la lista es nula, retorna un mapa vacío.</li>
 * </ul>
 */
public class FrecuenciaPalabrasEnunciado {

	/**
	 * Calcula la frecuencia de cada palabra en una lista.
	 *
	 * @param palabras Lista de palabras de entrada.
	 * @return Mapa con cada palabra y su frecuencia de aparición.
	 */
	public Map<String, Long> calcularFrecuencia(List<String> palabras) {
		// TODO: Implementa usando groupingBy y counting
		return palabras.stream()
				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
	}
}
