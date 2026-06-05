package com.algoritmia.nivel32.arquitectura;

import static org.junit.jupiter.api.Assertions.*;
import com.algoritmia.nivel32.arquitectura.AggregateRootEnunciado.Pedido;
import org.junit.jupiter.api.Test;

class AggregateRootTest {

    @Test
    void testCalcularTotal() {
        Pedido p = new Pedido("P001");
        p.agregarItem("Laptop", 1500.0);
        p.agregarItem("Mouse", 50.0);
        assertEquals(1550.0, p.calcularTotal());
    }

    @Test
    void testConfirmar() {
        Pedido p = new Pedido("P001");
        p.agregarItem("Laptop", 1500.0);
        p.confirmar();
        assertTrue(p.estaConfirmado());
    }

    @Test
    void testNoAgregarTrasConfirmar() {
        Pedido p = new Pedido("P001");
        p.agregarItem("Laptop", 1500.0);
        p.confirmar();
        assertThrows(IllegalStateException.class, () -> p.agregarItem("Mouse", 50.0));
    }
}
