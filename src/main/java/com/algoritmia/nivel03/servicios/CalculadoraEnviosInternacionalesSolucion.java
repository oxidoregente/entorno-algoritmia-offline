package com.algoritmia.nivel03.servicios;

/**
 * SOLUCIÓN: Calculadora de Envíos Internacionales.
 */
public class CalculadoraEnviosInternacionalesSolucion {

    public double calcularCosto(double peso, String zona) {
        double tarifaPorKg = switch (zona.toUpperCase()) {
            case "AMERICA_SUR" -> 10.0;
            case "AMERICA_NORTE" -> 15.0;
            case "EUROPA" -> 20.0;
            default -> throw new IllegalArgumentException("Zona no soportada");
        };

        double costoBase = peso * tarifaPorKg;
        
        if (peso > 20.0) {
            costoBase += 50.0;
        }

        return costoBase;
    }
}
