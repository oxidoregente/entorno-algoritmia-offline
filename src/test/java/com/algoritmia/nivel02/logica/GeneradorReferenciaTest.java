package com.algoritmia.nivel02.logica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Generador de Referencia.
 * Valida generación de códigos de referencia únicos.
 */
class GeneradorReferenciaTest {

    @Test
    void testFormatoReferencia() {
        GeneradorReferenciaEnunciado gen = new GeneradorReferenciaEnunciado();
        String ref = gen.generar(500L);
        
        assertNotNull(ref);
        assertTrue(ref.startsWith("REF-500-"));
    }

    @Test
    void testErrorClienteInvalido() {
        GeneradorReferenciaEnunciado gen = new GeneradorReferenciaEnunciado();
        assertThrows(IllegalArgumentException.class, () -> gen.generar(-1L));
    }
}
