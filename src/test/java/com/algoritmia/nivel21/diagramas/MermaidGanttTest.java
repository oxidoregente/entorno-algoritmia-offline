package com.algoritmia.nivel21.diagramas;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;

class MermaidGanttTest {

    @Test
    void testGenerarGantt() {
        MermaidGanttEnunciado enunciado = new MermaidGanttEnunciado();
        List<String> tareas = List.of(
            "Analisis, 2025-01-01, 5d",
            "Desarrollo, 2025-01-06, 10d"
        );
        String resultado = enunciado.generarGantt("Sprint 1", "2025-01-01", tareas);

        assertTrue(resultado.startsWith("gantt"),
            "Debe comenzar con 'gantt'");
        assertTrue(resultado.contains("title Sprint 1"),
            "Debe contener el título del diagrama");
        assertTrue(resultado.contains("dateFormat YYYY-MM-DD"),
            "Debe incluir el formato de fecha");
        assertTrue(resultado.contains("Analisis"),
            "Debe contener la primera tarea");
        assertTrue(resultado.contains("Desarrollo"),
            "Debe contener la segunda tarea");
    }

    @Test
    void testGanttConTareaUnica() {
        MermaidGanttEnunciado enunciado = new MermaidGanttEnunciado();
        List<String> tareas = List.of("Solo, 2025-06-01, 1d");
        String resultado = enunciado.generarGantt("Mini", "2025-06-01", tareas);

        assertTrue(resultado.contains(":a1,"),
            "Debe asignar el identificador a1 a la primera tarea");
    }
}
