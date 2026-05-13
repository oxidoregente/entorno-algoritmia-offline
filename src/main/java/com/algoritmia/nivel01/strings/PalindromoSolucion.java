package com.algoritmia.nivel01.strings;

/**
 * SOLUCIÓN: Palíndromo.
 * 
 * <p>Teoría:
 * Una forma eficiente es usar dos punteros (inicio y fin) que se van acercando al centro,
 * comparando caracteres. Esto evita crear copias innecesarias del string invertido.</p>
 */
public class PalindromoSolucion {

    public boolean esPalindromo(String texto) {
        if (texto == null) return false;

        // Limpieza: solo letras y números en minúsculas
        String limpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int izquierda = 0;
        int derecha = limpio.length() - 1;

        while (izquierda < derecha) {
            if (limpio.charAt(izquierda) != limpio.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
}
