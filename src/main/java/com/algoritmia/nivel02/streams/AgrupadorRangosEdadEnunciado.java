package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Agrupador por Rangos de Edad. <b>Dificultad: Media</b>
 *
 * <p>
 * En una app de salud, marketing segmentado o seguros, suele ser necesario
 * clasificar usuarios por rangos etarios para aplicarles 优惠政策 o recomendaciones
 * distintas. Aquí aprenderás a hacer esa clasificación con un solo pipeline de
 * Streams.
 * </p>
 *
 * <p>
 * <b>Reglas / Estructura:</b>
 * </p>
 * <ul>
 * <li>"JOVEN" → personas con edad estrictamente menor a 18.</li>
 * <li>"ADULTO" → personas con edad entre 18 y 60 años, inclusive.</li>
 * <li>"SENIOR" → personas con edad estrictamente mayor a 60.</li>
 * <li>El valor del mapa es la lista de NOMBRES (no objetos Persona) que
 * pertenecen a cada rango.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * Entrada:
 *   personas = [
 *     Persona("Ana", 15),
 *     Persona("Luis", 30),
 *     Persona("Marta", 65),
 *     Persona("Pedro", 60),
 *     Persona("Sofia", 12)
 *   ]
 * Salida:
 *   {
 *     "JOVEN"  = ["Ana", "Sofia"],
 *     "ADULTO" = ["Luis", "Pedro"],
 *     "SENIOR" = ["Marta"]
 *   }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 * <li>Usa {@code Collectors.groupingBy(...)} con una función que devuelva el
 * rango según la edad (puede ser un {@code switch} expression).</li>
 * <li>Combina con
 * {@code Collectors.mapping(Persona::nombre, Collectors.toList())} para
 * quedarte solo con el nombre en el valor del mapa.</li>
 * </ul>
 */
public class AgrupadorRangosEdadEnunciado {

    public record Persona(String nombre, int edad) {
    }

    /**
     * Agrupa los nombres de las personas en tres rangos etarios: JOVEN, ADULTO y
     * SENIOR.
     *
     * @param personas lista de personas a clasificar; puede estar vacía.
     * @return mapa con clave el rango ("JOVEN", "ADULTO", "SENIOR") y valor la
     *         lista de nombres que pertenecen a ese rango.
     */
    public Map<String, List<String>> agruparPorRangos(List<Persona> personas) {
        // TODO: Implementa usando groupingBy y mapping

        return personas.stream().collect(Collectors.groupingBy(p -> {
            if (p.edad() < 18)
                return "JOVEN";
            if (p.edad() <= 65)
                return "ADULTO";
            return "SENIOR";
        }, Collectors.mapping(Persona::nombre, Collectors.toList())));
    }
}
