package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * SOLUCIÓN: Motor de Cálculo Roguelike.
 * 
 * <p>Teoría:
 * El uso de inyección manual de un objeto Random con semilla permite 
 * realizar pruebas deterministas sobre algoritmos probabilísticos.</p>
 */

public class MotorCalculoRoguelikeSolucion {

    private final Random random;

    public MotorCalculoRoguelikeSolucion() {
        this.random = new Random();
    }

    public MotorCalculoRoguelikeSolucion(Random random) {
        this.random = random;
    }

    public double calcularDañoFinal(double dañoBase, double probCritico, double multiplicadorItem) {
        double dañoFinal = dañoBase * multiplicadorItem;

        if (random.nextDouble() < probCritico) {
            dañoFinal *= 2.0;
        }

        return Math.round(dañoFinal * 100.0) / 100.0;
    }
}
