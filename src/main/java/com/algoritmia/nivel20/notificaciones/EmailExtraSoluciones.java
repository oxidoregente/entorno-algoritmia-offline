package com.algoritmia.nivel20.notificaciones;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.internet.MimeMessage;
import java.io.File;

/**
 * 🏆 SOLUCIONES: Email HTML y Adjuntos.
 */
public class EmailExtraSoluciones {

    private final JavaMailSender mailSender = null; // Inyectado

    public void enviarHtml(String to, String contenidoHtml) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo(to);
        helper.setSubject("Bienvenido");
        helper.setText(contenidoHtml, true);
        mailSender.send(message);
    }

    public void enviarConAdjunto(String to, String rutaArchivo) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.addAttachment("factura.pdf", new File(rutaArchivo));
        mailSender.send(message);
    }
}
