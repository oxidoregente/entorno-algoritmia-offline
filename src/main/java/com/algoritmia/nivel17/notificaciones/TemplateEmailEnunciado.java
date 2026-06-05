package com.algoritmia.nivel17.notificaciones;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import jakarta.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Emails con HTML y Plantillas.
 * <b>Dificultad: Media</b>
 *
 * <p>Un correo en texto plano se siente genérico. Para
 * newsletters, confirmaciones de compra o reportes, es
 * habitual enviar <b>HTML</b> con branding, tablas e
 * imágenes. Spring lo habilita con
 * {@link MimeMessageHelper} en modo {@code multipart=true}
 * y el argumento {@code html=true} al establecer el
 * contenido. Combinado con Thymeleaf o FreeMarker, permite
 * plantillas reutilizables y mantenibles.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Crear un {@link MimeMessage} con {@code mailSender.createMimeMessage()}.</li>
 *   <li>Inicializar el helper con {@code MimeMessageHelper(message, true, "UTF-8")} para
 *       soportar adjuntos y multibyte.</li>
 *   <li>Establecer el cuerpo con {@code helper.setText(html, true)}; el segundo parámetro
 *       {@code true} indica que el contenido es HTML.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class TemplateEmailEnunciado {
 *     private final JavaMailSender mailSender;
 *
 *     public TemplateEmailEnunciado(JavaMailSender mailSender) {
 *         this.mailSender = mailSender;
 *     }
 *
 *     public void enviarHtml(String to, String contenidoHtml) throws Exception {
 *         MimeMessage message = mailSender.createMimeMessage();
 *         MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
 *         helper.setTo(to);
 *         helper.setSubject("Tu reporte mensual");
 *         helper.setText(contenidoHtml, true); // true =&gt; interpreta como HTML
 *         mailSender.send(message);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si usas Thymeleaf, inyecta el {@code TemplateEngine} y procesa la plantilla con
 *       {@code context.getTemplate("email/hola").process(ctx, stringWriter)}.</li>
 *   <li>Para imágenes inline (logos), usa
 *       {@code helper.addInline("logo", new ClassPathResource("static/logo.png"))}.</li>
 * </ul>
 */
@Service
public class TemplateEmailEnunciado {

    private final JavaMailSender mailSender;

    public TemplateEmailEnunciado(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Envía un correo con contenido HTML al destinatario indicado.
     *
     * @param to            dirección de correo del destinatario
     * @param contenidoHtml cuerpo del mensaje en formato HTML
     * @throws Exception si falla la creación del mensaje MIME o el envío
     */
    public void enviarHtml(String to, String contenidoHtml) throws Exception {
        // TODO: Usa mailSender.createMimeMessage() y MimeMessageHelper
        // con el parámetro multipart en true.
    }
}
