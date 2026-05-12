package com.brandon.nivel01.strings;

/**
 * SOLUCIÓN: Invertir Palabras.
 */
public class InvertirPalabrasSolucion {

    public String invertir(String oracion) {
        if (oracion == null || oracion.isEmpty()) return oracion;
        String[] palabras = oracion.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            sb.append(palabras[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}
