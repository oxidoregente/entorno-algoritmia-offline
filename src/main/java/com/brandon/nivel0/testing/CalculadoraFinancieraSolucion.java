package com.brandon.nivel0.testing;

/**
 * Nivel 0: Testing Inverso.
 * 
 * En este nivel, la lógica ya está escrita (SOLUCIÓN). 
 * Tu reto no es programar la lógica, sino ESCRIBIR EL TEST que la verifique.
 */
public class CalculadoraFinancieraSolucion {

    /**
     * Calcula el monto final usando interés compuesto.
     * Fórmula: A = P(1 + r/n)^(nt)
     * 
     * Simplificado para el reto: capital * (1 + tasa)^años
     * 
     * @param capital El dinero inicial.
     * @param tasa Tasa de interés (ej: 0.05 para 5%).
     * @param años Tiempo en años.
     * @return El monto final redondeado a 2 decimales.
     */
    public double calcularInteresCompuesto(double capital, double tasa, int años) {
        double monto = capital * Math.pow(1 + tasa, años);
        return Math.round(monto * 100.0) / 100.0;
    }
}
