package com.algoritmia.nivel08.documentacion;

import java.util.List;

/**
 * SOLUCIÓN: Diagrama de Flujo con Mermaid.
 *
 * <p>Genera un flowchart Mermaid asignando letras secuenciales (A, B, C...)
 * a cada paso. El paso central se convierte en un nodo de decisión con {}.</p>
 */
public class MermaidFlowchartSolucion {

    public String generarFlowchart(String titulo, List<String> pasos) {
        StringBuilder sb = new StringBuilder();
        sb.append("flowchart TD").append(System.lineSeparator());
        sb.append("    ").append(titulo).append(System.lineSeparator());

        for (int i = 0; i < pasos.size(); i++) {
            String letra = String.valueOf((char) ('A' + i));
            String siguiente = String.valueOf((char) ('A' + i + 1));
            String paso = pasos.get(i);

            if (i == pasos.size() - 1) {
                sb.append("    ").append(letra).append("[").append(paso).append("]").append(System.lineSeparator());
            } else if (i == pasos.size() / 2) {
                sb.append("    ").append(letra).append("{").append(paso).append("}").append(System.lineSeparator());
                sb.append("    ").append(letra).append("-->|OK| ").append(siguiente).append(System.lineSeparator());
            } else {
                sb.append("    ").append(letra).append("[").append(paso).append("]").append(System.lineSeparator());
                sb.append("    ").append(letra).append("--> ").append(siguiente).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }
}
