package com.algoritmia.nivel21.diagramas;

import java.util.List;

/**
 * SOLUCIÓN: Diagrama de Secuencia con Mermaid.
 *
 * <p>Declara los participantes y agrega cada interacción como una
 * línea de mensaje entre ellos.</p>
 */
public class MermaidSequenceSolucion {

    public String generarSequenceDiagram(String titulo, List<String> participantes, List<String> interacciones) {
        StringBuilder sb = new StringBuilder();
        sb.append("sequenceDiagram").append(System.lineSeparator());

        for (String p : participantes) {
            sb.append("    participant ").append(p).append(System.lineSeparator());
        }

        for (String i : interacciones) {
            sb.append("    ").append(i).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
