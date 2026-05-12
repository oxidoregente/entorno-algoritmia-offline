package com.brandon.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * RETO: Agrupamiento de Ciudades por País.
 * 
 * Recibes una lista de 'Ciudad' (con nombre y país).
 * Debes devolver un Mapa donde la llave es el País y el valor es 
 * la CANTIDAD de ciudades de ese país en la lista.
 */
public class FiltroCiudadesStreamEnunciado {

    public record Ciudad(String nombre, String pais) {}

    public Map<String, Long> contarCiudadesPorPais(List<Ciudad> ciudades) {
        // TODO: Implementa usando .stream(), .collect() y Collectors.groupingBy()
        return null;
    }
}
