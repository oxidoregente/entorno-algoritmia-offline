package com.brandon.nivel15;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.health.Health;
import static org.junit.jupiter.api.Assertions.*;

class SistemaSaludTest {

    @Test
    void testEstadoSalud() {
        SistemaSaludEnunciado indicador = new SistemaSaludEnunciado();
        // Health h = indicador.health();
        // assertNotNull(h);
    }
}
