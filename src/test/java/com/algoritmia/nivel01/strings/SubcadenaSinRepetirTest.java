package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SubcadenaSinRepetirTest {

    @Test
    void testLongitudMax() {
        SubcadenaSinRepetirEnunciado solver = new SubcadenaSinRepetirEnunciado();
        assertEquals(3, solver.longitudMax("abcabcbb"));
        assertEquals(1, solver.longitudMax("bbbbb"));
        assertEquals(3, solver.longitudMax("pwwkew"));
    }
}
