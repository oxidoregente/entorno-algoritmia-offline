package com.brandon.nivel03.servicios;

/**
 * SOLUCIÓN: Generador de Códigos de Referencia.
 */
public class GeneradorReferenciaSolucion {

    public String generar(long clienteId) {
        if (clienteId <= 0) {
            throw new IllegalArgumentException("Cliente ID inválido");
        }
        return String.format("REF-%d-%d", clienteId, System.currentTimeMillis());
    }
}
