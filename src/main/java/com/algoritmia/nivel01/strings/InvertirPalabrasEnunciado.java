package com.algoritmia.nivel01.strings;

/**
 * 🎓 RETO: Invertir Palabras. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Dada una oración representada como un string con palabras separadas por
 * espacios, invierte el orden de las palabras.
 * </p>
 *
 * <p>
 * Las palabras están separadas por un solo espacio. No debe haber espacios
 * adicionales al inicio o final del resultado.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * "Hola Mundo Java" -> "Java Mundo Hola"
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Divide el string por espacios usando `String.split(" ")`.</li>
 * <li>Recorre el array resultante en orden inverso y construye el nuevo
 * string.</li>
 * <li>Únelos usando `String.join(" ", ...)` o un `StringBuilder`.</li>
 * </ul>
 */
public class InvertirPalabrasEnunciado {

	/**
	 * Invierte el orden de las palabras en una oración.
	 *
	 * @param oracion La oración de entrada con palabras separadas por espacios.
	 * @return La oración con las palabras en orden inverso.
	 */

	public String invertir(String oracion) {
		// TODO: Implementa la inversión de palabras

		/*
		 * Solución de Kevin String cadena = oracion; String[] invertir=
		 * cadena.split(" "); StringBuilder inverso = new StringBuilder();
		 * 
		 * for(int i=(invertir.length)-1; i>=0;i--) { System.out.print(invertir[i]);
		 * inverso.append(invertir[i]+" "); } System.out.println(" ");
		 * System.out.println(inverso);
		 * 
		 * return inverso.toString().trim();
		 */

		if (oracion.trim() == "")
			return "";

		String[] words = oracion.trim().split(" ");
		var wordsInvert = new StringBuilder();

		System.out.println(String.join(" ", words).toString());

		for (int i = words.length - 1; i >= 0; i--) {
			wordsInvert.append(words[i]);
			if (i != 0)
				wordsInvert.append(" ");
		}

		System.out.println(wordsInvert.toString());

		return wordsInvert.toString();
	}

};