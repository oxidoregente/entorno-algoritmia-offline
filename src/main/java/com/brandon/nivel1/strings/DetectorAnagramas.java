package com.brandon.nivel1.strings;

import java.util.Arrays;

/**
 * Nivel 1: Algoritmia con Strings.
 * 
 * Problema: Detector de Anagramas.
 * Un anagrama es una palabra o frase formada reordenando las letras de otra.
 * Ejemplo: "Listen" y "Silent" son anagramas.
 * 
 * <p>Teoría de optimización:
 * Aunque podríamos ordenar ambos strings (O(n log n)), una solución más eficiente
 * usa una tabla de frecuencias (array de enteros) para contar caracteres, 
 * logrando una complejidad lineal O(n).</p>
 */
public class DetectorAnagramas {

    /**
     * Verifica si dos cadenas son anagramas.
     * 
     * @param s1 Primera cadena.
     * @param s2 Segunda cadena.
     * @return true si son anagramas, false en caso contrario.
     */
    public boolean sonAnagramas(String s1, String s2) {
        // 1. Limpieza: Quitar espacios y pasar a minúsculas
        String str1 = s1.replaceAll("\\s+", "").toLowerCase();
        String str2 = s2.replaceAll("\\s+", "").toLowerCase();

        // 2. Si las longitudes difieren, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // 3. Contar frecuencias (asumiendo caracteres estándar ASCII/Unicode básico)
        // Usamos un array de 256 posiciones para los valores ASCII
        int[] frecuencias = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frecuencias[str1.charAt(i)]++;
            frecuencias[str2.charAt(i)]--;
        }

        // 4. Si todas las frecuencias volvieron a cero, son anagramas
        for (int f : frecuencias) {
            if (f != 0) return false;
        }

        return true;
    }
}
