package com.brandon.nivel1.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testResolverTwoSum() {
        TwoSumEnunciado solver = new TwoSumEnunciado();
        int[] entrada = {2, 7, 11, 15};
        int objetivo = 9;
        int[] resultadoEsperado = {0, 1};

        int[] resultadoReal = solver.resolver(entrada, objetivo);

        assertArrayEquals(resultadoEsperado, resultadoReal);
    }
}
