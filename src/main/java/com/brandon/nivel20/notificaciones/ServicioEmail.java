package com.brandon.nivel20.notificaciones;

import org.springframework.stereotype.Service;

/**
 * Nivel 20: Notificaciones Automatizadas.
 * 
 * <p>Servicio encargado de enviar correos electrónicos de notificación.</p>
 */
@Service
public class ServicioEmail {

    // Nota: Temporalmente simplificado debido a conflictos de dependencias en el entorno local.
    // En un entorno real, se usaría JavaMailSender de spring-boot-starter-mail.

    public ServicioEmail() {
    }

    public void enviarNotificacionSimple(String para, String asunto, String texto) {
        System.out.println(">> [EMAIL] Preparando envío para: " + para);
        System.out.println(">> [EMAIL] Asunto: " + asunto);
        System.out.println(">> [EMAIL] Contenido: " + texto);
        
        System.out.println("<< [EMAIL] Notificación enviada exitosamente (Simulado).");
    }
}
