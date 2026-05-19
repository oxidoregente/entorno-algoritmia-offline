package com.algoritmia.nivel21.diagramas;

import java.util.List;

/**
 * 🎓 RETO: Grafo de Arquitectura con Mermaid.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Genera un grafo dirigido (<i>graph LR</i>) en sintaxis Mermaid para
 * representar la arquitectura de microservicios. Agrupa los nodos en
 * un bloque <code>subgraph</code> y conecta servicios según las aristas.</p>
 * 
 * <p><b>Conceptos clave:</b>
 * <ul>
 *   <li><code>graph LR</code> define un grafo de izquierda a derecha.</li>
 *   <li><code>subgraph ... end</code> agrupa nodos visualmente.</li>
 *   <li>Cada nodo se mapea a una letra secuencial (A, B, C...).</li>
 *   <li>Las aristas <code>--></code> conectan los nodos según las relaciones.</li>
 *   <li>Formato de nodo: <code>Letra[Etiqueta]</code>.</li>
 * </ul></p>
 */
public class MermaidGraphEnunciado {

    public String generarGraph(String titulo, List<String> nodos, List<String> aristas) {
        // TODO: Genera un grafo dirigido Mermaid (graph LR) para representar arquitecturas.
        // Entrada: nodos=["API Gateway", "Servicio A", "Servicio B", "Base de Datos"]
        //          aristas=["API Gateway-->Servicio A", "Servicio A-->Base de Datos", "API Gateway-->Servicio B"]
        // Salida esperada:
        //   graph LR
        //       subgraph Arquitectura
        //           A[API Gateway]
        //           B[Servicio A]
        //           C[Servicio B]
        //           D[Base de Datos]
        //       end
        //       A-->B
        //       B-->D
        //       A-->C
        //
        // Pista: Asigna letras secuenciales (A, B, C, ...) a cada nodo.
        // Envuelve los nodos en un bloque "subgraph <titulo>".
        // Las aristas se agregan tal cual, pero reemplazando nombres por letras.
        return "";
    }
}
