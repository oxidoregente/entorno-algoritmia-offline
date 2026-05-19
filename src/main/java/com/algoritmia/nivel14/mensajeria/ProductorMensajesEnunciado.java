package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Productor de Mensajes.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Envía eventos a una cola de RabbitMQ para ser procesados asíncronamente 
 * por un consumidor. Este servicio actúa como punto de entrada de la 
 * mensajería asíncrona del sistema.</p>
 */
@Service
public class ProductorMensajesEnunciado {

    private final RabbitTemplate rabbitTemplate;

    public ProductorMensajesEnunciado(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Envía un mensaje a la cola de auditoría de RabbitMQ.
     *
     * @param mensaje contenido del evento a enviar
     */
    public void enviarEvento(String mensaje) {
        // TODO: Enviar el mensaje a la cola definida en ConfiguracionRabbit.COLA_AUDITORIA
    }
}
