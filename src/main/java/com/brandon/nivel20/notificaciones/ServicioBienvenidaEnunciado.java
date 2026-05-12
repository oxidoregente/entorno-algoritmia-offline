package com.brandon.nivel20.notificaciones;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Bienvenida a Clientes.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que envíe un correo de bienvenida.</p>
 */
@Service
public class ServicioBienvenidaEnunciado {

    private final ServicioEmailEnunciado emailService;

    public ServicioBienvenidaEnunciado(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    public void darBienvenida(String usuario, String correo) {
        // TODO: Construye un asunto "Bienvenido a bordo, {usuario}"
        // TODO: Construye un cuerpo de mensaje estándar
        // TODO: Llama a emailService.enviarNotificacionSimple
    }
}
