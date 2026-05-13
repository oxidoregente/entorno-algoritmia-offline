package com.algoritmia.nivel01.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumaRecursivaDigitosTest {

    @Test
    void testSumaDigitos() {
        SumaRecursivaDigitosEnunciado solver = new SumaRecursivaDigitosEnunciado();
        assertEquals(6, solver.sumar(123));
        assertEquals(10, solver.sumar(505));
    }
}
