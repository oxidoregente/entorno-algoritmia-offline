package com.algoritmia.nivel02.logica;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.logica.ValidadorFraudeEnunciado.Transaccion;

/**
 * Test para ejercicio de Validador de Fraude.
 * Valida detección de transacciones sospechosas por monto y hora.
 */
class ValidadorFraudeTest {

    @Test
    void testDeteccionPorMonto() {
        ValidadorFraudeEnunciado validador = new ValidadorFraudeEnunciado();
        Transaccion t = new Transaccion("T1", 6000.0, LocalTime.of(14, 0));
        assertTrue(validador.esSospechosa(t));
    }

    @Test
    void testDeteccionPorHora() {
        ValidadorFraudeEnunciado validador = new ValidadorFraudeEnunciado();
        Transaccion t = new Transaccion("T2", 100.0, LocalTime.of(3, 0));
        assertTrue(validador.esSospechosa(t));
    }

    @Test
    void testTransaccionSegura() {
        ValidadorFraudeEnunciado validador = new ValidadorFraudeEnunciado();
        Transaccion t = new Transaccion("T3", 100.0, LocalTime.of(14, 0));
        assertFalse(validador.esSospechosa(t));
    }
}
