package com.algoritmia.nivel01.recursion;

/**
 * 🎓 RETO: Factorial Recursivo. <b>Dificultad: Fácil</b>
 *
 * <p>
 * El factorial de un número entero positivo `n` (n!) es el producto de todos
 * los números desde 1 hasta `n`. Por definición, 0! = 1.
 * </p>
 *
 * <p>
 * Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120.
 * </p>
 *
 * <p>
 * Tu tarea es implementar el cálculo del factorial usando exclusivamente
 * RECURSIÓN.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * n = 0  -> 1
 * n = 5  -> 120
 * n = 10 -> 3628800
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>El caso base es n = 0, que retorna 1.</li>
 * <li>Para n > 0, retorna n * factorial(n - 1).</li>
 * <li>Se usa `long` para el resultado ya que el factorial crece
 * rápidamente.</li>
 * </ul>
 */
public class FactorialEnunciado {

	/**
	 * Calcula el factorial de n usando recursión.
	 *
	 * @param n Número entero no negativo.
	 * @return El factorial de n.
	 */
	public long calcular(int n) {
		if (n == 0)
			return 1;
		return n * calcular(n - 1);
	}
}
