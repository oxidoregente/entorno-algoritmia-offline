package com.algoritmia.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NumeroFaltanteTest {

    @Test
    void testEncontrarFaltanteEstandar() {
        NumeroFaltanteEnunciado solver = new NumeroFaltanteEnunciado();
        assertEquals(2, solver.encontrarFaltante(new int[]{3, 0, 1}));
        assertEquals(8, solver.encontrarFaltante(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    void testEncontrarFaltanteCasoLimite() {
        NumeroFaltanteEnunciado solver = new NumeroFaltanteEnunciado();
        assertEquals(1, solver.encontrarFaltante(new int[]{0}));
    }
}
