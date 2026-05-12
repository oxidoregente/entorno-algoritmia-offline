package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Calculadora de Envíos Internacionales.
 * 
 * Calcula el costo de envío basado en el peso (kg) y la zona geográfica.
 * 
 * Tarifas Base por Zona:
 * - "AMERICA_SUR": $10 por kg.
 * - "AMERICA_NORTE": $15 por kg.
 * - "EUROPA": $20 por kg.
 * 
 * Recargo por Peso:
 * - Si el peso supera los 20kg, se aplica un recargo fijo de $50 al total.
 */
@Service
public class CalculadoraEnviosInternacionalesEnunciado {

    public double calcularCosto(double peso, String zona) {
        // TODO: Implementa la lógica de tarifación
        return 0;
    }
}
