package com.algoritmia.nivel01.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Suma Recursiva de Dígitos.
 * Valida suma de dígitos de un número de forma recursiva.
 */
class SumaRecursivaDigitosTest {

    @Test
    void testSumaDigitos() {
        SumaRecursivaDigitosEnunciado solver = new SumaRecursivaDigitosEnunciado();
        assertEquals(6, solver.sumar(123));
        assertEquals(10, solver.sumar(505));
    }
}
