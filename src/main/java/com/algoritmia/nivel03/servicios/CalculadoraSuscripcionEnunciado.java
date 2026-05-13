package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Calculadora de Suscripción SaaS.
 * 
 * Calcula el pago de un cliente según su plan y periodo.
 * 
 * Reglas:
 * - BASICO: $10/mes
 * - PRO: $20/mes
 * - PREMIUM: $50/mes
 * 
 * Descuento:
 * - Si el periodo es 'ANUAL', aplica un 10% de descuento al total de los 12 meses.
 */
@Service
public class CalculadoraSuscripcionEnunciado {

    public enum Plan { BASICO, PRO, PREMIUM }
    public enum Periodo { MENSUAL, ANUAL }

    public double calcularCosto(Plan plan, Periodo periodo) {
        // TODO: Implementa la lógica de facturación SaaS
        return 0;
    }
}
