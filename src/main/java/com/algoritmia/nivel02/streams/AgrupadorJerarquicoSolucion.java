package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Agrupamiento Jerárquico.
 */
public class AgrupadorJerarquicoSolucion {

    public record Transaccion(int año, String mes, double monto) {}

    public Map<Integer, Map<String, List<Transaccion>>> agrupar(List<Transaccion> datos) {
        return datos.stream()
                .collect(Collectors.groupingBy(
                        Transaccion::año,
                        Collectors.groupingBy(Transaccion::mes)
                ));
    }
}
