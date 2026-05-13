package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class CalculadoraIVATest {

    @Test
    void testCalculoIVA() {
        CalculadoraIVAEnunciado calc = new CalculadoraIVAEnunciado();
        List<Double> precios = List.of(100.0, 200.0);
        // (100 * 1.21) + (200 * 1.21) = 121 + 242 = 363
        assertEquals(363.0, calc.calcularTotalConIVA(precios), 0.001);
    }
}
