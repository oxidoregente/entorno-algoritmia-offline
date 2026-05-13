package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

/**
 * SOLUCIÓN: Frecuencia de Palabras.
 * 
 * <p>Teoría:
 * .groupingBy() agrupa los elementos. Al pasarle Collectors.counting() como
 * segundo argumento (downstream collector), realiza el conteo por cada grupo.</p>
 */
public class FrecuenciaPalabrasSolucion {

    public Map<String, Long> calcularFrecuencia(List<String> palabras) {
        return palabras.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }
}
