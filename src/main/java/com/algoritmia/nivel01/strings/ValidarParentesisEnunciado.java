package com.algoritmia.nivel01.strings;

import java.util.Stack;

/**
 * 🎓 RETO: Validar Paréntesis. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un string que contiene solo los caracteres '(', ')', '{', '}', '[' y
 * ']', determina si el string de entrada es válido.
 * </p>
 *
 * <p>
 * Un string es válido si:
 * </p>
 * <ol>
 * <li>Los brackets abiertos deben cerrarse por brackets del mismo tipo.</li>
 * <li>Los brackets abiertos deben cerrarse en el orden correcto.</li>
 * </ol>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "()[]{}" -> true
 * "(]"     -> false
 * "([)]"   -> false
 * "{[]}"   -> true
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa una pila (`Stack` o `Deque`) para rastrear los brackets de
 * apertura.</li>
 * <li>Cuando encuentres un bracket de cierre, verifica que el tope de la pila
 * sea su correspondiente apertura.</li>
 * <li>Al final, la pila debe estar vacía para que el string sea válido.</li>
 * </ul>
 */
public class ValidarParentesisEnunciado {

	/**
	 * Verifica si el string de entrada tiene los brackets balanceados y
	 * correctamente anidados.
	 *
	 * @param s String que contiene solo los caracteres '(', ')', '{', '}', '[' y
	 *          ']'.
	 * @return true si el string es válido, false en caso contrario.
	 */
	public boolean esValido(String s) {
		// TODO: Implementa la validación usando una pila (Stack)

		if (s == null)
			return false;

		if (s.isEmpty())
			return true;

		var pila = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
				if (pila.isEmpty())
					return false;

				char apertura = pila.pop();

				if ((apertura != '{' && c == '}') || (apertura != '[' && c == ']') || (apertura != '(' && c == ')'))
					return false;

			} else {
				pila.push(c);
			}
		}

		return pila.isEmpty();
	}
}
