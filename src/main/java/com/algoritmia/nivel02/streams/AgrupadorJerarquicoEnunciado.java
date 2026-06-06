package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Agrupamiento Jerárquico. <b>Dificultad: Media</b>
 *
 * <p>
 * Dada una lista de {@code Transaccion}, agrúpalas primero por año y luego por
 * mes dentro de cada año. El resultado es un mapa anidado con la estructura:
 * {@code Map<Año, Map<Mes, List<Transaccion>>>}.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * datos = [
 *   { año: 2024, mes: "Enero",    monto: 100 },
 *   { año: 2024, mes: "Enero",    monto: 200 },
 *   { año: 2024, mes: "Febrero",  monto: 150 },
 *   { año: 2023, mes: "Enero",    monto:  50 }
 * ]
 *
 * Resultado:
 * {
 *   2024: {
 *     "Enero":   [ { 2024, "Enero", 100 }, { 2024, "Enero", 200 } ],
 *     "Febrero": [ { 2024, "Febrero", 150 } ]
 *   },
 *   2023: {
 *     "Enero":   [ { 2023, "Enero", 50 } ]
 *   }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 * <li>Usa {@code Collectors.groupingBy(Transaccion::año, ...)} como agrupación
 * externa.</li>
 * <li>El segundo argumento de {@code groupingBy} es otro {@code Collector}:
 * anida {@code Collectors.groupingBy(Transaccion::mes)}.</li>
 * <li>El tipo de retorno del segundo {@code groupingBy} ya es una lista, no
 * necesitas añadir un {@code Collectors.toList()} extra.</li>
 * </ul>
 */
public class AgrupadorJerarquicoEnunciado {

    public record Transaccion(int año, String mes, double monto) {
    }

    /**
     * Agrupa las transacciones por año y, dentro de cada año, por mes.
     *
     * @param datos Lista de transacciones a agrupar.
     * @return Mapa anidado con la estructura
     *         {@code Map<Año, Map<Mes, List<Transaccion>>>}.
     */
    public Map<Integer, Map<String, List<Transaccion>>> agrupar(List<Transaccion> datos) {
        // TODO: Usa Collectors.groupingBy anidado

        return datos.stream()
                .collect(Collectors.groupingBy(e -> e.año, 
                        Collectors.groupingBy(e -> e.mes, 
                                Collectors.toList())));
    }
}
