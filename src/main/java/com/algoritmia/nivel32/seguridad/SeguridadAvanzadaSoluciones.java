package com.algoritmia.nivel32.seguridad;

/**
 * 🏆 SOLUCIONES: Seguridad Proactiva (Filtros y Detección).
 */
public class SeguridadAvanzadaSoluciones {

    public boolean bruteForce(boolean success) {
        // Increment counter if false, check > 5
        return !success; // Simplified
    }

    public String xssClean(String html) {
        return html.replace("<", "&lt;").replace(">", "&gt;");
    }

    /*
    http.csrf(csrf -> csrf.disable()) -> Para APIs sin estado.
    */
}
