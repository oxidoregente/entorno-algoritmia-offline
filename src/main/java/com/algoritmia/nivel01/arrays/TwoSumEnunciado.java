package com.algoritmia.nivel01.arrays;

import java.util.HashMap;

/**
 * 🎓 RETO: Two Sum (Suma de Dos). <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un array de enteros `nums` y un entero `objetivo`, encuentra los índices
 * de los dos números en el array que suman exactamente el valor del `objetivo`.
 * </p>
 *
 * <p>
 * Puedes asumir que cada entrada tiene exactamente una solución y no puedes
 * usar el mismo elemento dos veces. El orden de los índices en el resultado no
 * importa.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Entrada: nums = [2, 7, 11, 15], objetivo = 9
 * Salida:  [0, 1]
 * Explicación: nums[0] + nums[1] = 2 + 7 = 9
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Una solución ingenua con dos bucles anidados tiene complejidad
 * O(n²).</li>
 * <li>Para lograr O(n), considera usar un `HashMap` que almacene los números ya
 * vistos y sus índices.</li>
 * <li>En cada iteración, calcula el complemento: objetivo - nums[i] y verifica
 * si ya existe en el mapa.</li>
 * </ul>
 */
public class TwoSumEnunciado {

	/**
	 * Encuentra los índices de dos números en el array que suman el objetivo.
	 *
	 * @param nums     Array de enteros de entrada.
	 * @param objetivo El valor objetivo que deben sumar los dos números.
	 * @return Un array de dos enteros con los índices de los números que suman el
	 *         objetivo.
	 * @throws IllegalArgumentException Si no se encuentra ninguna solución.
	 */
	public int[] resolver(int[] nums, int objetivo) {
		// TODO: Implementa tu lógica aquí. Intenta lograr una complejidad O(n).

		HashMap<Integer, Integer> mapa = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complemento = objetivo - nums[i];

			if (mapa.containsKey(complemento)) {
				return new int[] { mapa.get(complemento), i };
			}

			mapa.put(nums[i], i);
		}

		throw new IllegalArgumentException("No se encontró solución");
	}
}
