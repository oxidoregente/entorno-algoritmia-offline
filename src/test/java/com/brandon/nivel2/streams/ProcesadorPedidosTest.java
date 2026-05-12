package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.ProcesadorPedidosEnunciado.*;

class ProcesadorPedidosTest {

    @Test
    void testItemsUnicos() {
        Pedido p1 = new Pedido(1L, List.of(new Item("Laptop"), new Item("Mouse")));
        Pedido p2 = new Pedido(2L, List.of(new Item("Mouse"), new Item("Teclado")));
        
        ProcesadorPedidosEnunciado solver = new ProcesadorPedidosEnunciado();
        List<String> resultado = solver.obtenerNombresItemsUnicos(List.of(p1, p2));

        // Expected: ["Laptop", "Mouse", "Teclado"] (sin duplicados, ordenados)
        // assertNotNull(resultado);
        // assertEquals(3, resultado.size());
        // assertEquals("Laptop", resultado.get(0));
    }
}
