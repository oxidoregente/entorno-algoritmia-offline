package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Reenviador de Eventos (Pipe).
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que actúe como un "pasamanos" (Proxy). 
 * Recibe un mensaje, le añade un prefijo "[PROCESADO]" y lo reenvía a la 
 * misma cola de auditoría.</p>
 */
@Service
public class ReenviadorEventosEnunciado {

    private final RabbitTemplate rabbitTemplate;

    public ReenviadorEventosEnunciado(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void procesarYReenviar(String mensajeOriginal) {
        // TODO: Modifica el string añadiendo el prefijo
        // TODO: Usa rabbitTemplate para enviar el nuevo mensaje
    }
}
