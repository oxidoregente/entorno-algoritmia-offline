package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * RETO: Motor de Cálculo Roguelike.
 * 
 * Calcula el daño final en un combate.
 * El crítico duplica el daño final.
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
     * Calcula el daño.
     * 
     * @param dañoBase Daño del arma.
     * @param probCritico Probabilidad (0.0 a 1.0).
     * @param multiplicadorItem Bono de equipo.
     * @return Daño final redondeado a 2 decimales.
     */
    public double calcularDañoFinal(double dañoBase, double probCritico, double multiplicadorItem) {
        // TODO: Aplica el multiplicador de item
        // TODO: Decide si es crítico usando random.nextDouble()
        // TODO: Redondea a 2 decimales
        return 0;
    }
}
