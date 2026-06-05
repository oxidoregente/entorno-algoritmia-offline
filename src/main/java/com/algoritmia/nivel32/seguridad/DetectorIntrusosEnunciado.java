package com.algoritmia.nivel32.seguridad;

import com.algoritmia.nivel04.repositorios.LogAccesoEnunciado;
import com.algoritmia.nivel04.repositorios.LogAccesoRepositoryEnunciado;
import com.algoritmia.nivel20.notificaciones.ServicioEmailEnunciado;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Detector de Intrusos Proactivo.
 * <b>Dificultad: Media</b>
 *
 * <p>Más allá del firewall perimetral, una buena estrategia de seguridad analiza los
 * logs de acceso en busca de patrones sospechosos (IPs desconocidas que acumulan
 * muchos accesos, intentos de login desde geografías raras, etc.). Este detector
 * revisa los accesos desde una IP marcada como sospechosa y, si superan un umbral,
 * dispara una alerta por correo al equipo de seguridad para su revisión.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>La clase es un <code>&#64;Service</code> inyectado por constructor (sin <code>&#64;Autowired</code> en campos).</li>
 *   <li>Consulta el repositorio de accesos y filtra por la IP sospechosa (p. ej. <code>192.168.66.6</code>).</li>
 *   <li>Si el número de accesos supera el umbral (>3), envía una notificación con el servicio de email.</li>
 *   <li>El método debe ser idempotente y no lanzar excepciones que bloqueen el flujo de análisis principal.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;LogAccesoEnunciado&gt; accesos = repository.findByIp(IP_SOSPECHOSA);
 * if (accesos.size() &gt; 3) {
 *     emailService.enviarNotificacionSimple(
 *         "soc@empresa.com",
 *         "Alerta: accesos sospechosos desde " + IP_SOSPECHOSA);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Define la IP sospechosa como una constante para reutilizarla en tests.</li>
 *   <li>Encapsula el <code>emailService.enviarNotificacionSimple(...)</code> en un bloque <code>try/catch</code> para no abortar el análisis si el SMTP falla.</li>
 *   <li>Si más adelante quieres hacerlo en tiempo real, planifica sustituir la consulta batch por un consumer de Kafka/RabbitMQ.</li>
 * </ul>
 */
@Service
public class DetectorIntrusosEnunciado {

    private final LogAccesoRepositoryEnunciado repository;
    private final ServicioEmailEnunciado emailService;

    public DetectorIntrusosEnunciado(LogAccesoRepositoryEnunciado repository,
                                     ServicioEmailEnunciado emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    /**
     * Analiza los logs de acceso y envía una alerta por email si detecta
     * una actividad sospechosa (más de 3 accesos desde la IP marcada).
     */
    public void analizarAmenazas() {
        // TODO: Filtra los logs de la IP peligrosa
        // TODO: Si count > 3, llama a emailService.enviarNotificacionSimple()
    }
}
