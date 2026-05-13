package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Unión de Nombres.
 */
public class UnionNombresSolucion {

    public String unir(List<String> nombres) {
        return nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }
}
