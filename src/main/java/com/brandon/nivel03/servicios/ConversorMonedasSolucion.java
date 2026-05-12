package com.brandon.nivel03.servicios;

import java.util.Map;

/**
 * SOLUCIÓN: Conversor de Monedas Financiero.
 */
public class ConversorMonedasSolucion {

    private final Map<String, Double> tasasRespectoAlDolar = Map.of(
        "USD", 1.0,
        "EUR", 0.92,
        "GBP", 0.79
    );

    public double convertir(double monto, String desde, String hacia) {
        if (!tasasRespectoAlDolar.containsKey(desde) || !tasasRespectoAlDolar.containsKey(hacia)) {
            throw new IllegalArgumentException("Moneda no soportada");
        }

        // Convertir a USD primero
        double montoEnUsd = monto / tasasRespectoAlDolar.get(desde);
        // Convertir de USD al destino
        double resultado = montoEnUsd * tasasRespectoAlDolar.get(hacia);

        return Math.round(resultado * 100.0) / 100.0;
    }
}
