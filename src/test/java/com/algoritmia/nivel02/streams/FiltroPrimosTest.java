package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class FiltroPrimosTest {

    @Test
    void testFiltroDePrimos() {
        FiltroPrimosEnunciado solver = new FiltroPrimosEnunciado();
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> resultado = solver.filtrar(numeros);
        
        // assertEquals(List.of(2, 3, 5, 7), resultado);
    }
}
