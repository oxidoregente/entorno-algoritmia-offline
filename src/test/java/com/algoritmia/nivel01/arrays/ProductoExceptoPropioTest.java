package com.algoritmia.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class ProductoExceptoPropioTest {

    @Test
    void testProductoExceptoPropio() {
        ProductoExceptoPropioEnunciado solver = new ProductoExceptoPropioEnunciado();
        int[] entrada = {1, 2, 3, 4};
        int[] esperado = {24, 12, 8, 6};
        assertArrayEquals(esperado, solver.calcular(entrada));
    }
}
