package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Conversor de Monedas Financiero.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Realiza conversiones entre USD, EUR y GBP usando tasas de cambio fijas.</p>
 *
 * <p><b>Tasas (1 unidad de moneda origen a moneda destino):</b></p>
 * <ul>
 *   <li>USD -> EUR: 0.92</li>
 *   <li>USD -> GBP: 0.79</li>
 *   <li>EUR -> USD: 1.09</li>
 *   <li>EUR -> GBP: 0.86</li>
 *   <li>GBP -> USD: 1.27</li>
 *   <li>GBP -> EUR: 1.16</li>
 * </ul>
 *
 * <p><b>Nota:</b> Si la moneda de origen o destino no es soportada, lanza una `IllegalArgumentException`.
 * El resultado debe redondearse a 2 decimales.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * convertir(100, "USD", "EUR") -> 92.0
 * </pre>
 */
@Service
public class ConversorMonedasEnunciado {

    /**
     * Convierte un monto de una moneda a otra usando tasas fijas.
     *
     * @param monto El monto a convertir.
     * @param desde La moneda de origen (USD, EUR, GBP).
     * @param hacia La moneda de destino (USD, EUR, GBP).
     * @return El monto convertido redondeado a 2 decimales.
     * @throws IllegalArgumentException Si alguna moneda no es soportada.
     */
    public double convertir(double monto, String desde, String hacia) {
        // TODO: Implementa la lógica de conversión
        return 0;
    }
}
