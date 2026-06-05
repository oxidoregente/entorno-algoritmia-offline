package com.algoritmia.nivel08.documentacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SOLUCIÓN: Grafo de Arquitectura con Mermaid.
 *
 * <p>Mapea cada nodo a una letra secuencial (A, B, C...), envuelve
 * los nodos en un subgraph y agrega las aristas de conexión.</p>
 */
public class MermaidGraphSolucion {

    public String generarGraph(String titulo, List<String> nodos, List<String> aristas) {
        StringBuilder sb = new StringBuilder();
        sb.append("graph LR").append(System.lineSeparator());
        sb.append("    subgraph ").append(titulo).append(System.lineSeparator());

        Map<String, String> mapaNodos = new HashMap<>();
        for (int i = 0; i < nodos.size(); i++) {
            String letra = String.valueOf((char) ('A' + i));
            mapaNodos.put(nodos.get(i), letra);
            sb.append("        ").append(letra).append("[").append(nodos.get(i)).append("]")
                    .append(System.lineSeparator());
        }

        sb.append("    end").append(System.lineSeparator());

        for (String arista : aristas) {
            sb.append("    ").append(arista).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
