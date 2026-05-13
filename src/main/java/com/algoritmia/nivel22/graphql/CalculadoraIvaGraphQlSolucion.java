package com.algoritmia.nivel22.graphql;

/**
 * 🏆 SOLUCIÓN: Calculadora de IVA en GraphQL.
 */
public class CalculadoraIvaGraphQlSolucion {

    public Double calcularIvaSimulado(Double monto) {
        if (monto == null) return 0.0;
        return monto * 0.21;
    }
}
