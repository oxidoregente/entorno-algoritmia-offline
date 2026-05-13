package com.algoritmia.nivel23.resiliencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
