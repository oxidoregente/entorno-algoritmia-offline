package com.brandon.nivel01.strings;

/**
 * SOLUCIÓN: Contar Vocales.
 */
public class ContarVocalesSolucion {

    public int contar(String texto) {
        if (texto == null) return 0;
        int contador = 0;
        String vocales = "aeiou";
        for (char c : texto.toLowerCase().toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
