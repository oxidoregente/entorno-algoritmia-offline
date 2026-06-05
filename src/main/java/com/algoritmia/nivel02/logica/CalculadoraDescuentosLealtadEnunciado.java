package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Calculadora de Descuentos por Lealtad.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Calcula el precio final de una compra aplicando descuentos basados en la antigüedad del cliente.</p>
 *
 * <p><b>Reglas de descuento por antigüedad:</b></p>
 * <ul>
 *   <li>Menos de 1 año: 0% de descuento.</li>
 *   <li>Entre 1 y 5 años (inclusive): 5% de descuento.</li>
 *   <li>Más de 5 años: 10% de descuento.</li>
 * </ul>
 *
 * <p><b>Bono adicional:</b> Si la compra supera los $1000, se añade un 2% EXTRA al descuento total.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * montoCompra=1500, añosAntiguedad=3
 * Descuento base: 5%
 * Bono extra: 2% (monto > 1000)
 * Descuento total: 7%
 * Precio final: 1500 * 0.93 = 1395.0
 * </pre>
 */
@Service
public class CalculadoraDescuentosLealtadEnunciado {

    /**
     * Calcula el precio final después de aplicar descuentos por lealtad.
     *
     * @param montoCompra   El monto total de la compra.
     * @param añosAntiguedad Los años de antigüedad del cliente.
     * @return El precio final con los descuentos aplicados.
     */
    public double calcularPrecioFinal(double montoCompra, int añosAntiguedad) {
        // TODO: Implementa los descuentos progresivos
        return 0;
    }
}
