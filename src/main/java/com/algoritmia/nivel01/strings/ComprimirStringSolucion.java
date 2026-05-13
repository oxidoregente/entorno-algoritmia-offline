package com.algoritmia.nivel01.strings;

/**
 * SOLUCIÓN: Compresión de Strings.
 * 
 * <p>Teoría:
 * Recorremos el string contando las ocurrencias consecutivas de cada carácter.
 * Usamos un StringBuilder para construir el resultado eficientemente.</p>
 */
public class ComprimirStringSolucion {

    public String comprimir(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder comprimido = new StringBuilder();
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            contador++;
            
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                comprimido.append(s.charAt(i));
                comprimido.append(contador);
                contador = 0;
            }
        }

        return comprimido.length() < s.length() ? comprimido.toString() : s;
    }
}
