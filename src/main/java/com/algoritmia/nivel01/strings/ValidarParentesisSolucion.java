package com.algoritmia.nivel01.strings;

import java.util.Stack;

/**
 * SOLUCIÓN: Validar Paréntesis.
 * 
 * <p>Teoría:
 * Usamos una Pila (Stack) para rastrear los brackets abiertos. Cuando encontramos
 * uno de cierre, verificamos si coincide con el último bracket abierto (el tope de la pila).
 * Si la pila está vacía al final, todos los brackets se cerraron correctamente.</p>
 */
public class ValidarParentesisSolucion {

    public boolean esValido(String s) {
        Stack<Character> pila = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else {
                if (pila.isEmpty()) return false;
                
                char tope = pila.pop();
                if (c == ')' && tope != '(') return false;
                if (c == '}' && tope != '{') return false;
                if (c == ']' && tope != '[') return false;
            }
        }
        
        return pila.isEmpty();
    }
}
