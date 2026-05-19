package com.algoritmia.nivel17.migraciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FlywayBaselineTest {

    @Test
    void testGetComandoProperties() {
        FlywayBaselineEnunciado enunciado = new FlywayBaselineEnunciado();
        String resultado = enunciado.getComandoProperties();

        assertTrue(resultado.contains("spring.flyway.baseline-on-migrate"),
            "Debe contener la propiedad para habilitar baseline");
        assertTrue(resultado.toLowerCase().contains("true"),
            "El valor debe ser true");
    }
}