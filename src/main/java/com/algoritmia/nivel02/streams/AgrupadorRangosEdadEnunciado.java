package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Agrupador por Rangos de Edad.
 * <b>Dificultad: Media</b>
 * 
 * <p>Recibes una lista de 'Persona' (con nombre y edad). Debes agruparlas en un Mapa:</p>
 * <ul>
 *   <li>"JOVEN" (menor a 18)</li>
 *   <li>"ADULTO" (18 a 60)</li>
 *   <li>"SENIOR" (mayor a 60)</li>
 * </ul>
 * <p>El valor del mapa debe ser la lista de nombres de esas personas.</p>
 */
public class AgrupadorRangosEdadEnunciado {

    public record Persona(String nombre, int edad) {}

    public Map<String, List<String>> agruparPorRangos(List<Persona> personas) {
        // TODO: Implementa usando groupingBy y mapping
        return null;
    }
}
