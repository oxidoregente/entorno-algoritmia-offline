package com.algoritmia.nivel28.migraciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.flywaydb.core.api.callback.Event;

class FlywayCallbackTest {

    @Test
    void testSupportsAfterMigrate() {
        FlywayCallbackEnunciado callback = new FlywayCallbackEnunciado();
        boolean resultado = callback.supports(Event.AFTER_MIGRATE, null);

        assertTrue(resultado, "Debe soportar el evento AFTER_MIGRATE");
    }

    @Test
    void testCanHandleInTransaction() {
        FlywayCallbackEnunciado callback = new FlywayCallbackEnunciado();
        boolean resultado = callback.canHandleInTransaction(Event.AFTER_MIGRATE, null);

        assertTrue(resultado, "Debe poder manejar el evento en transacción");
    }

    @Test
    void testGetCallbackName() {
        FlywayCallbackEnunciado callback = new FlywayCallbackEnunciado();
        String nombre = callback.getCallbackName();

        assertEquals("AuditorMigraciones", nombre,
            "El nombre del callback debe ser 'AuditorMigraciones'");
    }
}