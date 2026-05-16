package com.algoritmia.nivel26.websocket;

import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * 🎓 RETO: Interceptores de Canal (ChannelInterceptors).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Los interceptores permiten actuar sobre los mensajes antes de que 
 * sean procesados o enviados (ej: para añadir auditoría o validar tokens).</p>
 */
public class WsInterceptorsEnunciado implements ChannelInterceptor {

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        // TODO: Registra un log con el tipo de mensaje (CONNECT, SEND, etc.)
        return message;
    }
}
