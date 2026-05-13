package com.algoritmia.nivel03.servicios;

import java.time.LocalTime;

/**
 * SOLUCIÓN: Validador de Fraude Bancario.
 */
public class ValidadorFraudeSolucion {

    public record Transaccion(String id, double monto, LocalTime hora) {}

    public boolean esSospechosa(Transaccion t) {
        if (t.monto() > 5000) return true;
        
        // Verifica si la hora está entre las 00:00 y 05:00
        int hora = t.hora().getHour();
        return hora >= 0 && hora < 5;
    }
}
