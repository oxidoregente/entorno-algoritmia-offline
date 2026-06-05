package com.algoritmia.nivel29.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Indicador de Salud Personalizado (Actuator).
 * <b>Dificultad: Media</b>
 *
 * <p>En producción es habitual combinar múltiples señales para
 * declarar una aplicación como saludable. Este indicador
 * específico evalúa el espacio libre en disco (simulado) y
 * reporta {@code DOWN} cuando está por debajo de un umbral
 * crítico, lo que permite a balanceadores y orquestadores
 * (Kubernetes, AWS ELB) sacar la instancia de rotación
 * automáticamente.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementar {@link HealthIndicator} y anotar la clase con {@code @Component}
 *       para que Actuator la detecte automáticamente.</li>
 *   <li>La métrica crítica se evalúa dentro de {@code health()} y se traduce a
 *       {@link Health#up()} o {@link Health#down()}.</li>
 *   <li>Adjuntar detalles con {@code .withDetail(clave, valor)} ayuda a depurar
 *       sin necesidad de entrar al servidor.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class SistemaSaludEnunciado implements HealthIndicator {
 *     &#64;Override
 *     public Health health() {
 *         long espacioLibre = consultarDiscoLibre();
 *         if (espacioLibre &lt; 10) {
 *             return Health.down()
 *                     .withDetail("espacio", espacioLibre)
 *                     .withDetail("umbral", 10)
 *                     .build();
 *         }
 *         return Health.up().withDetail("espacio", espacioLibre).build();
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa una constante {@code UMBRAL_MINIMO = 10} para evitar números mágicos.</li>
 *   <li>Para un valor simulado, devuelve un número fijo (ej. {@code 50}) o
 *       {@code ThreadLocalRandom.current().nextInt(0, 100)} para variar entre tests.</li>
 * </ul>
 */
@Component
public class SistemaSaludEnunciado implements HealthIndicator {

    /**
     * Evalúa la salud del sistema en función del espacio en disco simulado.
     *
     * @return {@link Health#up()} con el detalle {@code espacio} si el valor
     *         es mayor o igual a {@code 10}; {@link Health#down()} en caso contrario
     */
    @Override
    public Health health() {
        // TODO: Implementa la lógica de salud personalizada
        // return Health.up().withDetail("espacio", 50).build();
        return null;
    }
}
