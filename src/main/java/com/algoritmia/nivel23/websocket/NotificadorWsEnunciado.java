package com.algoritmia.nivel23.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Notificador en Tiempo Real (WebSocket).
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un controlador WebSocket que reciba mensajes en
 * {@code /alerta} y los retransmita a todos los suscriptores del
 * tópico {@code /topic/notificaciones}.</p>
 *
 * <p>Usa las anotaciones {@code @MessageMapping} y {@code @SendTo}
 * para definir el flujo de mensajes entrantes y salientes.</p>
 *
 * <h3>Example:</h3>
 * <pre>
 * Cliente envía -> /alerta  "Alerta de seguridad"
 * Servidor emite -> /topic/notificaciones  "Alerta de seguridad"
 * </pre>
 */
@Controller
public class NotificadorWsEnunciado {

    /**
     * Recibe un mensaje de alerta y lo retransmite a todos los
     * suscriptores del tópico de notificaciones.
     *
     * @param mensaje Contenido de la alerta recibida.
     * @return El mismo mensaje para ser difundido.
     */
    @MessageMapping("/alerta")
    @SendTo("/topic/notificaciones")
    public String enviarAlerta(String mensaje) {
        // TODO: Procesa el mensaje y retransmítelo a los suscriptores
        return null;
    }
}
