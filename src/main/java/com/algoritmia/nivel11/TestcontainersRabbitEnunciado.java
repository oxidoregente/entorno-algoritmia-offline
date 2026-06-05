package com.algoritmia.nivel11;

/**
 * 🎓 RETO: Testcontainers con RabbitMQ.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Configura un contenedor de RabbitMQ para pruebas de integración de
 * mensajería asíncrona. Podrás validar productores, consumidores,
 * exchanges y colas reales sin depender de un broker externo: Testcontainers
 * lo levanta por ti en cuestión de segundos.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa {@code RabbitMQContainer("rabbitmq:3-management-alpine")} para
 *       obtener una imagen con la UI de gestión habilitada.</li>
 *   <li>Registra las propiedades {@code spring.rabbitmq.host},
 *       {@code spring.rabbitmq.port}, {@code username} y {@code password}
 *       mediante {@code @DynamicPropertySource}.</li>
 *   <li>La dependencia {@code testcontainers-rabbitmq} debe estar en el
 *       classpath.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Container
 * static RabbitMQContainer rabbit = new RabbitMQContainer("rabbitmq:3-management-alpine");
 *
 * &#64;DynamicPropertySource
 * static void props(DynamicPropertyRegistry registry) {
 *     registry.add("spring.rabbitmq.host",     rabbit::getHost);
 *     registry.add("spring.rabbitmq.port",     rabbit::getAmqpPort);
 *     registry.add("spring.rabbitmq.username", rabbit::getAdminUsername);
 *     registry.add("spring.rabbitmq.password", rabbit::getAdminPassword);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para el puerto AMQP usa {@code getAmqpPort()}, no
 *       {@code getHttpPort()}: el primero es el que usa Spring AMQP.</li>
 *   <li>Si necesitas habilitar plugins concretos de Rabbit, pásalos en el
 *       constructor o mediante {@code .withPlugins(...)}.</li>
 *   <li>{@code RabbitMQContainer} tarda algo más en arrancar que un
 *       PostgreSQL; considera el patrón Singleton para compartirlo entre
 *       varias clases de test.</li>
 * </ul>
 */
public class TestcontainersRabbitEnunciado {

    /**
     * Describe las instrucciones para configurar un contenedor RabbitMQ con
     * Testcontainers para pruebas de mensajería asíncrona.
     *
     * @return String con las instrucciones del reto.
     */
    public String getInstrucciones() {
        return "Usa RabbitMQContainer(\"rabbitmq:3-management-alpine\")";
    }
}
