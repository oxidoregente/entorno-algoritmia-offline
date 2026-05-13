package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * RETO: Agrupador por Rangos de Edad.
 * 
 * Recibes una lista de 'Persona' (con nombre y edad).
 * Debes agruparlas en un Mapa donde la llave sea una categoría:
 * - "JOVEN" (menor a 18)
 * - "ADULTO" (18 a 60)
 * - "SENIOR" (mayor a 60)
 * El valor del mapa debe ser la lista de nombres de esas personas.
 */
public class AgrupadorRangosEdadEnunciado {

    public record Persona(String nombre, int edad) {}

    public Map<String, List<String>> agruparPorRangos(List<Persona> personas) {
        // TODO: Implementa usando groupingBy y mapping
        return null;
    }
}
