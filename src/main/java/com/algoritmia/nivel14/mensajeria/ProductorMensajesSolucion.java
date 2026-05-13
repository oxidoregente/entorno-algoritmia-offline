package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * SOLUCIÓN: Productor de Mensajes.
 */
public class ProductorMensajesSolucion {

    private final RabbitTemplate rabbitTemplate;

    public ProductorMensajesSolucion(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarEvento(String mensaje) {
        rabbitTemplate.convertAndSend(ConfiguracionRabbit.COLA_AUDITORIA, mensaje);
    }
}
