package com.brandon.nivel20.notificaciones;

/**
 * 🏆 SOLUCIÓN: Servicio de Bienvenida a Clientes.
 */
public class ServicioBienvenidaSolucion {

    private final ServicioEmailEnunciado emailService;

    public ServicioBienvenidaSolucion(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    public void darBienvenida(String usuario, String correo) {
        String asunto = "Bienvenido a bordo, " + usuario;
        String cuerpo = "Hola " + usuario + ", gracias por unirte a nuestro laboratorio.";
        emailService.enviarNotificacionSimple(correo, asunto, cuerpo);
    }
}
