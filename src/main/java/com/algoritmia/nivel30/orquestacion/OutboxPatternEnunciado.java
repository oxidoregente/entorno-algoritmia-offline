package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Patrón Outbox.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>El patrón Outbox garantiza la consistencia entre la base de datos 
 * y el sistema de mensajería (ej: RabbitMQ), evitando que el mensaje 
 * se pierda si el broker está caído al momento de guardar en DB.</p>
 */
public class OutboxPatternEnunciado {

    public void guardarYPublicar() {
        // TODO: 1. Guarda la entidad en la tabla principal. 
        // 2. Guarda el evento en una tabla 'outbox' en la MISMA transacción.
        // 3. Un proceso separado leerá la tabla outbox y enviará a RabbitMQ.
    }
}
