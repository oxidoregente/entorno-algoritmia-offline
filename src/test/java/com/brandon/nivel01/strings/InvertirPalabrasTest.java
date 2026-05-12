package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class InvertirPalabrasTest {

    @Test
    void testInvertirPalabras() {
        InvertirPalabrasEnunciado solver = new InvertirPalabrasEnunciado();
        assertEquals("Java Mundo Hola", solver.invertir("Hola Mundo Java"));
    }
}
