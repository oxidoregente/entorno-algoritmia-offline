package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Producto de Array excepto propio.
 */
public class ProductoExceptoPropioSolucion {

    public int[] calcular(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Paso 1: Productos a la izquierda
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        // Paso 2: Productos a la derecha multiplicados por los de la izquierda
        int derecha = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= derecha;
            derecha *= nums[i];
        }
        
        return res;
    }
}
