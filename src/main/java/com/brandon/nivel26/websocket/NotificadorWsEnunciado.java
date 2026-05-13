package com.brandon.nivel26.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * RETO: Notificador en Tiempo Real.
 */
@Controller
public class NotificadorWsEnunciado {

    @MessageMapping("/alerta")
    @SendTo("/topic/notificaciones")
    public String enviarAlerta(String mensaje) {
        // TODO: Procesa el mensaje y retransmítelo a los suscriptores
        return null;
    }
}
