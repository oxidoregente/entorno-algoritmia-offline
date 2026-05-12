package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PalindromoTest {

    @Test
    void testPalindromosValidos() {
        PalindromoEnunciado detector = new PalindromoEnunciado();
        
        assertTrue(detector.esPalindromo("Ojo"));
        assertTrue(detector.esPalindromo("Anita lava la tina"));
        assertTrue(detector.esPalindromo("1221"));
    }

    @Test
    void testPalindromosInvalidos() {
        PalindromoEnunciado detector = new PalindromoEnunciado();
        
        assertFalse(detector.esPalindromo("Hola Mundo"));
        assertFalse(detector.esPalindromo("Java"));
    }
}
