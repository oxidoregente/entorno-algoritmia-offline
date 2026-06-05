package com.algoritmia.nivel08.documentacion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * Test para ejercicio de Mermaid Graph.
 * Valida generación de grafos directed/undirected.
 */
class MermaidGraphTest {

    @Test
    void testGenerarGraph() {
        MermaidGraphEnunciado enunciado = new MermaidGraphEnunciado();
        List<String> nodos = List.of("API Gateway", "Servicio A", "Base de Datos");
        List<String> aristas = List.of(
            "API Gateway-->Servicio A",
            "Servicio A-->Base de Datos"
        );
        String resultado = enunciado.generarGraph("Arquitectura", nodos, aristas);

        assertTrue(resultado.startsWith("graph LR"),
            "Debe comenzar con 'graph LR'");
        assertTrue(resultado.contains("subgraph Arquitectura"),
            "Debe contener el subgraph con el título");
        assertTrue(resultado.contains("A[API Gateway]"),
            "Debe contener el nodo A con la etiqueta API Gateway");
        assertTrue(resultado.contains("B[Servicio A]"),
            "Debe contener el nodo B con la etiqueta Servicio A");
        assertTrue(resultado.contains("end"),
            "Debe cerrar el subgraph con 'end'");
    }

    @Test
    void testGraphSinAristas() {
        MermaidGraphEnunciado enunciado = new MermaidGraphEnunciado();
        String resultado = enunciado.generarGraph("SoloNodos", List.of("X", "Y"), List.of());

        assertTrue(resultado.contains("A[X]"),
            "Debe contener el nodo X aunque no haya aristas");
        assertTrue(resultado.contains("B[Y]"),
            "Debe contener el nodo Y aunque no haya aristas");
    }
}
