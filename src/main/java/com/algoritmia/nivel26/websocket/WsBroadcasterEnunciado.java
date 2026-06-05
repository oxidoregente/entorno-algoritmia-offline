package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Difusión de Mensajes (Broadcasting).
 * <b>Dificultad: Media</b>
 *
 * <p>Cuando ocurre un evento relevante (caída de un servicio, fin de un
 * proceso batch, nuevo mensaje en un chat grupal), el backend debe notificar a
 * todos los clientes suscritos al tópico. <code>SimpMessagingTemplate</code>
 * es la clase de Spring que abstrae el envío: basta con un
 * <code>convertAndSend("/topic/...", payload)</code>.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El destino sigue el convenio STOMP: <code>/topic/...</code> para difusión uno-a-muchos.</li>
 *   <li>El payload puede ser un <code>String</code> o cualquier DTO serializable.</li>
 *   <li>El broker configurado (simple en memoria o RabbitMQ) se encarga de distribuir a los suscriptores.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Cliente (JS)
 * stompClient.subscribe('/topic/alertas', (msg) =&gt; console.log(msg.body));
 *
 * # Servidor (Java)
 * messagingTemplate.convertAndSend("/topic/alertas", "Servidor reiniciado");
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Llama a <code>messagingTemplate.convertAndSend("/topic/alertas", mensaje)</code>.</li>
 *   <li>El cliente debe estar suscrito a <code>/topic/alertas</code> para recibirlo.</li>
 * </ul>
 */
@Service
public class WsBroadcasterEnunciado {

    private final SimpMessagingTemplate messagingTemplate;

    public WsBroadcasterEnunciado(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    /**
     * Difunde una alerta a todos los clientes suscritos al tópico "/topic/alertas".
     *
     * @param mensaje Texto de la alerta que será enviado a los suscriptores.
     */
    public void enviarAlerta(String mensaje) {
        // TODO: Envía el mensaje al destino "/topic/alertas"
    }
}
