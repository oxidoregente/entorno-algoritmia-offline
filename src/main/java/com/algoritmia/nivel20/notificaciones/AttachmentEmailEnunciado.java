package com.algoritmia.nivel20.notificaciones;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;
import java.io.File;

/**
 * 🎓 RETO: Emails con Archivos Adjuntos.
 * <b>Dificultad: Media</b>
 * 
 * <p>Aprende a enviar documentos (ej: facturas PDF) como adjuntos en 
 * tus notificaciones por correo.</p>
 */
@Service
public class AttachmentEmailEnunciado {

    private final JavaMailSender mailSender;

    public AttachmentEmailEnunciado(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarConAdjunto(String to, String rutaArchivo) throws Exception {
        // TODO: Usa helper.addAttachment("factura.pdf", new File(rutaArchivo))
    }
}
