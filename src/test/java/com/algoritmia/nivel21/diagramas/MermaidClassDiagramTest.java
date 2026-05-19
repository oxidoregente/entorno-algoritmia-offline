package com.algoritmia.nivel21.diagramas;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

/**
 * Test para ejercicio de Mermaid Class Diagram.
 * Valida generación de diagramas de clases.
 */
class MermaidClassDiagramTest {

    @Test
    void testGenerarClassDiagram() {
        MermaidClassDiagramEnunciado enunciado = new MermaidClassDiagramEnunciado();
        List<Map<String, Object>> entidades = List.of(
            Map.of(
                "nombre", "Usuario",
                "atributos", List.of("+Long id", "+String nombre"),
                "metodos", List.of("+getNombre()")
            ),
            Map.of(
                "nombre", "Pedido",
                "atributos", List.of("+Long id", "+Double total"),
                "metodos", List.of("+calcularTotal()")
            )
        );
        String resultado = enunciado.generarClassDiagram(entidades);

        assertTrue(resultado.startsWith("classDiagram"),
            "Debe comenzar con 'classDiagram'");
        assertTrue(resultado.contains("class Usuario"),
            "Debe contener la clase Usuario");
        assertTrue(resultado.contains("class Pedido"),
            "Debe contener la clase Pedido");
        assertTrue(resultado.contains("+String nombre"),
            "Debe contener los atributos de Usuario");
        assertTrue(resultado.contains("+calcularTotal()"),
            "Debe contener los métodos de Pedido");
    }

    @Test
    void testClassDiagramSinMetodos() {
        MermaidClassDiagramEnunciado enunciado = new MermaidClassDiagramEnunciado();
        List<Map<String, Object>> entidades = List.of(
            Map.of(
                "nombre", "Vacio",
                "atributos", List.of(),
                "metodos", List.of()
            )
        );
        String resultado = enunciado.generarClassDiagram(entidades);

        assertTrue(resultado.contains("class Vacio"),
            "Debe generar la clase aunque no tenga atributos ni métodos");
    }
}
