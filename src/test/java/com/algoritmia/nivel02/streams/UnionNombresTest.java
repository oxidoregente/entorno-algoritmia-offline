package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Unión de Nombres.
 * Valida unión de nombres en mayúsculas separados por comas.
 */
class UnionNombresTest {

    @Test
    void testUnionDeNombres() {
        UnionNombresEnunciado solver = new UnionNombresEnunciado();
        assertEquals("BRANDON, ANA, CARLOS", solver.unir(List.of("brandon", "ana", "carlos")));
    }
}
