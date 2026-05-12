package com.brandon.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel02.streams.FiltroEcommerceEnunciado.Producto;

class FiltroEcommerceTest {

    @Test
    void testFiltradoYDescuento() {
        FiltroEcommerceEnunciado ecommerce = new FiltroEcommerceEnunciado();
        List<Producto> inventario = List.of(
            new Producto("Laptop", 1000.0),
            new Producto("Mouse", 20.0),
            new Producto("Monitor", 300.0)
        );

        List<String> resultados = ecommerce.obtenerNombresConDescuento(inventario, 100.0);

        assertEquals(2, resultados.size());
        assertTrue(resultados.get(0).contains("Laptop"));
        assertTrue(resultados.get(0).contains("900.0"));
    }
}
