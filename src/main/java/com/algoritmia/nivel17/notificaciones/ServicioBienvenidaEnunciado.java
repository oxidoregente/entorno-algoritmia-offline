package com.algoritmia.nivel17.notificaciones;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Bienvenida a Clientes.
 * <b>Dificultad: Media</b>
 *
 * <p>El correo de bienvenida es la primera impresión digital
 * de cualquier producto SaaS, banco digital o marketplace.
 * Un mensaje cálido y bien diseñado reduce el churn,
 * refuerza la marca y acompaña al usuario en sus primeros
 * pasos. Este servicio recibe los datos básicos del
 * nuevo cliente y delega el envío en
 * {@link ServicioEmailEnunciado}.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Centralizar el envío en un servicio común ({@code ServicioEmailEnunciado})
 *       evita duplicar configuración SMTP en cada notificación.</li>
 *   <li>Personalizar el saludo con el nombre del usuario mejora la tasa de apertura.</li>
 *   <li>Incluir enlaces relevantes (tour del producto, soporte, redes sociales) en
 *       el cuerpo para guiar al usuario.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class ServicioBienvenidaEnunciado {
 *     private final ServicioEmailEnunciado emailService;
 *
 *     public ServicioBienvenidaEnunciado(ServicioEmailEnunciado emailService) {
 *         this.emailService = emailService;
 *     }
 *
 *     public void darBienvenida(String usuario, String correo) {
 *         String asunto = "Bienvenido a bordo, " + usuario;
 *         String cuerpo = "Hola " + usuario + ",\n\n" +
 *                 "¡Gracias por unirte! Estamos felices de tenerte aquí.\n\n" +
 *                 "Equipo de Producto";
 *         emailService.enviarNotificacionSimple(correo, asunto, cuerpo);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para mensajes largos o con formato, considera migrar a
 *       {@code enviarConPlantilla} (ver {@link TemplateEmailEnunciado}) usando Thymeleaf.</li>
 *   <li>Guarda en logs la confirmación del envío para auditoría de onboarding.</li>
 * </ul>
 */
@Service
public class ServicioBienvenidaEnunciado {

    private final ServicioEmailEnunciado emailService;

    public ServicioBienvenidaEnunciado(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    /**
     * Envía un correo de bienvenida personalizado al nuevo cliente.
     *
     * @param usuario nombre del nuevo cliente, usado para personalizar el saludo
     * @param correo  dirección de email a la que se envía la bienvenida
     */
    public void darBienvenida(String usuario, String correo) {
        // TODO: Construye un asunto "Bienvenido a bordo, {usuario}"
        // TODO: Construye un cuerpo de mensaje estándar
        // TODO: Llama a emailService.enviarNotificacionSimple
    }
}
