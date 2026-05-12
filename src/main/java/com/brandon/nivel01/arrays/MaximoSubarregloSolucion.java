package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Máximo Subarreglo (Algoritmo de Kadane).
 * 
 * <p>Teoría:
 * El algoritmo de Kadane es una técnica de programación dinámica que resuelve este 
 * problema en tiempo lineal O(n). La idea es recorrer el array manteniendo dos variables:
 * 1. 'sumaActual': La suma del subarreglo que termina en la posición actual.
 * 2. 'sumaMaxima': La mayor suma encontrada hasta el momento.</p>
 * 
 * <p>En cada paso, decidimos si empezar un nuevo subarreglo en el número actual 
 * o continuar el subarreglo existente sumando el número actual.</p>
 */
public class MaximoSubarregloSolucion {

    public int encontrarSumaMaxima(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int sumaMaxima = nums[0];
        int sumaActual = nums[0];

        for (int i = 1; i < nums.length; i++) {        	
            // ¿Es mejor empezar de nuevo desde nums[i] o sumar nums[i] a lo que ya traemos?
            sumaActual = Math.max(nums[i], sumaActual + nums[i]);
            
            // Actualizamos el récord global
            sumaMaxima = Math.max(sumaMaxima, sumaActual);
        }

        return sumaMaxima;
    }
}
