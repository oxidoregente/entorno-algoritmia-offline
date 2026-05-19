package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Primer Carácter Único.
 * Encuentra el primer carácter que no se repite en una cadena.
 */
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
