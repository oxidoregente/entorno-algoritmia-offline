package com.algoritmia.nivel02.logica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Validador de Email.
 * Valida formato de emails con regex.
 */
class ValidadorEmailTest {

    @Test
    void testEmailsValidos() {
        ValidadorEmailEnunciado validador = new ValidadorEmailEnunciado();
        assertTrue(validador.esEmailValido("brandon@ingenieria.com"));
        assertTrue(validador.esEmailValido("dev@opensource.org"));
    }

    @Test
    void testEmailsInvalidos() {
        ValidadorEmailEnunciado validador = new ValidadorEmailEnunciado();
        assertFalse(validador.esEmailValido("brandoningenieria.com"), "Falta arroba");
        assertFalse(validador.esEmailValido("user@host.net"), "Extensión no permitida");
        assertFalse(validador.esEmailValido("user @host.com"), "Contiene espacios");
        assertFalse(validador.esEmailValido("user@@host.com"), "Doble arroba");
    }
}
