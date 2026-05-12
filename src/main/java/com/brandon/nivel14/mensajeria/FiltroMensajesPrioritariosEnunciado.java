package com.brandon.nivel14.mensajeria;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Filtro de Mensajes Prioritarios.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Implementa un consumidor que analice el contenido de los mensajes. 
 * Solo si el mensaje contiene la palabra "URGENTE", debe registrarse en consola.</p>
 */
@Service
public class FiltroMensajesPrioritariosEnunciado {

    @RabbitListener(queues = ConfiguracionRabbit.COLA_AUDITORIA)
    public void procesar(String mensaje) {
        // TODO: Filtra mensajes que contengan "URGENTE" (ignorando mayúsculas)
        // TODO: Imprime solo los mensajes filtrados
    }
}
