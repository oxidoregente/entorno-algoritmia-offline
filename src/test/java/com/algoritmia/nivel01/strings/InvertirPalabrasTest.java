package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para el ejercicio de Invertir Palabras.
 * Invierte el orden de las palabras en una oración.
 */
class InvertirPalabrasTest {

    @Test
    void testInvertirPalabras() {
        InvertirPalabrasEnunciado solver = new InvertirPalabrasEnunciado();
        assertEquals("Java Mundo Hola", solver.invertir("Hola Mundo Java"));
    }
}
