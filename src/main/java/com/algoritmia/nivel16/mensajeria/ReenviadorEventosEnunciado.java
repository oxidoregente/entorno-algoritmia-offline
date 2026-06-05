package com.algoritmia.nivel16.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Reenviador de Eventos (Pipe).
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un servicio que actúe como un "pasamanos" (proxy) dentro
 * del flujo de RabbitMQ. Recibe un mensaje, le añade un prefijo
 * {@code "[PROCESADO]"} y lo reenvía a la misma cola de auditoría. Este
 * patrón es útil para encadenar etapas de procesamiento o para registrar
 * el paso por un nodo concreto.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>El método <b>no</b> debe consumir la cola con {@code @RabbitListener}:
 *       es un servicio plano invocado por otros componentes (o
 *       inyectado en un consumidor).</li>
 *   <li>Usa {@link RabbitTemplate#convertAndSend(String, Object)} apuntando a
 *       {@link ConfiguracionRabbit#COLA_AUDITORIA}.</li>
 *   <li>El prefijo debe añadirse de forma que sea visible: por ejemplo
 *       {@code "[PROCESADO] " + mensajeOriginal}.</li>
 *   <li>Mantén el campo {@code final} y la inyección por constructor.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * reenviador.procesarYReenviar("Hola mundo");
 *
 * // Mensaje enviado a la cola "auditoria":
 * // "[PROCESADO] Hola mundo"
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code String.format("[PROCESADO] %s", mensajeOriginal)} para
 *       construir el nuevo payload.</li>
 *   <li>Si recibes {@code null}, decide si lanzas
 *       {@link IllegalArgumentException} o lo envías como
 *       {@code "[PROCESADO] null"}.</li>
 *   <li>En un sistema real este servicio suele estar desacoplado de la
 *       cola: lo invocan consumidores o filtros.</li>
 * </ul>
 */
@Service
public class ReenviadorEventosEnunciado {

    private final RabbitTemplate rabbitTemplate;

    /**
     * Constructor con inyección de dependencias (sin {@code @Autowired} en
     * campos).
     *
     * @param rabbitTemplate template de Spring AMQP para enviar mensajes a
     *                       RabbitMQ.
     */
    public ReenviadorEventosEnunciado(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Procesa un mensaje añadiendo un prefijo y lo reenvía a la cola de
     * auditoría.
     *
     * @param mensajeOriginal mensaje a procesar y reenviar.
     */
    public void procesarYReenviar(String mensajeOriginal) {
        // TODO: Modifica el string añadiendo el prefijo
        // TODO: Usa rabbitTemplate para enviar el nuevo mensaje
    }
}
