package com.algoritmia.nivel02.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

/**
 * 🏆 SOLUCIÓN: Analizador de Palabras Más Frecuentes.
 */
public class AnalizadorPalabrasFrecuentesSolucion {

    private final Set<String> stopWords = Set.of("el", "la", "de", "y", "que", "un", "una", "en");

    public List<String> obtenerTop3Palabras(String texto) {
        if (texto == null || texto.isBlank()) return List.of();

        return Arrays.stream(texto.toLowerCase().split("\\W+"))
                .filter(p -> !p.isBlank() && !stopWords.contains(p))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
