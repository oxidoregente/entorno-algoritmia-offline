package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Segundo Más Grande.
 * Valida encontrar el segundo elemento más grande en una lista.
 */
class SegundoMasGrandeTest {

    @Test
    void testSegundoMasGrande() {
        SegundoMasGrandeEnunciado solver = new SegundoMasGrandeEnunciado();
        assertEquals(9, solver.encontrar(List.of(1, 5, 10, 3, 9, 10, 8)));
    }
}
