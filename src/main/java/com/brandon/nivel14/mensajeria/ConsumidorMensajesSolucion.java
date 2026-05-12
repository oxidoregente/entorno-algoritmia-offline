package com.brandon.nivel14.mensajeria;

import com.brandon.nivel20.notificaciones.ServicioEmailEnunciado;

/**
 * SOLUCIÓN: Consumidor de Mensajes.
 */
public class ConsumidorMensajesSolucion {

    private final ServicioEmailEnunciado servicioEmail;

    public ConsumidorMensajesSolucion(ServicioEmailEnunciado servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    public void recibirMensaje(String mensaje) {
        servicioEmail.enviarNotificacionSimple("admin@ingenieria.com", "Evento", mensaje);
    }
}
