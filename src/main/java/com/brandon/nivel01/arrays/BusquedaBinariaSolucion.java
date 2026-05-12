package com.brandon.nivel01.arrays;

/**
 * SOLUCIÓN: Búsqueda Binaria.
 * 
 * <p>Teoría:
 * La búsqueda binaria divide repetidamente a la mitad el rango de búsqueda.
 * Funciona comparando el elemento medio con el objetivo.
 * Si no coinciden, se descarta la mitad en la que el valor no puede estar.</p>
 */
public class BusquedaBinariaSolucion {

    public int buscar(int[] nums, int objetivo) {
        int inicio = 0;
        int fin = nums.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (nums[medio] == objetivo) return medio;

            if (nums[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }
}
