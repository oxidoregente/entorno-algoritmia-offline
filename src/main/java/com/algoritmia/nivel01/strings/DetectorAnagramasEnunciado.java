package com.algoritmia.nivel01.strings;

import java.util.HashMap;

/**
 * 🎓 RETO: Detector de Anagramas. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Un anagrama es una palabra o frase formada reordenando las letras de otra.
 * Ejemplo: "Listen" y "Silent" son anagramas.
 * </p>
 *
 * <p>
 * Tu tarea es implementar un método que reciba dos strings y devuelva `true` si
 * son anagramas, ignorando espacios y mayúsculas/minúsculas.
 * </p>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "Listen", "Silent" -> true
 * "Hola", "Mundo"    -> false
 * "Ana", "Nana"      -> true
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Limpia ambos strings eliminando espacios y convirtiendo a
 * minúsculas.</li>
 * <li>Puedes ordenar los caracteres de ambos strings y compararlos.</li>
 * <li>Alternativamente, cuenta la frecuencia de cada letra usando un array de
 * 26.</li>
 * </ul>
 */
public class DetectorAnagramasEnunciado {

	/**
	 * Verifica si dos cadenas son anagramas entre sí.
	 *
	 * @param s1 Primera cadena.
	 * @param s2 Segunda cadena.
	 * @return true si son anagramas, false en caso contrario.
	 */
	public boolean sonAnagramas(String s1, String s2) {
		// TODO: Implementa la detección de anagramas

		if (s1.trim() == "" || s2.trim() == "")
			return true;

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : s1.toLowerCase().toCharArray()) {
			if (!map.containsKey(c))
				map.put(c, 1);
			else
				map.replace(c, map.get(c) + 1);
		}
		
		

		System.out.println(s1 + " " + map.toString());

		return false;
	}
}
