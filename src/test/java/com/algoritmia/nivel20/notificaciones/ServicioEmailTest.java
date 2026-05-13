package com.algoritmia.nivel20.notificaciones;

import org.junit.jupiter.api.Test;

class ServicioEmailTest {

    @Test
    void testEnvioEmailSimulado() {
        ServicioEmailEnunciado servicio = new ServicioEmailEnunciado();
        servicio.enviarNotificacionSimple("test@mail.com", "Test", "Mensaje");
        // Por ahora es un test de ejecución (smoke test) ya que es simulado
    }
}
