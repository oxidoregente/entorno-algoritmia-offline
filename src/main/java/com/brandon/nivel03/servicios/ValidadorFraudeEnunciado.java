package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;
import java.time.LocalTime;

/**
 * RETO: Validador de Fraude Bancario.
 * 
 * Determina si una transacción debe marcarse como SOSPECHOSA.
 * 
 * Reglas:
 * 1. Si el monto es mayor a $5000.
 * 2. Si la hora de la transacción está entre las 00:00 y las 05:00 (Madrugada).
 */
@Service
public class ValidadorFraudeEnunciado {

    public record Transaccion(String id, double monto, LocalTime hora) {}

    public boolean esSospechosa(Transaccion t) {
        // TODO: Implementa la lógica de detección de fraude
        return false;
    }
}
