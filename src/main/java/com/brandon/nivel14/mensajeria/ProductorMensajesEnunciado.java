package com.brandon.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * RETO: Productor de Mensajes.
 * 
 * Envía eventos a una cola de RabbitMQ para ser procesados asíncronamente.
 */
@Service
public class ProductorMensajesEnunciado {

    private final RabbitTemplate rabbitTemplate;

    public ProductorMensajesEnunciado(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarEvento(String mensaje) {
        // TODO: Enviar el mensaje a la cola definida en ConfiguracionRabbit.COLA_AUDITORIA
    }
}
