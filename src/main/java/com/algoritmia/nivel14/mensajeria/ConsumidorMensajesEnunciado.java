package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Consumidor de Mensajes.
 * <b>Dificultad: Media</b>
 *
 * <p>Escucha la cola de RabbitMQ y dispara notificaciones cuando recibe un
 * mensaje. Es el componente final del pipeline de mensajería asíncrona.</p>
 *
 * <p><b>Acoplamiento:</b> Este servicio depende de la interfaz {@link Notificador}
 * (no de una clase concreta). Esto le permite funcionar con cualquier
 * implementación disponible en el contexto de Spring: email, SMS, push, etc.</p>
 */
@Service
public class ConsumidorMensajesEnunciado {

    private final Notificador notificador;

    public ConsumidorMensajesEnunciado(Notificador notificador) {
        this.notificador = notificador;
    }

    /**
     * Procesa un mensaje recibido de la cola y dispara una notificación.
     *
     * @param mensaje contenido del mensaje recibido
     */
    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void recibirMensaje(String mensaje) {
        // TODO: Procesar el mensaje y enviarlo a través del notificador
    }
}
