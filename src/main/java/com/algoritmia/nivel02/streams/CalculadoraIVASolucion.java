package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🏆 SOLUCIÓN: Calculadora de IVA.
 */
public class CalculadoraIVASolucion {

    public double calcularTotalConIVA(List<Double> precios) {
        if (precios == null) return 0;
        return precios.stream()
                .mapToDouble(p -> p * 1.21)
                .sum();
    }
}
