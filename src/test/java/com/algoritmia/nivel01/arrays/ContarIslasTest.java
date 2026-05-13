package com.algoritmia.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ContarIslasTest {

    @Test
    void testVariasIslas() {
        ContarIslasEnunciado solver = new ContarIslasEnunciado();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        // Expected: 3 islas
        assertEquals(3, solver.numIslands(grid));
    }

    @Test
    void testSinIslas() {
        ContarIslasEnunciado solver = new ContarIslasEnunciado();
        char[][] grid = {
            {'0', '0'},
            {'0', '0'}
        };
        assertEquals(0, solver.numIslands(grid));
    }
}
