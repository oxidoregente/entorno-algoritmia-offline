package com.algoritmia.nivel08.documentacion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * Test para ejercicio de Mermaid Flowchart.
 * Valida generación de diagramas de flujo.
 */
class MermaidFlowchartTest {

    @Test
    void testGenerarFlowchart() {
        MermaidFlowchartEnunciado enunciado = new MermaidFlowchartEnunciado();
        List<String> pasos = List.of("Inicio", "Login", "Validar", "Dashboard");
        String resultado = enunciado.generarFlowchart("Autenticación", pasos);

        assertTrue(resultado.startsWith("flowchart TD"),
            "Debe comenzar con 'flowchart TD'");
        assertTrue(resultado.contains("Autenticación"),
            "Debe contener el título");
        assertTrue(resultado.contains("A[Inicio]"),
            "Debe contener el nodo A con la etiqueta 'Inicio'");
        assertTrue(resultado.contains("-->"),
            "Debe contener conexiones entre nodos");
    }

    @Test
    void testFlowchartConUnPaso() {
        MermaidFlowchartEnunciado enunciado = new MermaidFlowchartEnunciado();
        List<String> pasos = List.of("Único");
        String resultado = enunciado.generarFlowchart("Simple", pasos);

        assertTrue(resultado.contains("A[Único]"),
            "Con un solo paso debe generar un único nodo terminal");
    }
}
