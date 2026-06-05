package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Patrón Outbox.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Cuando una operación de negocio debe persistir datos en la base de datos y
 * <em>a la vez</em> publicar un evento (por ejemplo, "pedido creado") en un broker
 * como RabbitMQ, no basta con hacerlo en dos pasos: si el broker cae justo entre
 * uno y otro, el mensaje se pierde. El <em>patrón Outbox</em> resuelve el problema
 * guardando el evento en una tabla <code>outbox</code> dentro de la misma transacción
 * de base de datos; un relé posterior lo lee y lo publica al broker.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>La escritura del dominio y del evento comparten transacción atómica (ACID).</li>
 *   <li>La tabla <code>outbox</code> almacena el payload, el tipo de evento y un flag de publicado.</li>
 *   <li>Un <em>poller</em> o <em>debezium</em>/CDC lee la tabla y entrega los mensajes al broker.</li>
 *   <li>Es <em>at-least-once</em>: el consumidor debe ser idempotente para soportar duplicados.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Transactional
 * public void guardarYPublicar(Pedido pedido) {
 *     pedidoRepository.save(pedido);
 *     outboxRepository.save(new OutboxEvent(
 *         "PEDIDO_CREADO",
 *         objectMapper.writeValueAsString(pedido),
 *         Instant.now()
 *     ));
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Inserta la entidad de negocio y el evento en la misma <code>&#64;Transactional</code>.</li>
 *   <li>Diseña el relé con un <code>SELECT ... FOR UPDATE SKIP LOCKED</code> para escalar horizontalmente.</li>
 *   <li>Marca el evento como publicado solo tras confirmar la entrega al broker.</li>
 * </ul>
 */
public class OutboxPatternEnunciado {

    /**
     * Persiste la entidad de dominio y registra el evento en la tabla
     * <em>outbox</em> dentro de la misma transacción para garantizar
     * consistencia entre la base de datos y el broker.
     */
    public void guardarYPublicar() {
        // TODO: 1. Guarda la entidad en la tabla principal.
        // 2. Guarda el evento en una tabla 'outbox' en la MISMA transacción.
        // 3. Un proceso separado leerá la tabla outbox y enviará a RabbitMQ.
    }
}
