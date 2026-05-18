package com.algoritmia.nivel01.arrays;

/**
 * RETO: Máximo Subarreglo (Algoritmo de Kadane).
 * 
 * Dado un array de enteros 'nums', encuentra el subarreglo contiguo (que
 * contenga al menos un número) que tenga la mayor suma y devuelve dicha suma.
 * 
 * Ejemplo: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4] Resultado: 6 (El subarreglo
 * [4, -1, 2, 1] tiene la suma más grande).
 */
public class MaximoSubarregloEnunciado {

	/**
	 * Calcula la suma máxima de un subarreglo contiguo.
	 * 
	 * @param nums Array de enteros.
	 * @return La suma máxima encontrada.
	 */
	public int encontrarSumaMaxima(int[] nums) {
		// TODO: Implementa tu lógica aquí usando el Algoritmo de Kadane

		int sumaMaxima = nums[0];
		int sumaActual = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sumaActual = Math.max(nums[i], sumaActual + nums[i]);

			sumaMaxima = Math.max(sumaMaxima, sumaActual);
		}

		return sumaMaxima;
	}
}
