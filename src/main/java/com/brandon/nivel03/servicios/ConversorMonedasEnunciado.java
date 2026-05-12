package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Conversor de Monedas Financiero.
 * 
 * Realiza conversiones entre USD, EUR y GBP usando tasas fijas.
 * 
 * Tasas (1 unidad de origen a destino):
 * - USD a EUR: 0.92
 * - USD a GBP: 0.79
 * - EUR a USD: 1.09
 * 
 * Si la moneda no es soportada, lanza una IllegalArgumentException.
 */
@Service
public class ConversorMonedasEnunciado {

    public double convertir(double monto, String desde, String hacia) {
        // TODO: Implementa la lógica de conversión y redondeo a 2 decimales
        return 0;
    }
}
