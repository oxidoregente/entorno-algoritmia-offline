package com.algoritmia.nivel11;

/**
 * 🎓 RETO: Testcontainers con RabbitMQ.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Configura un contenedor de RabbitMQ para pruebas de integración 
 * de mensajería asíncrona.</p>
 */
public class TestcontainersRabbitEnunciado {
    /**
     * Obtiene las instrucciones para configurar un contenedor RabbitMQ
     * con Testcontainers para pruebas de mensajería asíncrona.
     *
     * @return String con las instrucciones del reto
     */
    public String getInstrucciones() {
        return "Usa RabbitMQContainer(\"rabbitmq:3-management-alpine\")";
    }
}
