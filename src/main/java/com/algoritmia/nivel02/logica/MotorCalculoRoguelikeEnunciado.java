package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * 🎓 RETO: Motor de Cálculo Roguelike. <b>Dificultad: Media</b>
 *
 * <p>
 * Calcula el daño final infligido en un combate de un juego estilo Roguelike.
 * </p>
 *
 * <p>
 * <b>Fórmula de cálculo:</b>
 * </p>
 * <ol>
 * <li>Aplica el multiplicador del item al daño base: dañoBase *
 * multiplicadorItem.</li>
 * <li>Decide si el golpe es crítico usando `random.nextDouble()` y la
 * probabilidad crítica.</li>
 * <li>Si es crítico, duplica el daño calculado.</li>
 * <li>Redondea el resultado final a 2 decimales.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * dañoBase=50, probCritico=0.3, multiplicadorItem=1.5
 * Daño con item: 75.0
 * Si random.nextDouble() < 0.3 (crítico): 75.0 * 2 = 150.0
 * Resultado: 150.0
 * </pre>
 */
@Service
public class MotorCalculoRoguelikeEnunciado {

    private final Random random;

    public MotorCalculoRoguelikeEnunciado() {
        this.random = new Random();
    }

    public MotorCalculoRoguelikeEnunciado(Random random) {
        this.random = random;
    }

    /**
     * Calcula el daño final aplicando multiplicadores y probabilidad de crítico.
     *
     * @param dañoBase          Daño base del arma.
     * @param probCritico       Probabilidad de golpe crítico (0.0 a 1.0).
     * @param multiplicadorItem Bono de equipo aplicado al daño.
     * @return Daño final redondeado a 2 decimales.
     */
    public double calcularDañoFinal(double dañoBase, double probCritico, double multiplicadorItem) {
        // TODO: Aplica multiplicador, decide crítico y redondea

        double dañoFinal = dañoBase * multiplicadorItem;

        if (random.nextDouble() < probCritico)
            dañoFinal *= 2;

        return dañoFinal;
    }
}
