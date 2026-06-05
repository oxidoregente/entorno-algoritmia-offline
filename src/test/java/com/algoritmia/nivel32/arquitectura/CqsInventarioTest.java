package com.algoritmia.nivel32.arquitectura;

import static org.junit.jupiter.api.Assertions.*;
import com.algoritmia.nivel32.arquitectura.CqsInventarioEnunciado.Inventario;
import org.junit.jupiter.api.Test;

class CqsInventarioTest {

    @Test
    void testComandosYQueries() {
        Inventario inv = new Inventario();
        inv.agregarProducto("Laptop", 10);
        inv.agregarProducto("Mouse", 50);

        assertEquals(2, inv.contarProductos());
        assertEquals(10, inv.stockDe("Laptop"));
        assertEquals(50, inv.stockDe("Mouse"));
        assertEquals(0, inv.stockDe("Inexistente"));
    }

    @Test
    void testReducirStock() {
        Inventario inv = new Inventario();
        inv.agregarProducto("Laptop", 10);
        inv.reducirStock("Laptop", 3);
        assertEquals(7, inv.stockDe("Laptop"));
    }

    @Test
    void testReducirStockInsuficienteLanzaExcepcion() {
        Inventario inv = new Inventario();
        inv.agregarProducto("Laptop", 2);
        assertThrows(IllegalArgumentException.class, () -> inv.reducirStock("Laptop", 5));
    }
}
