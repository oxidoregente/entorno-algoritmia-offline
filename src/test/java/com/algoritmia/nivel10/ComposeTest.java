package com.algoritmia.nivel10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
