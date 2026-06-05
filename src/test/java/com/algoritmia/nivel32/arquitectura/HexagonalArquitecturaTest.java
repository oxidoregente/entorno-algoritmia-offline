package com.algoritmia.nivel32.arquitectura;

import static org.junit.jupiter.api.Assertions.*;
import com.algoritmia.nivel32.arquitectura.HexagonalArquitecturaEnunciado.AdaptadorConsola;
import com.algoritmia.nivel32.arquitectura.HexagonalArquitecturaEnunciado.PuertoNotificaciones;
import com.algoritmia.nivel32.arquitectura.HexagonalArquitecturaEnunciado.ServicioPedidos;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class HexagonalArquitecturaTest {

    @Test
    void testCrearPedidoNotifica() {
        // Adaptador de prueba que captura mensajes en una lista
        List<String> mensajes = new ArrayList<>();
        PuertoNotificaciones adaptadorPrueba = mensajes::add;

        ServicioPedidos servicio = new ServicioPedidos(adaptadorPrueba);
        UUID id = servicio.crearPedido("Laptop", 1500.0);

        assertNotNull(id);
        assertEquals(1, servicio.totalPedidos());
        assertEquals(1, mensajes.size());
        assertTrue(mensajes.get(0).contains("Laptop"));
    }

    @Test
    void testAdaptadorConsolaNoLanza() {
        ServicioPedidos servicio = new ServicioPedidos(new AdaptadorConsola());
        assertDoesNotThrow(() -> servicio.crearPedido("Mouse", 50.0));
    }
}
