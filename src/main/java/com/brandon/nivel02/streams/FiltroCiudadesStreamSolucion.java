package com.brandon.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Agrupamiento de Ciudades por País.
 */
public class FiltroCiudadesStreamSolucion {

    public record Ciudad(String nombre, String pais) {}

    public Map<String, Long> contarCiudadesPorPais(List<Ciudad> ciudades) {
        return ciudades.stream()
                .collect(Collectors.groupingBy(
                        Ciudad::pais,
                        Collectors.counting()
                ));
    }
}
