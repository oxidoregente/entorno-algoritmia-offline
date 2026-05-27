package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Número Faltante. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un array `nums` que contiene `n` números distintos en el rango [0, n],
 * encuentra y devuelve el único número del rango que falta en el array.
 * </p>
 *
 * <p>
 * El array tiene exactamente `n` elementos, pero el rango [0, n] contiene `n+1`
 * números, por lo que siempre faltará exactamente un número.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * Entrada: nums = [3, 0, 1]
 * Salida:  2
 * Explicación: n = 3, el rango es [0, 3]. Faltante: 2.
 *
 * Entrada: nums = [0, 1]
 * Salida:  2
 * Explicación: n = 2, el rango es [0, 2]. Faltante: 2.
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Puedes usar la fórmula de la suma de Gauss: n * (n + 1) / 2.</li>
 * <li>Calcula la suma esperada teórica y réstale la suma real de los elementos
 * del array.</li>
 * <li>También puedes usar la operación XOR para una solución alternativa.</li>
 * </ul>
 */
public class NumeroFaltanteEnunciado {

	/**
	 * Encuentra el número faltante en el rango [0, n] dentro del array.
	 *
	 * @param nums Array de n números distintos en el rango [0, n].
	 * @return El único número del rango que falta en el array.
	 */
	public int encontrarFaltante(int[] nums) {
		// TODO: Implementa tu lógica aquí.

		int length = nums.length;
		int sum = 0;

		for (int n : nums)
			sum += n;

		int sumGauss = length * (length + 1) / 2;
		int value = sumGauss - sum;

		return value;
	}
}
