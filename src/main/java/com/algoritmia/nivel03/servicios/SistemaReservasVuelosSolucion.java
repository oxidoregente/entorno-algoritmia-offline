package com.algoritmia.nivel03.servicios;

import java.util.Map;

/**
 * SOLUCIÓN: Sistema de Reservas de Vuelos.
 */
public class SistemaReservasVuelosSolucion {

    private final Map<String, Double> preciosBase = Map.of(
        "MADRID", 500.0,
        "PARIS", 600.0,
        "LONDRES", 700.0
    );

    public double calcularPrecioTicket(String destino, String clase) {
        String dest = destino.toUpperCase();
        if (!preciosBase.containsKey(dest)) {
            throw new IllegalArgumentException("Destino no operado: " + destino);
        }

        double precio = preciosBase.get(dest);

        if ("EJECUTIVA".equalsIgnoreCase(clase)) {
            precio *= 1.5;
        }

        return precio + 45.0; // Tasa fija
    }
}
