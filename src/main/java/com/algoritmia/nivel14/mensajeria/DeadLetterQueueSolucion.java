package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;

/**
 * 🏆 SOLUCIÓN: Cola de Mensajes Muertos (DLQ).
 * 
 * <p>La configuración de DLQ se hace mediante argumentos en la creación 
 * de la cola principal.</p>
 */
public class DeadLetterQueueSolucion {

    public Queue mainQueue() {
        return QueueBuilder.durable("main-queue")
                .withArgument("x-dead-letter-exchange", "dlx-exchange")
                .withArgument("x-dead-letter-routing-key", "fallo-routing-key")
                .build();
    }

    public DirectExchange deadLetterExchange() {
        return new DirectExchange("dlx-exchange");
    }
}
