package com.algoritmia.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumaDiagonalTest {

    @Test
    void testSumaDiagonal() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        SumaDiagonalEnunciado solver = new SumaDiagonalEnunciado();
        assertEquals(15, solver.sumar(matriz)); // 1 + 5 + 9 = 15
    }
}
