package com.brandon.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.brandon.nivel03.servicios.GestorInventarioEnunciado.EstatusOrden;

class GestorInventarioTest {

    @Test
    void testProcesamientoExitoso() {
        GestorInventarioEnunciado gestor = new GestorInventarioEnunciado();
        assertEquals(EstatusOrden.PROCESADO_EXITOSO, gestor.procesarOrden(20, 5, false));
    }

    @Test
    void testSinStock() {
        GestorInventarioEnunciado gestor = new GestorInventarioEnunciado();
        assertEquals(EstatusOrden.RECHAZADO_SIN_STOCK, gestor.procesarOrden(10, 15, false));
    }

    @Test
    void testAlertaVital() {
        GestorInventarioEnunciado gestor = new GestorInventarioEnunciado();
        // 10 stock - 6 pedido = 4 (< 5 y es vital)
        assertEquals(EstatusOrden.ALERTA_STOCK_BAJO, gestor.procesarOrden(10, 6, true));
    }
}
