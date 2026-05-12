package com.brandon.nivel02.streams;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class BuscadorVocalTest {

    @Test
    void testBusquedaExitosa() {
        BuscadorVocalEnunciado buscador = new BuscadorVocalEnunciado();
        assertTrue(buscador.existePalabraConA(List.of("casa", "Árbol", "perro")));
    }

    @Test
    void testBusquedaFallida() {
        BuscadorVocalEnunciado buscador = new BuscadorVocalEnunciado();
        assertFalse(buscador.existePalabraConA(List.of("casa", "elefante", "perro")));
    }
}
