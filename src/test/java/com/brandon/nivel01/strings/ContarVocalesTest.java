package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ContarVocalesTest {

    @Test
    void testConteoVocales() {
        ContarVocalesEnunciado solver = new ContarVocalesEnunciado();
        assertEquals(5, solver.contar("Hola Mundo"));
        assertEquals(3, solver.contar("Java"));
    }
}
