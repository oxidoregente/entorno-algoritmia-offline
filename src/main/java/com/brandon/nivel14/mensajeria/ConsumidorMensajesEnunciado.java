package com.brandon.nivel14.mensajeria;

import com.brandon.nivel20.notificaciones.ServicioEmailEnunciado;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * RETO: Consumidor de Mensajes.
 * 
 * Escucha la cola de RabbitMQ y dispara notificaciones.
 */
@Service
public class ConsumidorMensajesEnunciado {

    private final ServicioEmailEnunciado servicioEmail;

    public ConsumidorMensajesEnunciado(ServicioEmailEnunciado servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void recibirMensaje(String mensaje) {
        // TODO: Procesar el mensaje y enviar un email usando servicioEmail
    }
}
