package com.algoritmia.nivel02.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.logica.CalculadoraSuscripcionEnunciado.*;

/**
 * Test para ejercicio de Calculadora de Suscripción.
 * Valida cálculo de costos por plan y período.
 */
class CalculadoraSuscripcionTest {

    @Test
    void testCostoMensual() {
        CalculadoraSuscripcionEnunciado calc = new CalculadoraSuscripcionEnunciado();
        assertEquals(20.0, calc.calcularCosto(Plan.PRO, Periodo.MENSUAL));
    }

    @Test
    void testCostoAnualConDescuento() {
        CalculadoraSuscripcionEnunciado calc = new CalculadoraSuscripcionEnunciado();
        // PREMIUM: 50 * 12 = 600. Con 10% desc = 540
        assertEquals(540.0, calc.calcularCosto(Plan.PREMIUM, Periodo.ANUAL));
    }
}
