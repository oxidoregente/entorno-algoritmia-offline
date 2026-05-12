package com.brandon.nivel01.strings;

/**
 * SOLUCIÓN: Invertir Vocales.
 * 
 * <p>Teoría (Two Pointers):
 * Usamos un puntero al inicio y otro al final. Movemos cada puntero hacia el centro
 * hasta que ambos apunten a una vocal. En ese momento, las intercambiamos y continuamos.</p>
 */
public class InvertirVocalesSolucion {

    public String invertir(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        String vocales = "aeiouAEIOU";
        
        while (i < j) {
            while (i < j && vocales.indexOf(chars[i]) == -1) i++;
            while (i < j && vocales.indexOf(chars[j]) == -1) j--;
            
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            
            i++;
            j--;
        }
        
        return new String(chars);
    }
}
