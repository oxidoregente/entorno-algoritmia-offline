package com.algoritmia.nivel14.mensajeria;

import com.algoritmia.nivel20.notificaciones.ServicioEmailEnunciado;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Consumidor de Mensajes.
 * <b>Dificultad: Media</b>
 * 
 * <p>Escucha la cola de RabbitMQ y dispara notificaciones por email 
 * cuando recibe un mensaje. Es el componente final del pipeline de 
 * mensajería asíncrona.</p>
 */
@Service
public class ConsumidorMensajesEnunciado {

    private final ServicioEmailEnunciado servicioEmail;

    public ConsumidorMensajesEnunciado(ServicioEmailEnunciado servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    /**
     * Procesa un mensaje recibido de la cola y dispara una notificación por email.
     *
     * @param mensaje contenido del mensaje recibido
     */
    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void recibirMensaje(String mensaje) {
        // TODO: Procesar el mensaje y enviar un email usando servicioEmail
    }
}
