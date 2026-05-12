package com.brandon.nivel2.streams;

import java.util.List;

/**
 * SOLUCIÓN: Analizador de Logs con Regex.
 */
public class AnalizadorLogsSolucion {

    public long contarLogsPorNivel(List<String> logs, String nivelBuscado) {
        String patron = "[" + nivelBuscado.toUpperCase() + "]";
        return logs.stream()
                .filter(linea -> linea.contains(patron))
                .count();
    }
}
