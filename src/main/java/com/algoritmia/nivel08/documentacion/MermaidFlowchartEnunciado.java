package com.algoritmia.nivel08.documentacion;

import java.util.List;

/**
 * 🎓 RETO: Diagrama de Flujo con Mermaid.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Genera un diagrama de flujo (<i>flowchart</i>) en sintaxis Mermaid
 * a partir de una lista de pasos. Útil para visualizar procesos de
 * negocio o flujos de autenticación.</p>
 * 
 * <p><b>Conceptos clave:</b>
 * <ul>
 *   <li>Mermaid usa <code>flowchart TD</code> para diagramas de arriba a abajo.</li>
 *   <li>Cada nodo tiene un identificador único (A, B, C...) y una etiqueta.</li>
 *   <li>Las conexiones se definen con <code>--></code> entre nodos.</li>
 *   <li>Los nodos de decisión usan llaves <code>{}</code> en la etiqueta.</li>
 * </ul></p>
 */
public class MermaidFlowchartEnunciado {

    public String generarFlowchart(String titulo, List<String> pasos) {
        // TODO: Genera un diagrama de flujo Mermaid a partir de una lista de pasos.
        // Ejemplo de entrada: titulo="Autenticación", pasos=["Inicio", "Login", "Validar", "Dashboard"]
        // Ejemplo de salida:
        //   flowchart TD
        //       A[Inicio] --> B[Login]
        //       B --> C{Validar}
        //       C -->|OK| D[Dashboard]
        //       C -->|Error| B
        //
        // Pista: Usa StringBuilder, itera sobre los pasos y genera las conexiones.
        // El último paso debe ser un nodo terminal.
        // Para bifurcaciones, el paso central puede representar una decisión con {}.
        return "";
    }
}
