package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel03.servicios.CalculadoraNominaEnunciado.Deduccion;

class CalculadoraNominaTest {

    @Test
    void testCalculoNetoEstandar() {
        CalculadoraNominaEnunciado calc = new CalculadoraNominaEnunciado();
        List<Deduccion> deducciones = List.of(
            new Deduccion("Salud", 50.0),
            new Deduccion("Pension", 50.0)
        );

        // 1000 base + (20 * 5) extras = 1100 - 100 deducciones = 1000 neto
        double resultado = calc.calcularNeto(1000.0, 20.0, 5, deducciones);
        assertEquals(1000.0, resultado);
    }

    @Test
    void testDeduccionesExcesivas() {
        CalculadoraNominaEnunciado calc = new CalculadoraNominaEnunciado();
        List<Deduccion> deducciones = List.of(new Deduccion("Deuda", 600.0));

        // 1000 base - 600 deduccion = 400 neto (< 500 que es el 50%)
        assertThrows(RuntimeException.class, () -> {
            calc.calcularNeto(1000.0, 0, 0, deducciones);
        });
    }
}
