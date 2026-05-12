package com.brandon.nivel03.servicios;

/**
 * SOLUCIÓN: Calculadora de Descuentos por Lealtad.
 */
public class CalculadoraDescuentosLealtadSolucion {

    public double calcularPrecioFinal(double montoCompra, int añosAntiguedad) {
        double porcentajeDescuento = 0;

        if (añosAntiguedad >= 1 && añosAntiguedad <= 5) {
            porcentajeDescuento = 0.05;
        } else if (añosAntiguedad > 5) {
            porcentajeDescuento = 0.10;
        }

        if (montoCompra > 1000) {
            porcentajeDescuento += 0.02;
        }

        double descuento = montoCompra * porcentajeDescuento;
        return montoCompra - descuento;
    }
}
