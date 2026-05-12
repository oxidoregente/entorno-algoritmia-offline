package com.brandon.nivel01.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * SOLUCIÓN: Subcadena más larga sin repetir.
 * 
 * <p>Teoría: Usamos dos punteros para crear una "ventana" que se expande hacia 
 * la derecha. Si encontramos un carácter repetido, contraemos la ventana desde 
 * la izquierda hasta que vuelva a ser válida.</p>
 */
public class SubcadenaSinRepetirSolucion {

    public int longitudMax(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
