package com.algoritmia.nivel23.resiliencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.function.Supplier;

class GestorFallasTest {

    @Test
    void testExitoOperacion() {
        GestorFallasEnunciado gestor = new GestorFallasEnunciado();
        String resultado = gestor.llamarServicioInestable(() -> "OK");
        // assertEquals("OK", resultado);
    }

    @Test
    void testFallbackEnFalla() {
        GestorFallasEnunciado gestor = new GestorFallasEnunciado();
        // Simulamos una falla lanzando excepción
        String resultado = gestor.metodoDeRespaldo(() -> { throw new RuntimeException(); }, new RuntimeException());
        // assertEquals("Respuesta de Emergencia", resultado);
    }
}
