package com.brandon.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class UnionNombresTest {

    @Test
    void testUnionDeNombres() {
        UnionNombresEnunciado solver = new UnionNombresEnunciado();
        assertEquals("BRANDON, ANA, CARLOS", solver.unir(List.of("brandon", "ana", "carlos")));
    }
}
