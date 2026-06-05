package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Calculadora de Envíos Internacionales.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Calcula el costo de envío basado en el peso (kg) y la zona geográfica de destino.</p>
 *
 * <p><b>Tarifas Base por Zona:</b></p>
 * <ul>
 *   <li>"AMERICA_SUR": $10 por kg.</li>
 *   <li>"AMERICA_NORTE": $15 por kg.</li>
 *   <li>"EUROPA": $20 por kg.</li>
 * </ul>
 *
 * <p><b>Recargo por peso:</b> Si el peso supera los 20kg, se aplica un recargo fijo de $50 al total.</p>
 *
 * <p>Si la zona no es soportada, lanza una `IllegalArgumentException`.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * peso=25, zona="EUROPA"
 * Costo base: 25 * 20 = 500
 * Recargo: 50
 * Total: 550
 * </pre>
 */
@Service
public class CalculadoraEnviosInternacionalesEnunciado {

    /**
     * Calcula el costo de envío internacional según peso y zona.
     *
     * @param peso El peso del paquete en kg.
     * @param zona La zona geográfica de destino.
     * @return El costo total del envío.
     * @throws IllegalArgumentException Si la zona no es soportada.
     */
    public double calcularCosto(double peso, String zona) {
        // TODO: Implementa la tarifación por zona y peso
        return 0;
    }
}
