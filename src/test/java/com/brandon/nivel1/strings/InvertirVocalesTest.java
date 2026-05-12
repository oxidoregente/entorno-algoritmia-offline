package com.brandon.nivel1.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
