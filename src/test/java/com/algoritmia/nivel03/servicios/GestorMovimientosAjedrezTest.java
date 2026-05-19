package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel03.servicios.GestorMovimientosAjedrezEnunciado.Pieza;

/**
 * Test para ejercicio de Gestor de Movimientos de Ajedrez.
 * Valida movimientos válidos por tipo de pieza.
 */
class GestorMovimientosAjedrezTest {

    @Test
    void testMovimientoPeonValido() {
        GestorMovimientosAjedrezEnunciado gestor = new GestorMovimientosAjedrezEnunciado();
        assertTrue(gestor.esMovimientoValido(Pieza.PEON, 0, 1, 0, 2));
    }

    @Test
    void testMovimientoTorreInvalido() {
        GestorMovimientosAjedrezEnunciado gestor = new GestorMovimientosAjedrezEnunciado();
        assertFalse(gestor.esMovimientoValido(Pieza.TORRE, 0, 1, 1, 5), "Torre no puede moverse diagonal");
    }

    @Test
    void testFueraDeTablero() {
        GestorMovimientosAjedrezEnunciado gestor = new GestorMovimientosAjedrezEnunciado();
        assertFalse(gestor.esMovimientoValido(Pieza.PEON, 0, 7, 0, 8));
    }
}
