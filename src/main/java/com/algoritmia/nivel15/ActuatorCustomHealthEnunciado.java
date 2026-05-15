package com.algoritmia.nivel15;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Indicador de Salud Personalizado.
 * <b>Dificultad: Media</b>
 * 
 * <p>Crea un componente que se integre con Spring Boot Actuator para 
 * reportar el estado de salud de un servicio externo (simulado).</p>
 */
@Component
public class ActuatorCustomHealthEnunciado implements HealthIndicator {

    @Override
    public Health health() {
        // TODO: Retorna Health.up() si el servicio es alcanzable, 
        // o Health.down() con un detalle del error si no.
        return null;
    }
}
