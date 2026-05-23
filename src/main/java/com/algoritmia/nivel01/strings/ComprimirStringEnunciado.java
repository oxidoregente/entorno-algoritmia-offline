package com.algoritmia.nivel01.strings;

/**
 * 🎓 RETO: Compresión de Strings. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Implementa un método para realizar una compresión básica de strings
 * utilizando el conteo de caracteres consecutivos repetidos.
 * </p>
 *
 * <p>
 * Por cada grupo de caracteres iguales consecutivos, se reemplaza por el
 * carácter seguido del número de repeticiones.
 * </p>
 *
 * <p>
 * Si el string "comprimido" resultante no es más pequeño que el original, el
 * método debe devolver el string original sin modificar.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "aabcccccaaa" -> "a2b1c5a3"
 * "abc"         -> "abc" (comprimido "a1b1c1" es más largo)
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa un `StringBuilder` para construir el resultado de forma
 * eficiente.</li>
 * <li>Recorre el string con un puntero, contando las repeticiones
 * consecutivas.</li>
 * <li>Al final, compara la longitud del resultado con el original antes de
 * decidir qué devolver.</li>
 * </ul>
 */
public class ComprimirStringEnunciado {

	/**
	 * Comprime un string usando el conteo de caracteres repetidos consecutivos. Si
	 * la compresión no resulta en un string más corto, devuelve el original.
	 *
	 * @param s El string a comprimir.
	 * @return El string comprimido o el original si la compresión es más larga.
	 */
	public String comprimir(String s) {
		// TODO: Implementa la compresión básica

		var comprimido = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;
			if (i + 1 < s.length()) {
				if (s.charAt(i) != s.charAt(i + 1)) {
					comprimido.append(s.charAt(i) + Integer.toString(count));
					count = 0;
				}
			} else {
				comprimido.append(s.charAt(i) + Integer.toString(count));
			}
		}
		System.out.println(comprimido.toString());

		return comprimido.toString().length() < s.length() ? comprimido.toString() : s;
	}
}
