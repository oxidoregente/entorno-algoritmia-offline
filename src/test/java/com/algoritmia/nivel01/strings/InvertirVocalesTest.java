package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para el ejercicio de Invertir Vocales.
 * Invierte solo las vocales en una cadena, manteniendo consonantes en su lugar.
 */
class InvertirVocalesTest {

    @Test
    void testInvertirVocalesEstandar() {
        InvertirVocalesEnunciado solver = new InvertirVocalesEnunciado();
        assertEquals("holle", solver.invertir("hello"));
        assertEquals("leotcede", solver.invertir("leetcode"));
    }

    @Test
    void testInvertirVocalesSinVocales() {
        InvertirVocalesEnunciado solver = new InvertirVocalesEnunciado();
        assertEquals("bcdfg", solver.invertir("bcdfg"));
    }
}
