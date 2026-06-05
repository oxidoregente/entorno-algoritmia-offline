package com.algoritmia.nivel17.notificaciones;

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
 * <p>Los correos transaccionales rara vez son solo texto:
 * facturas en PDF, recibos, constancias, contratos escaneados,
 * informes en CSV. Spring lo resuelve mediante
 * {@link MimeMessageHelper}, que permite componer un mensaje
 * MIME multiparte con cuerpo, adjuntos e imágenes inline.
 * Esta clase envía un PDF adjunto a la dirección indicada.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Crear el mensaje con {@code mailSender.createMimeMessage()} y envolverlo con
 *       {@link MimeMessageHelper} en modo {@code multipart=true}.</li>
 *   <li>Usar {@code helper.addAttachment("nombre.pdf", new File(ruta))} para adjuntar
 *       un archivo del sistema de archivos.</li>
 *   <li>Para adjuntar un {@code byte[]}, se usa la sobrecarga
 *       {@code addAttachment(nombre, ByteArrayDataSource, mimeType)}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class AttachmentEmailEnunciado {
 *     private final JavaMailSender mailSender;
 *
 *     public AttachmentEmailEnunciado(JavaMailSender mailSender) {
 *         this.mailSender = mailSender;
 *     }
 *
 *     public void enviarConAdjunto(String to, String rutaArchivo) throws Exception {
 *         MimeMessage message = mailSender.createMimeMessage();
 *         MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
 *         helper.setTo(to);
 *         helper.setSubject("Tu factura");
 *         helper.setText("Adjuntamos la factura solicitada.");
 *         helper.addAttachment("factura.pdf", new File(rutaArchivo));
 *         mailSender.send(message);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Verifica que la ruta del archivo existe y es legible antes de llamar a
 *       {@code addAttachment} para evitar {@code FileNotFoundException} silenciosa.</li>
 *   <li>Si el adjunto pesa más de 10 MB, considera comprimirlo o enviarlo como enlace de
 *       descarga en lugar de adjuntarlo.</li>
 * </ul>
 */
@Service
public class AttachmentEmailEnunciado {

    private final JavaMailSender mailSender;

    public AttachmentEmailEnunciado(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Envía un correo electrónico con un archivo PDF adjunto.
     *
     * @param to          dirección de correo del destinatario
     * @param rutaArchivo ruta absoluta del archivo a adjuntar (ej. factura PDF)
     * @throws Exception si falla la creación del mensaje MIME o el envío
     */
    public void enviarConAdjunto(String to, String rutaArchivo) throws Exception {
        // TODO: Usa helper.addAttachment("factura.pdf", new File(rutaArchivo))
    }
}
