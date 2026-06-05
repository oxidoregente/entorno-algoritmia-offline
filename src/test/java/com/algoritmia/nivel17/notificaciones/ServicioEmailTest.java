package com.algoritmia.nivel17.notificaciones;

import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Servicio de Email.
 * Valida envío de emails simulados.
 */
class ServicioEmailTest {

    @Test
    void testEnvioEmailSimulado() {
        ServicioEmailEnunciado servicio = new ServicioEmailEnunciado();
        servicio.enviarNotificacionSimple("test@mail.com", "Test", "Mensaje");
        // Por ahora es un test de ejecución (smoke test) ya que es simulado
    }
}
