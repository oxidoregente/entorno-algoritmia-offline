package com.brandon.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class MoverCerosTest {

    @Test
    void testMoverCerosEstandar() {
        MoverCerosEnunciado solver = new MoverCerosEnunciado();
        int[] nums = {0, 1, 0, 3, 12};
        solver.mover(nums);
        // assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}
