package com.algoritmia.nivel21.diagramas;

import java.util.List;

/**
 * 🎓 RETO: Diagrama Gantt con Mermaid.
 * <b>Dificultad: Media</b>
 * 
 * <p>Genera un diagrama Gantt en sintaxis Mermaid a partir de una lista
 * de tareas con fechas y duraciones. Simula la planificación de un
 * sprint o proyecto de desarrollo.</p>
 * 
 * <p><b>Conceptos clave:</b>
 * <ul>
 *   <li><code>gantt</code> define el tipo de diagrama.</li>
 *   <li><code>dateFormat YYYY-MM-DD</code> establece el formato de fecha.</li>
 *   <li><code>title</code> asigna un nombre al diagrama.</li>
 *   <li>Cada tarea tiene: nombre, identificador, fecha inicio y duración.</li>
 *   <li>Formato: <code>nombre :id, inicio, duracion</code> (ej: <code>5d</code>).</li>
 * </ul></p>
 */
public class MermaidGanttEnunciado {

    public String generarGantt(String titulo, String fechaInicio, List<String> tareas) {
        // TODO: Genera un diagrama Gantt Mermaid.
        // Entrada: titulo="Sprint 1", fechaInicio="2025-01-01"
        //          tareas=["Analisis, 2025-01-01, 5d", "Desarrollo, 2025-01-06, 10d"]
        // Salida esperada:
        //   gantt
        //       title Sprint 1
        //       dateFormat YYYY-MM-DD
        //       section Tareas
        //       Analisis           :a1, 2025-01-01, 5d
        //       Desarrollo         :a2, 2025-01-06, 10d
        //
        // Pista: Divide cada tarea por comas para extraer nombre, inicio y duración.
        // Asigna identificadores secuenciales (a1, a2, ...) a cada tarea.
        return "";
    }
}
