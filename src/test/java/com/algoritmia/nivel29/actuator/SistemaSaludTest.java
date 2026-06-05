package com.algoritmia.nivel29.actuator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Sistema de Salud (Actuator).
 * Valida endpoints de health check.
 */
class SistemaSaludTest {

    @Test
    void testEstadoSalud() {
        SistemaSaludEnunciado indicador = new SistemaSaludEnunciado();
        Health h = indicador.health();
        assertNotNull(h);
    }
}
