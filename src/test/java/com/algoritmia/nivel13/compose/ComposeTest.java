package com.algoritmia.nivel13.compose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Docker Compose Básico.
 * Valida generación de docker-compose.yml.
 */
class ComposeTest {

    @Test
    void testComposeBasico() {
        ComposeBasicoEnunciado enunciado = new ComposeBasicoEnunciado();
        String yaml = enunciado.generarCompose();
        
        assertNotNull(yaml);
        assertTrue(yaml.contains("services:"), "Falta sección services");
        assertTrue(yaml.contains("db:"), "Falta servicio db");
        assertTrue(yaml.contains("app:"), "Falta servicio app");
        assertTrue(yaml.contains("postgres"), "Falta imagen de postgres");
        assertTrue(yaml.contains("8080:8080"), "Falta mapeo de puertos");
    }
}
