package com.algoritmia.nivel01.arrays;

/**
 * RETO: Búsqueda Binaria.
 * 
 * Dado un array de enteros 'nums' ordenado de forma ascendente y un entero
 * 'objetivo', escribe una función para buscar el 'objetivo' en 'nums'. Si el
 * objetivo existe, devuelve su índice. De lo contrario, devuelve -1.
 * 
 * Tu solución DEBE tener una complejidad logarítmica O(log n).
 */
public class BusquedaBinariaEnunciado {

	public int buscar(int[] nums, int objetivo) {
		if (nums.length == 0 || nums == null)
			return -1;

		int inicio = 0;
		int fin = nums.length - 1;

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;

			int valorMedio = nums[medio];

			if (valorMedio == objetivo)
				return medio;

			if (objetivo < valorMedio)
				fin = medio - 1;
			else
				inicio = medio + 1;
		}

		return -1;
	}
}
