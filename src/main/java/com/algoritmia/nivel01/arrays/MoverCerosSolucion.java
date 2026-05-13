package com.algoritmia.nivel01.arrays;

/**
 * SOLUCIÓN: Mover Ceros al Final.
 * 
 * <p>Teoría:
 * Usamos el enfoque de "Puntero de Escritura". Recorremos el array y cada vez
 * que encontramos un número distinto de cero, lo movemos a la posición del puntero
 * y avanzamos dicho puntero. Al final, rellenamos el resto con ceros.</p>
 */
public class MoverCerosSolucion {

    public void mover(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int punteroEscritura = 0;

        // Paso 1: Mover no-ceros al frente
        for (int num : nums) {
            if (num != 0) {
                nums[punteroEscritura++] = num;
            }
        }

        // Paso 2: Rellenar el resto con ceros
        while (punteroEscritura < nums.length) {
            nums[punteroEscritura++] = 0;
        }
    }
}
