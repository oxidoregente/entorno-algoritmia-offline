package com.algoritmia.nivel08.documentacion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.List;

class MermaidSequenceTest {

    @Test
    void testGenerarSequenceDiagram() {
        MermaidSequenceEnunciado enunciado = new MermaidSequenceEnunciado();
        List<String> participantes = List.of("Cliente", "Servicio", "DB");
        List<String> interacciones = List.of(
            "Cliente->>Servicio: GET /api/datos",
            "Servicio->>DB: SELECT *"
        );
        String resultado = enunciado.generarSequenceDiagram("Flujo API", participantes, interacciones);

        assertTrue(resultado.startsWith("sequenceDiagram"),
            "Debe comenzar con 'sequenceDiagram'");
        assertTrue(resultado.contains("participant Cliente"),
            "Debe declarar al participante Cliente");
        assertTrue(resultado.contains("participant Servicio"),
            "Debe declarar al participante Servicio");
        assertTrue(resultado.contains("Cliente->>Servicio: GET /api/datos"),
            "Debe contener la interacción entre Cliente y Servicio");
    }

    @Test
    void testSequenceSinParticipantes() {
        MermaidSequenceEnunciado enunciado = new MermaidSequenceEnunciado();
        String resultado = enunciado.generarSequenceDiagram("Vacío", List.of(), List.of());

        assertTrue(resultado.startsWith("sequenceDiagram"),
            "Debe comenzar con 'sequenceDiagram' incluso sin participantes");
    }
}
