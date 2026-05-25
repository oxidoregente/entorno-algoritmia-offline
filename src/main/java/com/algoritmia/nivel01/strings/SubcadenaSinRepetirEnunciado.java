package com.algoritmia.nivel01.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 🎓 RETO: Subcadena más larga sin caracteres repetidos. <b>Dificultad:
 * Media</b>
 *
 * <p>
 * Encuentra la longitud de la subcadena más larga dentro de un string que no
 * contenga caracteres repetidos.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "abcabcbb" -> 3 (subcadena "abc")
 * "bbbbb"    -> 1 (subcadena "b")
 * "pwwkew"   -> 3 (subcadena "wke")
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa la técnica de Ventana Deslizante (Sliding Window) con dos
 * punteros.</li>
 * <li>Mantén un conjunto (`Set` o `HashSet`) de caracteres vistos en la ventana
 * actual.</li>
 * <li>Cuando encuentres un caracter repetido, mueve el puntero izquierdo para
 * eliminar caracteres de la ventana hasta que el caracter repetido desaparezca.
 * </li>
 * </ul>
 */
public class SubcadenaSinRepetirEnunciado {

	/**
	 * Encuentra la longitud de la subcadena más larga sin caracteres repetidos.
	 *
	 * @param s String de entrada.
	 * @return La longitud máxima de una subcadena sin caracteres repetidos.
	 */
	public int longitudMax(String s) {
		// TODO: Implementa usando la técnica de Sliding Window

		if (s == null || s.trim().equals(""))
			return 0;

		var coleccion = new HashSet<Character>();

		int inicio = 0;
		int maxLongitud = 0;

		for (int fin = 0; fin < s.length(); fin++) {
			char charActual = s.charAt(fin);

			while (coleccion.contains(charActual)) {
				coleccion.remove(s.charAt(inicio));
				inicio++;
			}

			coleccion.add(charActual);

			maxLongitud = Math.max(maxLongitud, (fin - inicio) + 1);
		}

		return maxLongitud;
	}
}
