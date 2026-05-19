package com.algoritmia.nivel21.diagramas;

import java.util.List;
import java.util.Map;

/**
 * SOLUCIÓN: Diagrama de Clases con Mermaid.
 *
 * <p>Itera sobre las entidades y genera la sintaxis classDiagram con
 * atributos y métodos dentro de cada bloque de clase.</p>
 */
public class MermaidClassDiagramSolucion {

    @SuppressWarnings("unchecked")
    public String generarClassDiagram(List<Map<String, Object>> entidades) {
        StringBuilder sb = new StringBuilder();
        sb.append("classDiagram").append(System.lineSeparator());

        for (Map<String, Object> entidad : entidades) {
            String nombre = (String) entidad.get("nombre");
            List<String> atributos = (List<String>) entidad.get("atributos");
            List<String> metodos = (List<String>) entidad.get("metodos");

            sb.append("    class ").append(nombre).append(" {").append(System.lineSeparator());

            if (atributos != null) {
                for (String attr : atributos) {
                    sb.append("        ").append(attr).append(System.lineSeparator());
                }
            }

            if (metodos != null) {
                for (String method : metodos) {
                    sb.append("        ").append(method).append(System.lineSeparator());
                }
            }

            sb.append("    }").append(System.lineSeparator());
        }

        return sb.toString();
    }
}
