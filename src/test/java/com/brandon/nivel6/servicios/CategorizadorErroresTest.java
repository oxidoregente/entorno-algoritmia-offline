package com.brandon.nivel6.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.brandon.nivel6.servicios.CategorizadorErroresEnunciado.ErrorRespuesta;

class CategorizadorErroresTest {

    @Test
    void testCategorizacion() {
        CategorizadorErroresEnunciado categorizador = new CategorizadorErroresEnunciado();
        
        ErrorRespuesta e1 = categorizador.categorizar(new NullPointerException());
        assertEquals("E001", e1.codigo());

        ErrorRespuesta e2 = categorizador.categorizar(new RuntimeException("Inesperado"));
        assertEquals("E999", e2.codigo());
    }
}
