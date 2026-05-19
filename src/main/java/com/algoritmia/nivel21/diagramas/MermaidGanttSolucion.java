package com.algoritmia.nivel21.diagramas;

import java.util.List;

/**
 * SOLUCIÓN: Diagrama Gantt con Mermaid.
 *
 * <p>Construye un diagrama Gantt dividiendo cada tarea por comas para
 * extraer nombre, fecha de inicio y duración. Asigna identificadores
 * secuenciales (a1, a2, ...) a cada tarea.</p>
 */
public class MermaidGanttSolucion {

    public String generarGantt(String titulo, String fechaInicio, List<String> tareas) {
        StringBuilder sb = new StringBuilder();
        sb.append("gantt").append(System.lineSeparator());
        sb.append("    title ").append(titulo).append(System.lineSeparator());
        sb.append("    dateFormat YYYY-MM-DD").append(System.lineSeparator());
        sb.append("    section Tareas").append(System.lineSeparator());

        for (int i = 0; i < tareas.size(); i++) {
            String[] partes = tareas.get(i).split(",");
            String nombre = partes[0].trim();
            String inicio = partes[1].trim();
            String duracion = partes[2].trim();
            String id = "a" + (i + 1);

            sb.append("    ").append(nombre).append("           :").append(id)
                    .append(", ").append(inicio).append(", ").append(duracion)
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
