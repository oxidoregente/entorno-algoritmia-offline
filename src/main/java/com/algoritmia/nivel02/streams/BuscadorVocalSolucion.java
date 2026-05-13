package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🏆 SOLUCIÓN: Buscador de Iniciales.
 */
public class BuscadorVocalSolucion {

    public boolean existePalabraConA(List<String> palabras) {
        if (palabras == null) return false;
        return palabras.stream()
                .anyMatch(s -> s != null && s.toLowerCase().startsWith("a"));
    }
}
