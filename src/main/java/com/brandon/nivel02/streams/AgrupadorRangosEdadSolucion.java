package com.brandon.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Agrupador por Rangos de Edad.
 */
public class AgrupadorRangosEdadSolucion {

    public record Persona(String nombre, int edad) {}

    public Map<String, List<String>> agruparPorRangos(List<Persona> personas) {
        return personas.stream()
                .collect(Collectors.groupingBy(
                        p -> {
                            if (p.edad() < 18) return "JOVEN";
                            if (p.edad() <= 60) return "ADULTO";
                            return "SENIOR";
                        },
                        Collectors.mapping(Persona::nombre, Collectors.toList())
                ));
    }
}
