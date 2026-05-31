package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Agrupamiento de Ciudades por País. <b>Dificultad: Fácil</b>
 * 
 * <p>
 * Recibes una lista de 'Ciudad' (con nombre y país). Debes devolver un Mapa
 * donde la llave es el País y el valor es la CANTIDAD de ciudades de ese país
 * en la lista.
 * </p>
 */
public class FiltroCiudadesStreamEnunciado {

	public record Ciudad(String nombre, String pais) {
	}

	public Map<String, Long> contarCiudadesPorPais(List<Ciudad> ciudades) {
		// TODO: Implementa usando .stream(), .collect() y Collectors.groupingBy()

		Map<String, Long> paises = ciudades.stream()
				.collect(Collectors.groupingBy(Ciudad::pais, Collectors.counting()));
		
		System.out.println(paises.toString());

		return paises;
	}
}
