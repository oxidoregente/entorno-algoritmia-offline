package com.brandon.nivel14.mensajeria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de escuchar y procesar mensajes de la cola de forma asíncrona.
 */
@Service
public class ConsumidorMensajes {

    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void recibirMensaje(String mensaje) {
        System.out.println("<< [CONSUMIDOR] Evento recibido y procesado: " + mensaje);
        // Aquí podrías guardar en un log, enviar un email, etc.
    }
}
