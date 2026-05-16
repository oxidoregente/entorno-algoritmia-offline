package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Seguridad en WebSockets.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Al igual que los endpoints HTTP, los destinos de mensajes en 
 * WebSockets deben estar protegidos.</p>
 */
@Controller
public class WsSecurityEnunciado {

    @MessageMapping("/admin-chat")
    @PreAuthorize("hasRole('ADMIN')")
    public void chatAdmin(@Payload String mensaje) {
        // TODO: Asegúrate de que solo usuarios con rol ADMIN puedan 
        // enviar mensajes a este destino.
    }
}
