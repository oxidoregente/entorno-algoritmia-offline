package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Sistema de Reservas de Vuelos.
 * Valida cálculo de precios por destino y clase.
 */
class SistemaReservasVuelosTest {

    @Test
    void testCalculoVueloEjecutiva() {
        SistemaReservasVuelosEnunciado sistema = new SistemaReservasVuelosEnunciado();
        // Madrid(500) * 1.5 = 750 + 45 = 795
        assertEquals(795.0, sistema.calcularPrecioTicket("MADRID", "EJECUTIVA"));
    }

    @Test
    void testDestinoInexistente() {
        SistemaReservasVuelosEnunciado sistema = new SistemaReservasVuelosEnunciado();
        assertThrows(IllegalArgumentException.class, () -> {
            sistema.calcularPrecioTicket("TOKIO", "TURISTA");
        });
    }
}
