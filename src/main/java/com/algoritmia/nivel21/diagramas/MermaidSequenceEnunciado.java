package com.algoritmia.nivel21.diagramas;

import java.util.List;

/**
 * 🎓 RETO: Diagrama de Secuencia con Mermaid.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Genera un diagrama de secuencia en sintaxis Mermaid a partir de
 * una lista de participantes e interacciones. Ideal para modelar
 * flujos de comunicación entre componentes de una arquitectura.</p>
 * 
 * <p><b>Conceptos clave:</b>
 * <ul>
 *   <li><code>sequenceDiagram</code> define el tipo de diagrama.</li>
 *   <li><code>participant</code> declara cada actor del flujo.</li>
 *   <li>Las flechas <code>->></code> indican mensajes entre participantes.</li>
 *   <li>El formato es: <code>Origen->>Destino: mensaje</code>.</li>
 * </ul></p>
 */
public class MermaidSequenceEnunciado {

    public String generarSequenceDiagram(String titulo, List<String> participantes, List<String> interacciones) {
        // TODO: Genera un diagrama de secuencia Mermaid.
        // Entrada: participantes=["Cliente", "Servicio", "DB"]
        //          interacciones=["Cliente->>Servicio: GET /api/datos", "Servicio->>DB: SELECT * FROM datos"]
        // Salida esperada:
        //   sequenceDiagram
        //       participant Cliente
        //       participant Servicio
        //       participant DB
        //       Cliente->>Servicio: GET /api/datos
        //       Servicio->>DB: SELECT * FROM datos
        //
        // Pista: Define los participantes primero, luego agrega cada interacción.
        // Usa System.lineSeparator() para saltos de línea multiplataforma.
        return "";
    }
}
