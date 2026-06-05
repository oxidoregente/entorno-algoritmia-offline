package com.algoritmia.nivel28.migraciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MigracionNamingTest {

    @Test
    void testObtenerNombreCorrecto() {
        MigracionNamingEnunciado enunciado = new MigracionNamingEnunciado();
        String resultado = enunciado.obtenerNombreCorrecto();

        assertTrue(resultado.startsWith("V3"),
            "Debe comenzar con V3 para versión 3");
        assertTrue(resultado.contains("auditoria") || resultado.contains("auditoria"),
            "Debe contener el nombre de la tabla");
        assertTrue(resultado.endsWith(".sql"),
            "Debe terminar con extensión .sql");
    }
}