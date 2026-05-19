package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Búsqueda Binaria. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un array de enteros `nums` ordenado de forma ascendente y un entero
 * `objetivo`, implementa una función para buscar el `objetivo` dentro del
 * array.
 * </p>
 *
 * <p>
 * Si el objetivo existe, devuelve su índice. De lo contrario, devuelve -1.
 * </p>
 *
 * <p>
 * Tu solución DEBE tener una complejidad logarítmica O(log n).
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Entrada: nums = [-1, 0, 3, 5, 9, 12], objetivo = 9
 * Salida:  4
 *
 * Entrada: nums = [-1, 0, 3, 5, 9, 12], objetivo = 2
 * Salida:  -1
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Mantén dos punteros: `inicio` y `fin` que definan el rango de
 * búsqueda.</li>
 * <li>Calcula el índice medio con `inicio + (fin - inicio) / 2` para evitar
 * desbordamiento.</li>
 * <li>Reduce el rango a la mitad en cada iteración comparando el valor medio
 * con el objetivo.</li>
 * </ul>
 */
public class BusquedaBinariaEnunciado {

	/**
	 * Busca un valor objetivo en un array ordenado ascendentemente.
	 *
	 * @param nums     Array de enteros ordenado de forma ascendente.
	 * @param objetivo El valor entero a buscar.
	 * @return El índice del objetivo si existe, o -1 si no se encuentra.
	 */
	public int buscar(int[] nums, int objetivo) {
		// TODO: Implementa la lógica de búsqueda binaria con complejidad O(log n)

		int inicio = 0;
		int fin = nums.length - 1;

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;
			int valorMedio = nums[medio];

			if (objetivo == valorMedio)
				return medio;

			if (objetivo < valorMedio)
				fin = medio - 1;
			else
				inicio = medio + 1;
		}

		return -1;
	}
}
