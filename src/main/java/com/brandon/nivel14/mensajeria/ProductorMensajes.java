package com.brandon.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de enviar mensajes a la cola.
 */
@Service
public class ProductorMensajes {

    private final RabbitTemplate rabbitTemplate;

    public ProductorMensajes(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarEvento(String mensaje) {
        System.out.println(">> [PRODUCTOR] Enviando evento: " + mensaje);
        rabbitTemplate.convertAndSend(ConfiguracionRabbit.COLA_AUDITORIA, mensaje);
    }
}
