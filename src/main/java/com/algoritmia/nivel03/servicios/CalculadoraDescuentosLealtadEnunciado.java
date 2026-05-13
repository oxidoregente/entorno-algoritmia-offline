package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Calculadora de Descuentos por Lealtad.
 * 
 * Calcula el descuento final para un cliente basado en sus años de antigüedad
 * y el monto de su compra.
 * 
 * Reglas:
 * 1. Menos de 1 año: 0% descuento.
 * 2. Entre 1 y 5 años: 5% descuento.
 * 3. Más de 5 años: 10% descuento.
 * 4. Si la compra supera los $1000, se añade un 2% EXTRA al descuento total.
 */
@Service
public class CalculadoraDescuentosLealtadEnunciado {

    public double calcularPrecioFinal(double montoCompra, int añosAntiguedad) {
        // TODO: Implementa la lógica de descuentos progresivos
        return 0;
    }
}
