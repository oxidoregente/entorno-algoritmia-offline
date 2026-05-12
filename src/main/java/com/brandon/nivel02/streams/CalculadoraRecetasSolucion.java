package com.brandon.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Calculadora de Recetas.
 * 
 * <p>Teoría:
 * El uso de Collectors.toMap() permite transformar un stream directamente en un Mapa,
 * definiendo qué campo será la llave y cuál el valor.</p>
 */
public class CalculadoraRecetasSolucion {

    public record Ingrediente(String nombre, double cantidadGramos) {}

    public Map<String, Double> ajustarReceta(List<Ingrediente> ingredientes, double multiplicador) {
        return ingredientes.stream()
            .filter(i -> i.cantidadGramos() >= 10.0)
            .collect(Collectors.toMap(
                Ingrediente::nombre,
                i -> i.cantidadGramos() * multiplicador
            ));
    }
}
