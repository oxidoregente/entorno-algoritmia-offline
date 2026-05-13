package com.brandon.nivel00.testing;

/**
 * Nivel 00: Testing Inverso.
 */
public class TransformadorTextoSolucion {

    /**
     * Convierte un texto a formato de encabezado: Trim + UpperCase.
     */
    public String formatear(String texto) {
        if (texto == null) return "";
        return texto.trim().toUpperCase();
    }
}
