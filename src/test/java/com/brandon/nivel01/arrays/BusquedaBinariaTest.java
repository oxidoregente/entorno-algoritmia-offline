package com.brandon.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BusquedaBinariaTest {

    @Test
    void testBusquedaExistente() {
        BusquedaBinariaEnunciado bb = new BusquedaBinariaEnunciado();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, bb.buscar(nums, 9));
    }

    @Test
    void testBusquedaNoExistente() {
        BusquedaBinariaEnunciado bb = new BusquedaBinariaEnunciado();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, bb.buscar(nums, 2));
    }
}
