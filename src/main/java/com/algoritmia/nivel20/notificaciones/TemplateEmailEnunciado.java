package com.algoritmia.nivel20.notificaciones;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Emails con HTML y Plantillas.
 * <b>Dificultad: Media</b>
 * 
 * <p>Los correos de texto plano son aburridos. Aprende a enviar correos 
 * con formato HTML profesional.</p>
 */
@Service
public class TemplateEmailEnunciado {

    private final JavaMailSender mailSender;

    public TemplateEmailEnunciado(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarHtml(String to, String contenidoHtml) throws Exception {
        // TODO: Usa mailSender.createMimeMessage() y MimeMessageHelper 
        // con el parámetro multipart en true.
    }
}
