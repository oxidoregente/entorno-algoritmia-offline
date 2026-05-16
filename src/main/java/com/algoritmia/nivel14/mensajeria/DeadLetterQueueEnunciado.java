package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 🎓 RETO: Cola de Mensajes Muertos (Dead Letter Queue - DLQ).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>En sistemas distribuidos, cuando un mensaje no puede ser procesado tras 
 * varios reintentos, se envía a una DLQ para su posterior análisis manual.</p>
 * 
 * <p><b>💡 Tarea:</b> Configura una cola que redirija los mensajes fallidos 
 * a un exchange de "mensajes-muertos".</p>
 */
@Configuration
public class DeadLetterQueueEnunciado {

    @Bean
    public Queue mainQueue() {
        // TODO: Crea una cola que tenga configurado:
        // x-dead-letter-exchange: "dlx-exchange"
        // x-dead-letter-routing-key: "fallo-routing-key"
        return null;
    }

    @Bean
    public DirectExchange deadLetterExchange() {
        // TODO: Crea un DirectExchange llamado "dlx-exchange"
        return null;
    }
}
