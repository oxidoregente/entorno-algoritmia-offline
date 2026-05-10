package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * Nivel 3: Servicios y Lógica de Negocio con Inyección.
 * 
 * Problema: Motor de Cálculo Roguelike.
 * 
 * <p>Este servicio calcula el daño final en un combate de RPG. Introduce el concepto
 * de aleatoriedad controlada y cómo manejarla en pruebas unitarias.</p>
 */
@Service
public class MotorCalculoRoguelike {

    private final Random random;

    // Constructor para inyección. En tests, podemos pasar un Random con semilla fija.
    public MotorCalculoRoguelike() {
        this.random = new Random();
    }

    // Constructor secundario para testing (Inyección de dependencia manual)
    public MotorCalculoRoguelike(Random random) {
        this.random = random;
    }

    /**
     * Calcula el daño final.
     * 
     * @param dañoBase Daño bruto del arma.
     * @param probCritico Probabilidad de crítico (0.0 a 1.0).
     * @param multiplicadorItem Bono adicional por ítems (ej. 1.2 para +20%).
     * @return El daño final calculado.
     */
    public double calcularDañoFinal(double dañoBase, double probCritico, double multiplicadorItem) {
        double dañoFinal = dañoBase * multiplicadorItem;

        // Determinamos si es golpe crítico
        boolean esCritico = random.nextDouble() < probCritico;

        if (esCritico) {
            System.out.println("¡GOLPE CRÍTICO!");
            dañoFinal *= 2.0; // El crítico duplica el daño
        }

        return Math.round(dañoFinal * 100.0) / 100.0; // Redondeo a 2 decimales
    }
}
