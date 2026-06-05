package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;
import java.time.LocalTime;

/**
 * 🎓 RETO: Validador de Fraude Bancario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Determina si una transacción bancaria debe marcarse como SOSPECHOSA.</p>
 *
 * <p>Una transacción se considera sospechosa si cumple al menos una de las siguientes reglas:</p>
 * <ol>
 *   <li>El monto de la transacción es mayor a $5000.</li>
 *   <li>La hora de la transacción está entre las 00:00 y las 05:00 (madrugada).</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Transacción: (id="T001", monto=6000, hora=03:00) -> true (monto > 5000 y hora madrugada)
 * Transacción: (id="T002", monto=3000, hora=10:00) -> false
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `t.monto() > 5000` para verificar el monto.</li>
 *   <li>Para la hora usa `t.hora().isAfter(...)` e `isBefore(...)`.</li>
 *   <li>Puedes comparar con `LocalTime.of(0, 0)` y `LocalTime.of(5, 0)`.</li>
 * </ul>
 */
@Service
public class ValidadorFraudeEnunciado {

    public record Transaccion(String id, double monto, LocalTime hora) {}

    /**
     * Determina si una transacción es sospechosa según las reglas de fraude.
     *
     * @param t La transacción a evaluar.
     * @return true si la transacción es sospechosa, false en caso contrario.
     */
    public boolean esSospechosa(Transaccion t) {
        // TODO: Implementa la detección de fraude
        return false;
    }
}
