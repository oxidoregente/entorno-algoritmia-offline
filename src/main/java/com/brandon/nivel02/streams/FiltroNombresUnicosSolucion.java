package com.brandon.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 🏆 SOLUCIÓN: Filtro de Nombres Únicos.
 */
public class FiltroNombresUnicosSolucion {

    public List<String> formatearNombres(List<String> nombres) {
        if (nombres == null) return List.of();
        return nombres.stream()
                .filter(n -> n != null && !n.isBlank())
                .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
