package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.FiltroEcommerce.Producto;

class FiltroEcommerceTest {

    @Test
    void testFiltradoYDescuento() {
        FiltroEcommerce ecommerce = new FiltroEcommerce();
        List<Producto> inventario = List.of(
            new Producto("Laptop", 1000.0),
            new Producto("Mouse", 20.0),
            new Producto("Teclado", 50.0),
            new Producto("Monitor", 300.0)
        );

        // Act: Filtramos productos mayores a 100 y aplicamos descuento
        List<String> resultados = ecommerce.obtenerNombresConDescuento(inventario, 100.0);

        // Assert: Esperamos Laptop y Monitor (Mouse y Teclado son < 100)
        assertEquals(2, resultados.size());
        assertTrue(resultados.get(0).contains("Laptop"));
        assertTrue(resultados.get(1).contains("Monitor"));
        assertTrue(resultados.get(0).contains("900.0")); // 1000 * 0.9
    }
}
