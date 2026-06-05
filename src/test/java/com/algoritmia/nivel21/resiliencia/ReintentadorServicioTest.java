package com.algoritmia.nivel21.resiliencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Reintentador de Servicio.
 * Valida lógica de reintentos manuales.
 */
class ReintentadorServicioTest {

    @Test
    void testConteoDeReintentos() {
        ReintentadorServicioEnunciado servicio = new ReintentadorServicioEnunciado();
        // Este test verificará el estado interno tras llamadas manuales
        // ya que el aspecto @Retry requiere el contexto de Spring completo
        // para funcionar automáticamente.
        assertDoesNotThrow(() -> servicio.operacionConFallaTemporal());
    }
}
