package com.algoritmia.nivel01.strings;

/**
 * 🎓 RETO: Palíndromo. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Un palíndromo es una palabra o frase que se lee igual de adelante hacia
 * atrás. Ejemplos: "Anita lava la tina", "Ojo", "Radar".
 * </p>
 *
 * <p>
 * Tu tarea es implementar un método que devuelva `true` si el string es un
 * palíndromo, ignorando mayúsculas, espacios y signos de puntuación. Solo debes
 * considerar caracteres alfanuméricos.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "Anita lava la tina" -> true
 * "Ojo"                -> true
 * "Hola mundo"         -> false
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa dos punteros, uno al inicio y otro al final del string.</li>
 * <li>Omite caracteres no alfanuméricos con `Character.isLetterOrDigit()`.</li>
 * <li>Compara los caracteres ignorando mayúsculas/minúsculas.</li>
 * </ul>
 */
public class PalindromoEnunciado {

	/**
	 * Verifica si un string es un palíndromo, ignorando mayúsculas, espacios y
	 * puntuación.
	 *
	 * @param texto El string a verificar.
	 * @return true si es palíndromo, false en caso contrario.
	 */
	public boolean esPalindromo(String texto) {
		// TODO: Implementa la verificación con dos punteros

		if (texto.trim() == "")
			return true;

		String textLower = texto.toLowerCase().replaceAll(" ", "");

		for (int i = 0; i < textLower.length(); i++) {
			char init = textLower.charAt(i);
			char fin = textLower.charAt(textLower.length() - 1 - i);

			if (init != fin)
				return false;

		}

		return true;
	}
}
