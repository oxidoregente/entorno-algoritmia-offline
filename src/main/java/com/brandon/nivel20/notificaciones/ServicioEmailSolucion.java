package com.brandon.nivel20.notificaciones;

/**
 * SOLUCIÓN: Servicio de Notificaciones.
 */
public class ServicioEmailSolucion {

    public void enviarNotificacionSimple(String para, String asunto, String texto) {
        System.out.println(">> [EMAIL] Para: " + para + " | Asunto: " + asunto);
        System.out.println(">> [EMAIL] " + texto);
    }
}
