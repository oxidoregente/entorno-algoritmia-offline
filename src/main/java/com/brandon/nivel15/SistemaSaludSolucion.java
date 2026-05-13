package com.brandon.nivel15;

import org.springframework.boot.actuate.health.Health;

/**
 * 🏆 SOLUCIÓN: Indicador de Salud Personalizado.
 */
public class SistemaSaludSolucion {

    public Health health() {
        int espacioSimulado = 5; // Simulación de poco espacio
        
        if (espacioSimulado < 10) {
            return Health.down()
                    .withDetail("error", "Espacio en disco insuficiente")
                    .withDetail("valor", espacioSimulado)
                    .build();
        }
        
        return Health.up()
                .withDetail("mensaje", "Espacio en disco óptimo")
                .build();
    }
}
