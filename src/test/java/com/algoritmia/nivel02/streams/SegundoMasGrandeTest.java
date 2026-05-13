package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SegundoMasGrandeTest {

    @Test
    void testSegundoMasGrande() {
        SegundoMasGrandeEnunciado solver = new SegundoMasGrandeEnunciado();
        assertEquals(9, solver.encontrar(List.of(1, 5, 10, 3, 9, 10, 8)));
    }
}
