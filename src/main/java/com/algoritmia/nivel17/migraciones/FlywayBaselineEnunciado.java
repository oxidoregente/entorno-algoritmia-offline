package com.algoritmia.nivel17.migraciones;

/**
 * 🎓 RETO: Baseline en Flyway.
 * <b>Dificultad: Media</b>
 * 
 * <p>Si introduces Flyway en un proyecto que ya tiene una base de datos 
 * con datos y tablas, necesitas un 'baseline' para indicarle que ignore 
 * el estado actual y empiece a trackear desde una versión específica.</p>
 */
public class FlywayBaselineEnunciado {
    
    public String getComandoProperties() {
        // TODO: ¿Qué propiedad de Spring Boot habilita el baseline automático?
        // spring.flyway.baseline-on-migrate=...
        return "";
    }
}
