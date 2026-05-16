package com.algoritmia.nivel17.migraciones;

/**
 * 🏆 SOLUCIONES: Naming, Repeatable y Baseline.
 */
public class FlywayExtraSoluciones {

    // Naming: V3__Añadir_tabla_auditoria.sql
    public String obtenerNombreCorrecto() {
        return "V3__Anadir_tabla_auditoria.sql";
    }

    // Repeatable: R__
    public String obtenerPrefijo() {
        return "R__";
    }

    // Baseline: spring.flyway.baseline-on-migrate=true
    public String getComandoProperties() {
        return "spring.flyway.baseline-on-migrate=true";
    }
}
