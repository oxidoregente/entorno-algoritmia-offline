package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.simp.SimpMessagingTemplate;

/**
 * 🏆 SOLUCIONES: WebSockets (Broadcasting, Security, Interceptors).
 */
public class WsExtraSoluciones {

    public void enviarAlerta(SimpMessagingTemplate template, String mensaje) {
        template.convertAndSend("/topic/alertas", mensaje);
    }

    // Seguridad
    /*
    @PreAuthorize("hasRole('ADMIN')") -> Protege el destino del mensaje.
    */
}
