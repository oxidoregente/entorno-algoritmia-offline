package com.algoritmia.nivel03.servicios;

/**
 * SOLUCIÓN: Calculadora de Suscripción SaaS.
 */
public class CalculadoraSuscripcionSolucion {

    public enum Plan { BASICO, PRO, PREMIUM }
    public enum Periodo { MENSUAL, ANUAL }

    public double calcularCosto(Plan plan, Periodo periodo) {
        double costoMensual = switch (plan) {
            case BASICO -> 10.0;
            case PRO -> 20.0;
            case PREMIUM -> 50.0;
        };

        if (periodo == Periodo.MENSUAL) {
            return costoMensual;
        } else {
            double totalAnual = costoMensual * 12;
            return totalAnual * 0.9; // 10% descuento
        }
    }
}
