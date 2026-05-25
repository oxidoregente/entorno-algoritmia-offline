package com.algoritmia.nivel01.recursion;

import java.util.ArrayList;

/**
 * 🎓 RETO: Serie de Fibonacci. <b>Dificultad: Fácil</b>
 *
 * <p>
 * La sucesión de Fibonacci es una serie infinita de números naturales donde
 * cada término es la suma de los dos anteriores:
 * </p>
 * 
 * <pre>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n-1) + F(n-2) para n >= 2
 * </pre>
 *
 * <p>
 * Tu tarea es implementar el cálculo del n-ésimo número de Fibonacci usando
 * exclusivamente RECURSIÓN.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * n = 0 -> 0
 * n = 1 -> 1
 * n = 6 -> 8 (0, 1, 1, 2, 3, 5, 8)
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Los casos base son n=0 y n=1.</li>
 * <li>Para n >= 2, retorna la suma de los dos números anteriores.</li>
 * <li>Ten en cuenta que esta implementación recursiva simple tiene complejidad
 * exponencial O(2^n). No es necesario optimizarla para este reto.</li>
 * </ul>
 */
public class FibonacciEnunciado {

	/**
	 * Calcula el n-ésimo número de Fibonacci usando recursión.
	 *
	 * @param n La posición en la secuencia de Fibonacci (no negativo).
	 * @return El valor de Fibonacci en la posición n.
	 */
	public int calcular(int n) {
		// TODO: Implementa la lógica recursiva
		if (lista.contains(n))
			return lista.get(n);
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;

		int calculo = calcular(n - 1) + calcular(n - 2);
		lista.add(calculo);
		return calculo;

	}
	// Almacena las sumas ya realizadas para evitar sobre-recursión
	ArrayList<Integer> lista = new ArrayList<>();
}
