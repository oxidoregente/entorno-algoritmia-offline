package com.brandon.nivel14.mensajeria;

import com.brandon.nivel20.notificaciones.ServicioEmail;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de escuchar y procesar mensajes de la cola de forma asíncrona.
 */
@Service
public class ConsumidorMensajes {

    private final ServicioEmail servicioEmail;

    public ConsumidorMensajes(ServicioEmail servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void recibirMensaje(String mensaje) {
        System.out.println("<< [CONSUMIDOR] Evento recibido y procesado: " + mensaje);
        
        // Disparamos la notificación final (Nivel 20)
        servicioEmail.enviarNotificacionSimple(
            "admin@ingenieria.com", 
            "Alerta de Transacción", 
            "Se ha procesado un nuevo evento: " + mensaje
        );
    }
}
