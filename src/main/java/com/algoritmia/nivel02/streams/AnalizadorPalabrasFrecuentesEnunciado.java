package com.algoritmia.nivel02.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Analizador de Palabras Más Frecuentes. <b>Dificultad: Difícil</b>
 * 
 * <p>
 * Dada una cadena larga de texto, encuentra las 3 palabras más frecuentes
 * ignorando mayúsculas/minúsculas y "stop words" comunes (el, la, de, y, que).
 * </p>
 */
public class AnalizadorPalabrasFrecuentesEnunciado {

	public List<String> obtenerTop3Palabras(String texto) {
		// TODO: Implementa usando .stream(), .groupingBy(), Collectors.counting()
		// TODO: Ordena por frecuencia descendente y limita a 3.

		if (texto.trim().equals(""))
			return null;

		var s = texto.trim().replaceAll(",", "").split(" ");

		Map<String, Long> cantidad = Arrays.stream(s).map(e -> e.toLowerCase())
				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));

		List<String> palabras = cantidad.entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.map(e -> e.getKey())
				.filter(e -> e.length() > 3)
				.limit(3)
				.collect(Collectors.toList());

		return palabras;
	}
}
