package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Rotar Array.
 * 
 * <p>Teoría:
 * Una forma eficiente de rotar sin espacio extra O(1) es:
 * 1. Invertir todo el array.
 * 2. Invertir los primeros 'k' elementos.
 * 3. Invertir el resto de los elementos.</p>
 */
public class RotarArraySolucion {

    public void rotar(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k %= nums.length;
        
        invertir(nums, 0, nums.length - 1);
        invertir(nums, 0, k - 1);
        invertir(nums, k, nums.length - 1);
    }

    private void invertir(int[] nums, int inicio, int fin) {
        while (inicio < fin) {
            int temp = nums[inicio];
            nums[inicio] = nums[fin];
            nums[fin] = temp;
            inicio++;
            fin--;
        }
    }
}
