package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GeneradorReferenciaTest {

    @Test
    void testFormatoReferencia() {
        GeneradorReferenciaEnunciado gen = new GeneradorReferenciaEnunciado();
        String ref = gen.generar(500L);
        
        // assertNotNull(ref);
        // assertTrue(ref.startsWith("REF-500-"));
    }

    @Test
    void testErrorClienteInvalido() {
        GeneradorReferenciaEnunciado gen = new GeneradorReferenciaEnunciado();
        assertThrows(IllegalArgumentException.class, () -> gen.generar(-1L));
    }
}
