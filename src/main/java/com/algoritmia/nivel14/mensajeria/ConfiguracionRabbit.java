package com.algoritmia.nivel14.mensajeria;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de RabbitMQ.
 */
@Configuration
public class ConfiguracionRabbit {

    public static final String COLA_AUDITORIA = "cola.auditoria";

    @Bean
    public Queue cola() {
        return new Queue(COLA_AUDITORIA, false);
    }
}
