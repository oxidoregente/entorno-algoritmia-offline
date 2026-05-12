package com.brandon.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraEnviosInternacionalesTest {

    @Test
    void testEnvioLigero() {
        CalculadoraEnviosInternacionalesEnunciado calc = new CalculadoraEnviosInternacionalesEnunciado();
        // 10kg en AMERICA_SUR = 10 * 10 = 100
        assertEquals(100.0, calc.calcularCosto(10.0, "AMERICA_SUR"));
    }

    @Test
    void testEnvioPesadoConRecargo() {
        CalculadoraEnviosInternacionalesEnunciado calc = new CalculadoraEnviosInternacionalesEnunciado();
        // 25kg en EUROPA = (25 * 20) + 50 = 550
        assertEquals(550.0, calc.calcularCosto(25.0, "EUROPA"));
    }
}
