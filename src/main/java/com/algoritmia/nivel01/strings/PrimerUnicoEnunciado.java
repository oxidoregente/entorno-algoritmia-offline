package com.algoritmia.nivel01.strings;

/**
 * 🎓 RETO: Primer Carácter Único.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Dado un string, encuentra el primer carácter que no se repite y devuelve su índice.
 * Si no existe ningún carácter único, devuelve -1.</p>
 *
 * <h3>Ejemplos:</h3>
 * <pre>
 * "leetcode"      -> 0 (la 'l' es la primera en no repetirse)
 * "loveleetcode"  -> 2 (la 'v' es la primera en no repetirse)
 * "aabb"          -> -1 (todos se repiten)
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Primero cuenta la frecuencia de cada carácter usando un HashMap o un array de 26/256.</li>
 *   <li>Luego recorre el string por segunda vez y devuelve el índice del primer carácter con frecuencia 1.</li>
 * </ul>
 */
public class PrimerUnicoEnunciado {

    /**
     * Encuentra el índice del primer carácter que no se repite en el string.
     *
     * @param s String de entrada.
     * @return El índice del primer carácter único, o -1 si no existe.
     */
    public int encontrar(String s) {
        // TODO: Implementa el cálculo usando una tabla de frecuencias
        return -1;
    }
}
