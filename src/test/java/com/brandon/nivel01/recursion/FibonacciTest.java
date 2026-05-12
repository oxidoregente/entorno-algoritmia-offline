package com.brandon.nivel01.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void testCasosBase() {
        FibonacciEnunciado f = new FibonacciEnunciado();
        assertEquals(0, f.calcular(0));
        assertEquals(1, f.calcular(1));
    }

    @Test
    void testFibonacciQuintoTermino() {
        FibonacciEnunciado f = new FibonacciEnunciado();
        // 0, 1, 1, 2, 3, 5
        assertEquals(5, f.calcular(5));
    }

    @Test
    void testFibonacciDecimoTermino() {
        FibonacciEnunciado f = new FibonacciEnunciado();
        assertEquals(55, f.calcular(10));
    }
}
