package com.algoritmia.nivel01.recursion;

/**
 * 🎓 RETO: Suma Recursiva de Dígitos. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un número entero no negativo `n`, calcula la suma de todos sus dígitos
 * usando exclusivamente RECURSIÓN (sin bucles).
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * n = 123 -> 6 (1 + 2 + 3)
 * n = 45  -> 9 (4 + 5)
 * n = 0   -> 0
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>El caso base es cuando `n` es 0.</li>
 * <li>Usa `n % 10` para obtener el último dígito y `n / 10` para eliminar el
 * último dígito.</li>
 * <li>Retorna el último dígito + sumaRecursiva(n / 10).</li>
 * </ul>
 */
public class SumaRecursivaDigitosEnunciado {

	/**
	 * Calcula la suma de los dígitos de un número usando recursión.
	 *
	 * @param n El número entero no negativo.
	 * @return La suma de sus dígitos.
	 */
	public int sumar(int n) {
		// TODO: Implementa la lógica recursiva

		if (n == 0)
			return 0;
		
		System.out.println(n%10);
		
		return n%10 + sumar((n/10));
	}
}
