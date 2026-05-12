package com.brandon.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EncontrarDuplicadoTest {

    @Test
    void testDuplicadoEstandar() {
        EncontrarDuplicadoEnunciado solver = new EncontrarDuplicadoEnunciado();
        assertEquals(2, solver.buscar(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    void testDuplicadoAlFinal() {
        EncontrarDuplicadoEnunciado solver = new EncontrarDuplicadoEnunciado();
        assertEquals(3, solver.buscar(new int[]{3, 1, 3, 4, 2}));
    }
}
