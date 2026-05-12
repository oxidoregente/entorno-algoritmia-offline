package com.brandon.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * 🏆 SOLUCIÓN: Reenviador de Eventos.
 */
public class ReenviadorEventosSolucion {

    private final RabbitTemplate rabbitTemplate;

    public ReenviadorEventosSolucion(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void procesarYReenviar(String mensajeOriginal) {
        String nuevoMensaje = "[PROCESADO] " + mensajeOriginal;
        rabbitTemplate.convertAndSend(ConfiguracionRabbit.COLA_AUDITORIA, nuevoMensaje);
    }
}
