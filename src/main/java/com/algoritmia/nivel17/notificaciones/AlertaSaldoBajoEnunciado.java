package com.algoritmia.nivel17.notificaciones;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Alerta de Saldo Bajo.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En aplicaciones financieras (bancos, wallets, exchanges)
 * detectar de inmediato saldos por debajo de un umbral
 * crítico es vital: permite al cliente evitar sobregiros,
 * comisiones y bloqueos. Este servicio evalúa el saldo de
 * un cliente tras cada movimiento y, si está por debajo de
 * $10, envía una alerta <b>urgente</b> por correo
 * electrónico.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Inyectar el servicio de email por constructor (forma recomendada, no
 *       {@code @Autowired} en campos).</li>
 *   <li>Definir la regla de negocio como una constante
 *       ({@code UMBRAL_SALDO_BAJO = 10.0}) para evitar números mágicos.</li>
 *   <li>Marcar el correo como {@code URGENTE} en el asunto o en el cuerpo para que el
 *       usuario lo identifique fácilmente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class AlertaSaldoBajoEnunciado {
 *     private static final double UMBRAL_SALDO_BAJO = 10.0;
 *     private final ServicioEmailEnunciado emailService;
 *
 *     public AlertaSaldoBajoEnunciado(ServicioEmailEnunciado emailService) {
 *         this.emailService = emailService;
 *     }
 *
 *     public void verificarYNotificar(String usuario, String correo, double saldo) {
 *         if (saldo &lt; UMBRAL_SALDO_BAJO) {
 *             emailService.enviarNotificacionSimple(
 *                 correo,
 *                 "[URGENTE] Saldo bajo",
 *                 "Hola " + usuario + ", tu saldo es $" + saldo);
 *         }
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para reglas con varios umbrales, considera una cadena de {@code if-else if} o un
 *       {@code Map&lt;Rango, Accion&gt;}.</li>
 *   <li>Si la notificación se vuelve masiva, cambia a un envío asíncrono (cola) para no
 *       bloquear el hilo principal.</li>
 * </ul>
 */
@Service
public class AlertaSaldoBajoEnunciado {

    private final ServicioEmailEnunciado emailService;

    public AlertaSaldoBajoEnunciado(ServicioEmailEnunciado emailService) {
        this.emailService = emailService;
    }

    /**
     * Evalúa el saldo del cliente y envía una alerta URGENTE por correo si
     * está por debajo del umbral crítico.
     *
     * @param usuario nombre del cliente, usado para personalizar el mensaje
     * @param correo  dirección de email del destinatario
     * @param saldo   saldo actual del cliente en la moneda correspondiente
     */
    public void verificarYNotificar(String usuario, String correo, double saldo) {
        // TODO: Si saldo < 10 -> Enviar email urgente
    }
}
