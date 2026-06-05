package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Agrupamiento de Ciudades por País.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En apps de turismo, logística o clima se parte de un dataset global
 * de ciudades y se necesitan reportes del tipo "cuántas ciudades tengo
 * registradas por país". Este ejercicio enseña el patrón clásico
 * {@code groupingBy + counting} para obtener conteos por clave.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Recibe un {@code List<Ciudad>} con campos {@code nombre} y
 *       {@code pais}.</li>
 *   <li>Devuelve un {@code Map<String, Long>} donde la llave es el país
 *       y el valor es la CANTIDAD de ciudades de ese país.</li>
 *   <li>Si la lista es {@code null} o vacía, devolver mapa vacío.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   ciudades = [
 *     Ciudad("Madrid",   "España"),
 *     Ciudad("Sevilla",  "España"),
 *     Ciudad("Lisboa",   "Portugal"),
 *     Ciudad("Roma",     "Italia"),
 *     Ciudad("Milán",    "Italia"),
 *     Ciudad("Nápoles",  "Italia")
 *   ]
 * Salida:
 *   {
 *     "España"   = 2,
 *     "Portugal" = 1,
 *     "Italia"   = 3
 *   }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code Collectors.groupingBy(Ciudad::pais, Collectors.counting())}.</li>
 *   <li>El valor del mapa es de tipo {@code Long} (no {@code int}) porque
 *       {@code counting()} devuelve {@code Long}.</li>
 * </ul>
 */
public class FiltroCiudadesStreamEnunciado {

    public record Ciudad(String nombre, String pais) {}

    /**
     * Cuenta cuántas ciudades hay por cada país.
     *
     * @param ciudades lista de ciudades a procesar; puede estar vacía.
     * @return mapa con clave el país y valor la cantidad de ciudades de
     *         ese país. Mapa vacío si la lista es {@code null} o vacía.
     */
    public Map<String, Long> contarCiudadesPorPais(List<Ciudad> ciudades) {
        // TODO: Implementa usando .stream(), .collect() y Collectors.groupingBy()
        return null;
    }
}
