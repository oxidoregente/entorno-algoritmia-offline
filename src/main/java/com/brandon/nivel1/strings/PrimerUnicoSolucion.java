package com.brandon.nivel1.strings;

/**
 * SOLUCIÓN: Primer Carácter Único.
 */
public class PrimerUnicoSolucion {

    public int encontrar(String s) {
        int[] frecuencias = new int[256];
        
        for (char c : s.toCharArray()) {
            frecuencias[c]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (frecuencias[s.charAt(i)] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
