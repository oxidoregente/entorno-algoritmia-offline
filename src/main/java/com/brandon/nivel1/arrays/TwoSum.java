package com.brandon.nivel1.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problema: Two Sum (Suma de Dos)
 * Dado un array de enteros 'numeros' y un entero 'objetivo', 
 * devuelve los índices de los dos números que sumen el 'objetivo'.
 */
public class TwoSum {

    public int[] resolver(int[] numeros, int objetivo) {
        // Usamos un mapa para guardar el valor y su índice para búsqueda rápida O(1)
        Map<Integer, Integer> complementos = new HashMap<>();
        
        for (int i = 0; i < numeros.length; i++) {
            int complemento = objetivo - numeros[i];
            
            if (complementos.containsKey(complemento)) {
                return new int[] { complementos.get(complemento), i };
            }
            
            complementos.put(numeros[i], i);
        }
        
        throw new IllegalArgumentException("No se encontró solución");
    }
}
