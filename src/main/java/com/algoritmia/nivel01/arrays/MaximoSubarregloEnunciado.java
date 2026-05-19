package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Máximo Subarreglo (Algoritmo de Kadane).
 * <b>Dificultad: Media</b>
 *
 * <p>Dado un array de enteros `nums`, encuentra el subarreglo contiguo (que
 * contenga al menos un número) que tenga la mayor suma y devuelve dicha suma.</p>
 *
 * <p>El objetivo es implementar el Algoritmo de Kadane, una técnica de programación
 * dinámica que resuelve este problema en tiempo lineal O(n).</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Salida:  6
 * Explicación: El subarreglo [4, -1, 2, 1] tiene la suma más grande (6).
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Recorre el array manteniendo dos variables: `sumaActual` y `sumaMaxima`.</li>
 *   <li>En cada paso, decide si empezar un nuevo subarreglo en la posición actual
 *       o extender el subarreglo existente.</li>
 *   <li>Usa `Math.max(nums[i], sumaActual + nums[i])` para esta decisión.</li>
 * </ul>
 */
public class MaximoSubarregloEnunciado {

	/**
	 * Calcula la suma máxima de un subarreglo contiguo usando el Algoritmo de Kadane.
	 *
	 * @param nums Array de enteros, puede ser nulo o vacío.
	 * @return La suma máxima encontrada. Retorna 0 si el array es nulo o vacío.
	 */
	public int encontrarSumaMaxima(int[] nums) {
		// TODO: Implementa el Algoritmo de Kadane
		// Mantén sumaActual y sumaMaxima, actualízalos en cada iteración
		return 0;
	}
}
