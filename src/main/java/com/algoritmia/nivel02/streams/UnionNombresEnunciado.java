package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Unión de Nombres.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Dada una lista de nombres en minúsculas, conviértelos todos a mayúsculas
 * y únelos en un solo String separado por comas y un espacio.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: ["brandon", "ana", "carlos"]
 * Salida:  "BRANDON, ANA, CARLOS"
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `stream()`, `map()` con `String::toUpperCase` y `collect(Collectors.joining(", "))`.</li>
 *   <li>Maneja el caso de que la lista sea nula devolviendo un string vacío.</li>
 * </ul>
 */
public class UnionNombresEnunciado {

    /**
     * Convierte una lista de nombres a mayúsculas y los une en un string separado por comas.
     *
     * @param nombres Lista de nombres de entrada.
     * @return String con los nombres en mayúsculas unidos por ", ".
     */
    public String unir(List<String> nombres) {
        // TODO: Implementa usando stream, map y Collectors.joining
        return null;
    }
}
