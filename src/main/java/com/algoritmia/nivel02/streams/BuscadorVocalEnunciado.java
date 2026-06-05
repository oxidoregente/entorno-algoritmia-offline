package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Buscador de Iniciales.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Validaciones tan comunes como "verificar si el usuario escribió un
 * nombre que empieza por una letra prohibida" o "comprobar si algún
 * producto del catálogo coincide con un prefijo" se resuelven con una
 * búsqueda rápida sobre una colección. Aquí verás el patrón clásico
 * de cortocircuito en streams.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Recibe un {@code List<String>} de palabras.</li>
 *   <li>Devuelve {@code true} si AL MENOS una palabra empieza por la
 *       letra 'A' (mayúscula o minúscula).</li>
 *   <li>Si la lista es {@code null} o vacía, devolver {@code false}.</li>
 *   <li>Solo se evalúa la PRIMERA letra de cada palabra.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   palabras = ["perro", "gato", "Árbol", "pez"]
 * Salida:
 *   true   (porque "Árbol" empieza por 'A')
 *
 * Entrada:
 *   palabras = ["perro", "gato", "pez"]
 * Salida:
 *   false
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code .stream()} y el short-circuit terminal
 *       {@code .anyMatch(...)}.</li>
 *   <li>Compara el primer carácter en mayúsculas:
 *       {@code palabra.charAt(0)} o {@code palabra.toUpperCase().startsWith("A")}.</li>
 * </ul>
 */
public class BuscadorVocalEnunciado {

    /**
     * Indica si existe al menos una palabra que comience por la letra 'A'
     * (insensible a mayúsculas).
     *
     * @param palabras lista de palabras a evaluar; puede ser {@code null}.
     * @return {@code true} si alguna palabra empieza por 'A' o 'a';
     *         {@code false} en caso contrario (incluida lista vacía o
     *         {@code null}).
     */
    public boolean existePalabraConA(List<String> palabras) {
        // TODO: Implementa usando .stream() y .anyMatch()
    	
        return palabras.stream()
        		.anyMatch(e-> e!= null && e.toLowerCase().startsWith("á"));
    }
}
