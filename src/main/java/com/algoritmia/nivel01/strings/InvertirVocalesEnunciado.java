package com.algoritmia.nivel01.strings;

/**
 * 🎓 RETO: Invertir Vocales. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dado un string, invierte solo las vocales del mismo. Las vocales a considerar
 * son 'a', 'e', 'i', 'o', 'u' (y sus equivalentes en mayúsculas). El resto de
 * los caracteres deben permanecer en sus posiciones originales.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "hello"    -> "holle"
 * "leetcode" -> "leotcede"
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa dos punteros, uno al inicio y otro al final del string.</li>
 * <li>Mueve ambos punteros hasta encontrar una vocal cada uno, luego
 * intercámbialas.</li>
 * <li>Convierte el string a un arreglo de caracteres para facilitar el
 * intercambio.</li>
 * </ul>
 */
public class InvertirVocalesEnunciado {

	/**
	 * Invierte solo las vocales en el string dado.
	 *
	 * @param s El string de entrada.
	 * @return El string con las vocales invertidas.
	 */
	public String invertir(String s) {
		// TODO: Implementa el intercambio de vocales con dos punteros

		if (s.trim().equals(""))
			return "";

		char[] cadena = s.toCharArray();
		int i = 0;
		int f = s.length() - 1;

		var cadenaResultado = new StringBuilder();

		int a = -1;
		int b = -1;

		while (i < f) {
			if (isVocal(cadena[i]) && a < 0) {
				a = i;
			}

			if (isVocal(cadena[f]) && b < 0) {
				b = f;
			}

			if (a > 0 && b > 0) {
				var temp = cadena[a];
				cadena[a] = cadena[b];
				cadena[b] = temp;

				a = -1;
				b = -1;
			}

			i++;
			f--;
		}

		for (char c : cadena)
			cadenaResultado.append(c);

		return cadenaResultado.toString();
	}

	private boolean isVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
