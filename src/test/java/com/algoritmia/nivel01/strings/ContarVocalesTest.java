package com.algoritmia.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para el ejercicio de Contar Vocales.
 * Cuenta las vocales (mayúsculas y minúsculas) en un texto.
 */
class ContarVocalesTest {

    @Test
    void testConteoVocales() {
        ContarVocalesEnunciado solver = new ContarVocalesEnunciado();
        assertEquals(5, solver.contar("Hola Mundo"));
        assertEquals(3, solver.contar("Java"));
    }
}
