package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PrimerUnicoTest {

    @Test
    void testPrimerUnicoExistente() {
        PrimerUnicoEnunciado solver = new PrimerUnicoEnunciado();
        assertEquals(0, solver.encontrar("leetcode"));
        assertEquals(2, solver.encontrar("loveleetcode"));
    }

    @Test
    void testPrimerUnicoNoExistente() {
        PrimerUnicoEnunciado solver = new PrimerUnicoEnunciado();
        assertEquals(-1, solver.encontrar("aabb"));
    }
}
