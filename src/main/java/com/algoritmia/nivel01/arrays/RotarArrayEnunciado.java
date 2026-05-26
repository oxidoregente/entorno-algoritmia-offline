package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Rotar Array. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un array de enteros `nums`, implementa una función para rotar el array
 * hacia la derecha una cantidad de `k` pasos. La rotación debe ser in-place
 * (modificando el array original directamente) y con la mejor complejidad de
 * tiempo y espacio posible.
 * </p>
 *
 * <p>
 * La cantidad de pasos `k` siempre será no negativa.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Entrada: nums = [1,2,3,4,5,6,7], k = 3
 * Salida:  [5,6,7,1,2,3,4]
 * Explicación:
 * 1. rotar 1 paso: [7,1,2,3,4,5,6]
 * 2. rotar 2 pasos: [6,7,1,2,3,4,5]
 * 3. rotar 3 pasos: [5,6,7,1,2,3,4]
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Considera cómo manejar `k` si es mayor que la longitud del array.</li>
 * <li>Puedes usar un array auxiliar para una solución más sencilla, o intentar
 * una solución más eficiente invirtiendo segmentos del array (como se sugiere
 * en la teoría de la solución).</li>
 * </ul>
 */
public class RotarArrayEnunciado {

	/**
	 * Rota los elementos de un array de enteros hacia la derecha en `k` posiciones.
	 * La rotación se realiza in-place.
	 *
	 * @param nums El array de enteros a rotar.
	 * @param k    El número de pasos a rotar hacia la derecha. `k` es no negativo.
	 */
	public void rotar(int[] nums, int k) {
		// TODO: Implementa tu lógica aquí.
		// Asegúrate de considerar el caso donde k es mayor que la longitud del array.

		if (k < 0 || k > nums.length)
			return;

		while (k > 0) {
			for (int i = 1; i < nums.length; i++) {
				int aux = nums[0];
				nums[0] = nums[i];
				nums[i] = aux;
			}
			k--;
		}
	}
}
