package com.brandon.nivel2.streams;

import java.util.Comparator;
import java.util.List;

/**
 * SOLUCIÓN: Segundo Número Más Grande.
 */
public class SegundoMasGrandeSolucion {

    public Integer encontrar(List<Integer> numeros) {
        return numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
}
