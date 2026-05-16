package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Difusión de Mensajes (Broadcasting).
 * <b>Dificultad: Media</b>
 * 
 * <p>Aprende a enviar mensajes a todos los clientes conectados a un 
 * tópico específico desde cualquier parte de tu aplicación.</p>
 */
@Service
public class WsBroadcasterEnunciado {

    private final SimpMessagingTemplate messagingTemplate;

    public WsBroadcasterEnunciado(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void enviarAlerta(String mensaje) {
        // TODO: Envía el mensaje al destino "/topic/alertas"
    }
}
