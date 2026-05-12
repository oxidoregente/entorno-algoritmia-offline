package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ComprimirStringTest {

    @Test
    void testCompresionExitosa() {
        ComprimirStringEnunciado solver = new ComprimirStringEnunciado();
        assertEquals("a2b1c5a3", solver.comprimir("aabcccccaaa"));
    }

    @Test
    void testDevolverOriginalSiNoEsMenor() {
        ComprimirStringEnunciado solver = new ComprimirStringEnunciado();
        assertEquals("abcd", solver.comprimir("abcd"));
    }
}
