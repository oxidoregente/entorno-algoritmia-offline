package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Agrupamiento Jerárquico.
 * <b>Dificultad: Media</b>
 * 
 * <p>Dada una lista de 'Transaccion', agrúpalas por año y luego por mes.
 * Devuelve un Mapa de Mapas: Map&lt;Año, Map&lt;Mes, List&lt;Transaccion&gt;&gt;&gt;.</p>
 * 
 * <p><b>Pista:</b> Usa Collectors.groupingBy anidado.</p>
 */
public class AgrupadorJerarquicoEnunciado {

    public record Transaccion(int año, String mes, double monto) {}

    public Map<Integer, Map<String, List<Transaccion>>> agrupar(List<Transaccion> datos) {
        // TODO: Usa Collectors.groupingBy anidado
        return null;
    }
}
