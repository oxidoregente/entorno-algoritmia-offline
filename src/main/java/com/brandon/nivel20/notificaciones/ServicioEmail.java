package com.brandon.nivel20.notificaciones;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Nivel 20: Notificaciones Automatizadas.
 * 
 * <p>Servicio encargado de enviar correos electrónicos de notificación.</p>
 */
@Service
public class ServicioEmail {

    // Nota: Para que funcione realmente, se debe configurar un host SMTP en application.properties
    // Por ahora, simulamos el envío registrando la acción en los logs.
    private final JavaMailSender mailSender;

    public ServicioEmail(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarNotificacionSimple(String para, String asunto, String texto) {
        System.out.println(">> [EMAIL] Preparando envío para: " + para);
        System.out.println(">> [EMAIL] Asunto: " + asunto);
        System.out.println(">> [EMAIL] Contenido: " + texto);
        
        /* 
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(para);
        mensaje.setSubject(asunto);
        mensaje.setText(texto);
        mailSender.send(mensaje);
        */
        
        System.out.println("<< [EMAIL] Notificación enviada exitosamente (Simulado).");
    }
}
