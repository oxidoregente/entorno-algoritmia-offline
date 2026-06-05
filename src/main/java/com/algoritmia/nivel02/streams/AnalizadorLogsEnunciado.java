package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Analizador de Logs con Regex.
 * <b>Dificultad: Media</b>
 *
 * <p>En cualquier sistema en producción (servidores, microservicios, batch
 * jobs), los logs se acumulan como texto plano. Para disparar alertas o
 * armar dashboards, es habitual contar cuántas líneas pertenecen a un
 * nivel concreto (ERROR, WARN, INFO). Aquí practicarás un filtro por
 * patrón de texto sobre un stream de Strings.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Cada línea sigue el formato
 *       {@code "FECHA HORA [NIVEL] MENSAJE"} (p. ej.
 *       {@code "2024-05-12 10:00:00 [ERROR] Data failure"}).</li>
 *   <li>Se debe contar cuántas líneas contienen el {@code nivelBuscado}
 *       entre corchetes, sin distinguir mayúsculas/minúsculas.</li>
 *   <li>Si la lista es {@code null} o vacía, devolver {@code 0}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   logs = [
 *     "2024-05-12 10:00:00 [INFO]  Startup OK",
 *     "2024-05-12 10:01:11 [ERROR] DB timeout",
 *     "2024-05-12 10:02:00 [WARN]  Retrying...",
 *     "2024-05-12 10:02:30 [error] null pointer",
 *     "2024-05-12 10:03:00 [INFO]  Heartbeat"
 *   ]
 *   nivelBuscado = "ERROR"
 * Salida:
 *   2
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code .stream()}, {@code .filter(...)} y {@code .count()}.</li>
 *   <li>Para validar el nivel puedes usar {@code String.contains(...)}
 *       sobre la versión en mayúsculas de la línea, o una expresión
 *       regular con {@code Pattern.compile("\\[NIVEL\\]")}.</li>
 *   <li>Compara en mayúsculas para que la búsqueda sea
 *       case-insensitive.</li>
 * </ul>
 */
public class AnalizadorLogsEnunciado {

    /**
     * Cuenta las líneas de log que corresponden al nivel indicado.
     *
     * @param logs         lista de líneas de log con formato
     *                     {@code "FECHA HORA [NIVEL] MENSAJE"}.
     * @param nivelBuscado nivel a buscar, por ejemplo {@code "ERROR"}.
     *                     La búsqueda es insensible a mayúsculas.
     * @return cantidad de líneas que contienen el nivel buscado.
     *         Devuelve {@code 0} si la lista es {@code null} o vacía.
     */
    public long contarLogsPorNivel(List<String> logs, String nivelBuscado) {
        // TODO: Usa .stream(), .filter() y una validación de texto para contar.
        return 0;
    }
}
