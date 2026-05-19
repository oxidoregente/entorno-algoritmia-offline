package com.algoritmia.nivel21.diagramas;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Diagrama de Clases con Mermaid.
 * <b>Dificultad: Media</b>
 * 
 * <p>Genera un diagrama de clases UML en sintaxis Mermaid a partir de
 * una lista de entidades con sus atributos y métodos. Simula cómo
 * herramientas de documentación automática generan diagramas desde
 * el modelo de dominio.</p>
 * 
 * <p><b>Conceptos clave:</b>
 * <ul>
 *   <li><code>classDiagram</code> define el tipo de diagrama.</li>
 *   <li>Cada clase se define con <code>class Nombre { ... }</code>.</li>
 *   <li>Los prefijos <code>+</code> (público) y <code>-</code> (privado)
 *       indican visibilidad.</li>
 *   <li>Atributos y métodos se listan dentro del bloque de la clase.</li>
 * </ul></p>
 */
public class MermaidClassDiagramEnunciado {

    public String generarClassDiagram(List<Map<String, Object>> entidades) {
        // TODO: Genera un diagrama de clases Mermaid a partir de una lista de entidades.
        // Cada entidad tiene: "nombre", "atributos" (List<String>), "metodos" (List<String>)
        // Ejemplo de entrada:
        //   [{"nombre": "Usuario", "atributos": ["+id: Long", "+nombre: String"], "metodos": ["+getNombre()"]},
        //    {"nombre": "Pedido", "atributos": ["+id: Long", "+total: Double"], "metodos": ["+calcularTotal()"]}]
        //
        // Salida esperada:
        //   classDiagram
        //       class Usuario {
        //           +Long id
        //           +String nombre
        //           +getNombre()
        //       }
        //       class Pedido {
        //           +Long id
        //           +Double total
        //           +calcularTotal()
        //       }
        //
        // Pista: Itera sobre las entidades, para cada una genera:
        //   "    class " + nombre + " {\n"
        //   para cada atributo: "        " + attr + "\n"
        //   para cada metodo: "        " + method + "\n"
        //   "    }\n"
        return "";
    }
}
