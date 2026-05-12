package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraDescuentosLealtadTest {

    @Test
    void testDescuentoLealtadYVolumen() {
        CalculadoraDescuentosLealtadEnunciado calc = new CalculadoraDescuentosLealtadEnunciado();
        
        // 1000 compra, 6 años (10% desc) -> 900
        assertEquals(900.0, calc.calcularPrecioFinal(1000.0, 6));
        
        // 2000 compra (>1000), 2 años (5% + 2% = 7%) -> 2000 - 140 = 1860
        assertEquals(1860.0, calc.calcularPrecioFinal(2000.0, 2));
    }
}
