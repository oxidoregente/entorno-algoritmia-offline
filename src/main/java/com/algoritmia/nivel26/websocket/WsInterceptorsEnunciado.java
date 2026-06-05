package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * 🎓 RETO: Interceptores de Canal (ChannelInterceptors).
 * <b>Dificultad: Difícil</b>
 *
 * <p>En una arquitectura WebSocket basada en STOMP, los mensajes atraviesan
 * canales (<code>clientInboundChannel</code>, <code>clientOutboundChannel</code>).
 * Los <code>ChannelInterceptor</code> permiten engancharse al ciclo de vida
 * del mensaje para auditar, validar tokens, añadir cabeceras, transformar el
 * payload, etc. Es el equivalente WebSocket de los <code>Filter</code> HTTP.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementa <code>ChannelInterceptor</code> y registra el bean con <code>@Bean ChannelInterceptor</code> en la config WebSocket.</li>
 *   <li><code>preSend</code> se ejecuta antes de enviar el mensaje al canal; puede modificarlo o rechazarlo lanzando una excepción.</li>
 *   <li>Puedes inspeccionar las cabeceras STOMP con <code>message.getHeaders().get("stompCommand")</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * @Override
 * public void configureClientInboundChannel(ChannelRegistration registration) {
 *     registration.interceptors(new WsInterceptorsEnunciado());
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Accede a <code>message.getHeaders()</code> para leer el comando STOMP.</li>
 *   <li>Usa <code>log.info("Mensaje: {}", headers.get("stompCommand"))</code> o un <code>System.out.println</code>.</li>
 *   <li>Recuerda devolver el <code>message</code> original al final.</li>
 * </ul>
 */
public class WsInterceptorsEnunciado implements ChannelInterceptor {

    /**
     * Intercepta cada mensaje antes de ser enviado al canal.
     *
     * @param message Mensaje STOMP que viaja por el canal.
     * @param channel Canal al que se dirige el mensaje.
     * @return Mensaje original (o modificado) que将继续 su curso en el canal.
     */
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        // TODO: Registra un log con el tipo de mensaje (CONNECT, SEND, etc.)
        return message;
    }
}
