package com.brandon.nivel1.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidarParentesisTest {

    @Test
    void testParentesisValidos() {
        ValidarParentesisEnunciado validador = new ValidarParentesisEnunciado();
        assertTrue(validador.esValido("()"));
        assertTrue(validador.esValido("()[]{}"));
        assertTrue(validador.esValido("{[]}"));
    }

    @Test
    void testParentesisInvalidos() {
        ValidarParentesisEnunciado validador = new ValidarParentesisEnunciado();
        assertFalse(validador.esValido("(]"));
        assertFalse(validador.esValido("([)]"));
        assertFalse(validador.esValido("]"));
    }
}
