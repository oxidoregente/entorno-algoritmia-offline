package com.brandon.nivel01.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLUCIÓN: Two Sum (Suma de Dos).
 * 
 * <p>Teoría:
 * La solución ingenua usa dos bucles anidados (O(n^2)). La solución óptima 
 * usa un 'HashMap' para almacenar los números ya vistos y su índice.
 * En cada paso, calculamos el 'complemento' (objetivo - numeroActual) y 
 * verificamos si ya existe en el mapa.</p>
 */
public class TwoSumSolucion {

    public int[] resolver(int[] nums, int objetivo) {
        Map<Integer, Integer> complementos = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            
            if (complementos.containsKey(complemento)) {
                return new int[] { complementos.get(complemento), i };
            }
            
            complementos.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No se encontró solución");
    }
}
