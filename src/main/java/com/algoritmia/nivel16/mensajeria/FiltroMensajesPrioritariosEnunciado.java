package com.algoritmia.nivel16.mensajeria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Filtro de Mensajes Prioritarios.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un consumidor que analice el contenido de los mensajes
 * recibidos de RabbitMQ. Solo si el mensaje contiene la palabra
 * {@code "URGENTE"} debe registrarse en consola. Es un patrón habitual en
 * sistemas de auditoría: encolar todos los eventos pero actuar solo
 * sobre los relevantes.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>La anotación {@link RabbitListener} se asocia a la cola definida
 *       en {@link ConfiguracionRabbit#COLA_AUDITORIA}.</li>
 *   <li>El filtrado debe ser <i>case-insensitive</i>: aceptar tanto
 *       {@code "URGENTE"} como {@code "urgente"} o {@code "Urgente"}.</li>
 *   <li>Si el mensaje no contiene la palabra clave, el método debe
 *       <b>no</b> producir salida (o devolver silenciosamente).</li>
 *   <li>La firma del método es
 *       {@code public void procesar(String mensaje)}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * // Mensaje 1 -&gt; "ERROR menor"        -&gt; no se imprime
 * // Mensaje 2 -&gt; "URGENTE: bug login" -&gt; se imprime
 * // Mensaje 3 -&gt; "urgente: db down"   -&gt; se imprime
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code mensaje.toUpperCase().contains("URGENTE")} para una
 *       comprobación robusta.</li>
 *   <li>Si prefieres trabajar con {@code Optional<String>}, devuelve
 *       {@code Optional.empty()} cuando el mensaje no sea prioritario.</li>
 *   <li>En un sistema real, el filtro podría enrutarse a una cola exclusiva
 *       con un {@code binding} adecuado; aquí se hace en código.</li>
 * </ul>
 */
@Service
public class FiltroMensajesPrioritariosEnunciado {

    /**
     * Escucha la cola y registra solo los mensajes que contienen
     * {@code "URGENTE"}.
     *
     * @param mensaje mensaje recibido de la cola de auditoría.
     */
    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void procesar(String mensaje) {
        // TODO: Filtra mensajes que contengan "URGENTE" (ignorando mayúsculas)
        // TODO: Imprime solo los mensajes filtrados
    }
}
