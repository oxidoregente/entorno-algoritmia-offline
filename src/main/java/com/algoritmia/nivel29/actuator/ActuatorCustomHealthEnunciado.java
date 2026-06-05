package com.algoritmia.nivel29.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Indicador de Salud Personalizado.
 * <b>Dificultad: Media</b>
 *
 * <p>Spring Boot Actuator agrega por defecto indicadores para
 * espacio en disco, ping y, si están en el classpath, para
 * bases de datos, Redis, RabbitMQ, etc. Sin embargo, las
 * dependencias externas custom (APIs de pago, microservicios
 * internos, colas legacy) no se chequean solas. Implementando
 * {@link HealthIndicator} puedes aportar esa visibilidad al
 * endpoint {@code /actuator/health} y, con ello, a Kubernetes
 * liveness/readiness probes.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementar la interfaz {@link HealthIndicator} y anotar con {@code @Component}.</li>
 *   <li>El nombre del bean (sin el sufijo {@code HealthIndicator}) se usa como clave
 *       en la respuesta JSON: ej. {@code actuatorCustomHealth: {status: "UP" }}.</li>
 *   <li>Devolver {@link Health#up()} con detalles via {@code .withDetail(...)} o
 *       {@link Health#down()} cuando el sistema externo no esté disponible.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class ActuatorCustomHealthEnunciado implements HealthIndicator {
 *     &#64;Override
 *     public Health health() {
 *         if (servicioExterno.responde()) {
 *             return Health.up().withDetail("latencia_ms", 42).build();
 *         }
 *         return Health.down()
 *                 .withDetail("motivo", "Timeout al conectar con el servicio")
 *                 .build();
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encapsula la comprobación (HTTP, socket, etc.) en un bloque {@code try/catch} y
 *       devuelve {@code Health.down().withException(e)} si algo falla.</li>
 *   <li>Recuerda activar la exposición: {@code management.endpoints.web.exposure.include=health}.</li>
 * </ul>
 */
@Component
public class ActuatorCustomHealthEnunciado implements HealthIndicator {

    /**
     * Evalúa y reporta el estado de salud del servicio externo simulado.
     *
     * @return {@link Health#up()} con detalles si el servicio responde,
     *         {@link Health#down()} con el motivo del error en caso contrario
     */
    @Override
    public Health health() {
        // TODO: Retorna Health.up() si el servicio es alcanzable,
        // o Health.down() con un detalle del error si no.
        return null;
    }
}
