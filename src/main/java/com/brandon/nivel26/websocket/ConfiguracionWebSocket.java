package com.brandon.nivel26.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Nivel 26: Configuración de WebSockets con STOMP.
 * 
 * Permite la comunicación bidireccional y en tiempo real entre el servidor y los clientes.
 */
@Configuration
@EnableWebSocketMessageBroker
public class ConfiguracionWebSocket implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Habilitamos un broker simple en memoria para enviar mensajes a los clientes
        config.enableSimpleBroker("/topic");
        // Prefijo para los mensajes que el cliente envía al servidor
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Punto de entrada para que los clientes se conecten
        registry.addEndpoint("/ws-notificaciones").setAllowedOrigins("*").withSockJS();
    }
}
