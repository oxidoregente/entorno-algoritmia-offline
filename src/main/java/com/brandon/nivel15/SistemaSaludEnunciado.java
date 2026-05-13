package com.brandon.nivel15;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Indicador de Salud Personalizado (Actuator).
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un indicador que Actuator consulte para determinar la salud 
 * del sistema. El sistema debe estar 'DOWN' si un valor simulado de espacio 
 * en disco es menor a 10.</p>
 */
@Component
public class SistemaSaludEnunciado implements HealthIndicator {

    @Override
    public Health health() {
        // TODO: Implementa la lógica de salud personalizada
        // return Health.up().withDetail("espacio", 50).build();
        return null;
    }
}
