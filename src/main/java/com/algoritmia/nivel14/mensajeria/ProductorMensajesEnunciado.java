package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Productor de Mensajes.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Envía eventos a una cola de RabbitMQ para ser procesados de forma
 * asíncrona por un consumidor. Este servicio actúa como punto de entrada
 * de la mensajería asíncrona del sistema: el resto del flujo
 * (consumidores, reenviadores, etc.) se desacopla gracias al broker.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>El nombre de la cola destino está en
 *       {@link ConfiguracionRabbit#COLA_AUDITORIA}: úsalo, no lo hardcodees.</li>
 *   <li>Envía los mensajes con {@link RabbitTemplate#convertAndSend(String, Object)}.</li>
 *   <li>Si en el futuro se usan exchanges distintos al por defecto, pasa el
 *       nombre del exchange como primer argumento.</li>
 *   <li>Mantén la inyección por constructor y el campo {@code final}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * productor.enviarEvento("Urgente: login caído");
 * productor.enviarEvento("Usuario registrado correctamente");
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code rabbitTemplate.convertAndSend("auditoria", mensaje)} usa el
 *       exchange por defecto y enrutará a la cola {@code "auditoria"}.</li>
 *   <li>En un sistema real, el mensaje suele ser un DTO serializado (por
 *       ejemplo un {@code record}) en lugar de un simple {@link String}.</li>
 *   <li>Considera añadir un manejo de errores con {@code @Recover} o un
 *       <i>dead letter queue</i> para reintentos.</li>
 * </ul>
 */
@Service
public class ProductorMensajesEnunciado {

    private final RabbitTemplate rabbitTemplate;

    /**
     * Constructor con inyección de dependencias (sin {@code @Autowired} en
     * campos).
     *
     * @param rabbitTemplate template de Spring AMQP para enviar mensajes a
     *                       RabbitMQ.
     */
    public ProductorMensajesEnunciado(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Envía un mensaje a la cola de auditoría de RabbitMQ.
     *
     * @param mensaje contenido del evento a enviar.
     */
    public void enviarEvento(String mensaje) {
        // TODO: Enviar el mensaje a la cola definida en ConfiguracionRabbit.COLA_AUDITORIA
    }
}
