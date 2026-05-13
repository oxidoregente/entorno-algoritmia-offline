package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * SOLUCIÓN: Filtrar Primos.
 */
public class FiltroPrimosSolucion {

    public List<Integer> filtrar(List<Integer> numeros) {
        return numeros.stream()
                .filter(this::esPrimo)
                .collect(Collectors.toList());
    }

    private boolean esPrimo(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }
}
