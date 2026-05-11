package com.brandon.nivel1.strings;

/**
 * SOLUCIÓN: Detector de Anagramas.
 * 
 * <p>Teoría de optimización:
 * Aunque podríamos ordenar ambos strings (O(n log n)), una solución más eficiente
 * usa una tabla de frecuencias (array de enteros) para contar caracteres, 
 * logrando una complejidad lineal O(n).</p>
 */
public class DetectorAnagramasSolucion {

    public boolean sonAnagramas(String s1, String s2) {
        // 1. Limpieza: Quitar espacios y pasar a minúsculas
        String str1 = s1.replaceAll("\\s+", "").toLowerCase();
        String str2 = s2.replaceAll("\\s+", "").toLowerCase();

        // 2. Si las longitudes difieren, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // 3. Contar frecuencias (asumiendo caracteres estándar ASCII/Unicode básico)
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
