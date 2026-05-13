package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConversorMonedasTest {

    @Test
    void testConversionSimple() {
        ConversorMonedasEnunciado conversor = new ConversorMonedasEnunciado();
        // 100 USD a EUR (0.92 rate) -> 92.0
        assertEquals(92.0, conversor.convertir(100.0, "USD", "EUR"));
    }

    @Test
    void testErrorMonedaInvalida() {
        ConversorMonedasEnunciado conversor = new ConversorMonedasEnunciado();
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.convertir(10.0, "YEN", "USD");
        });
    }
}
