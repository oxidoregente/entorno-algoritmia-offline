package com.algoritmia.nivel02.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Analizador de Palabras Más Frecuentes.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En procesamiento de lenguaje natural (NLP) y analítica de texto —por
 * ejemplo para hacer nubes de palabras, detectar tendencias en reseñas o
 * resumir feedback de usuarios— se necesita identificar los términos más
 * repetidos. Este ejercicio simula un mini-analizador: extrae el Top 3
 * de palabras de un texto, ignorando mayúsculas y palabras vacías.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Dividir el texto por espacios y/o signos de puntuación simples.</li>
 *   <li>Pasar todo a minúsculas para que la cuenta sea insensible a
 *       mayúsculas.</li>
 *   <li>Descartar las stop-words: {@code el, la, de, y, que}.</li>
 *   <li>Contar ocurrencias con {@code Collectors.groupingBy(...,
 *       Collectors.counting())} y devolver las 3 más frecuentes en orden
 *       descendente de frecuencia.</li>
 *   <li>Si el texto es {@code null} o quedan menos de 3 palabras válidas,
 *       devolver tantas como haya (o lista vacía).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   texto = "El gato y el perro juegan. El gato mira al perro y el perro corre."
 * Salida:
 *   ["el", "gato", "perro"]   (los tres con frecuencia 3, 2 y 2)
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code .stream()}, {@code .map(...)} y
 *       {@code Collectors.groupingBy(...)} para construir el mapa de
 *       frecuencias.</li>
 *   <li>Para ordenar por frecuencia descendente convierte el
 *       {@code Map<String, Long>} en un stream de {@code Map.Entry} y
 *       aplica {@code .sorted(Map.Entry.comparingByValue().reversed())}.</li>
 *   <li>Termina con {@code .limit(3).map(Map.Entry::getKey).toList()}.</li>
 *   <li>No olvides filtrar la lista de stop-words antes de contar.</li>
 * </ul>
 */
public class AnalizadorPalabrasFrecuentesEnunciado {

    /**
     * Obtiene las 3 palabras más frecuentes del texto, ignorando
     * mayúsculas y stop-words comunes en español.
     *
     * @param texto cadena de entrada; puede ser {@code null} o vacía.
     * @return lista con hasta 3 palabras ordenadas de mayor a menor
     *         frecuencia. Lista vacía si no hay palabras válidas.
     */
    public List<String> obtenerTop3Palabras(String texto) {
        // TODO: Implementa usando .stream(), .groupingBy(), Collectors.counting()
        // TODO: Ordena por frecuencia descendente y limita a 3.
        return null;
    }
}
