package com.algoritmia.nivel28.migraciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MigracionRepeatableTest {

    @Test
    void testObtenerPrefijo() {
        MigracionRepeatableEnunciado enunciado = new MigracionRepeatableEnunciado();
        String resultado = enunciado.obtenerPrefijo();

        assertEquals("R__", resultado,
            "El prefijo para migraciones repetibles debe ser 'R__'");
    }
}