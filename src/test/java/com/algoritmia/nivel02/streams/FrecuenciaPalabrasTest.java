package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Frecuencia de Palabras.
 * Valida cálculo de frecuencia de palabras en una lista.
 */
class FrecuenciaPalabrasTest {

    @Test
    void testFrecuenciaPalabras() {
        FrecuenciaPalabrasEnunciado solver = new FrecuenciaPalabrasEnunciado();
        List<String> entrada = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        
        Map<String, Long> resultado = solver.calcularFrecuencia(entrada);
        
        assertEquals(3, resultado.get("apple"));
        assertEquals(2, resultado.get("banana"));
        assertEquals(1, resultado.get("orange"));
    }
}
