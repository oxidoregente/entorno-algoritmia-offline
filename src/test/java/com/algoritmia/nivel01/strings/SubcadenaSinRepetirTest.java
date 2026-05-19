package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Subcadena Sin Repetir.
 * Valida longitud máxima de subcadena sin caracteres repetidos.
 */
class SubcadenaSinRepetirTest {

    @Test
    void testLongitudMax() {
        SubcadenaSinRepetirEnunciado solver = new SubcadenaSinRepetirEnunciado();
        assertEquals(3, solver.longitudMax("abcabcbb"));
        assertEquals(1, solver.longitudMax("bbbbb"));
        assertEquals(3, solver.longitudMax("pwwkew"));
    }
}
