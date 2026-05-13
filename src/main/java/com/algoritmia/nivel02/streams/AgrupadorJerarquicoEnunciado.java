package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * RETO: Agrupamiento Jerárquico.
 * 
 * Dada una lista de 'Transaccion', agrúpalas por año y luego por mes.
 * Devuelve un Mapa de Mapas: Map<Año, Map<Mes, List<Transaccion>>>.
 */
public class AgrupadorJerarquicoEnunciado {

    public record Transaccion(int año, String mes, double monto) {}

    public Map<Integer, Map<String, List<Transaccion>>> agrupar(List<Transaccion> datos) {
        // TODO: Usa Collectors.groupingBy anidado
        return null;
    }
}
