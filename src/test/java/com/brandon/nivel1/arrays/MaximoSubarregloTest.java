package com.brandon.nivel1.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para validar MaximoSubarregloEnunciado.
 */
class MaximoSubarregloTest {

    @Test
    void testSumaMaximaEstandar() {
        MaximoSubarregloEnunciado solver = new MaximoSubarregloEnunciado();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Act & Assert
        assertEquals(6, solver.encontrarSumaMaxima(nums), "La suma máxima de [-2, 1, -3, 4, -1, 2, 1, -5, 4] debe ser 6");
    }

    @Test
    void testSumaMaximaUnSoloElemento() {
        MaximoSubarregloEnunciado solver = new MaximoSubarregloEnunciado();
        int[] nums = {1};
        assertEquals(1, solver.encontrarSumaMaxima(nums));
    }

    @Test
    void testSumaMaximaTodoNegativos() {
        MaximoSubarregloEnunciado solver = new MaximoSubarregloEnunciado();
        int[] nums = {-5, -1, -8, -2};
        assertEquals(-1, solver.encontrarSumaMaxima(nums), "Debe devolver el número menos negativo");
    }
}
