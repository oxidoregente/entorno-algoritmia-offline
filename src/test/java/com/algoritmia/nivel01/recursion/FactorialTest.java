package com.algoritmia.nivel01.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testFactorialEstandar() {
        FactorialEnunciado f = new FactorialEnunciado();
        assertEquals(1, f.calcular(0));
        assertEquals(1, f.calcular(1));
        assertEquals(120, f.calcular(5));
        assertEquals(720, f.calcular(6));
    }

    @Test
    void testFactorialGrande() {
        FactorialEnunciado f = new FactorialEnunciado();
        assertEquals(3628800, f.calcular(10));
    }
}
