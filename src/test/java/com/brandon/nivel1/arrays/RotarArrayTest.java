package com.brandon.nivel1.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class RotarArrayTest {

    @Test
    void testRotarEstandar() {
        RotarArrayEnunciado solver = new RotarArrayEnunciado();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solver.rotar(nums, 3);
        // assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void testRotarKMayorQueLongitud() {
        RotarArrayEnunciado solver = new RotarArrayEnunciado();
        int[] nums = {-1, -100, 3, 99};
        solver.rotar(nums, 2);
        // assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
}
