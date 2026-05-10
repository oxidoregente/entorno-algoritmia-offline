package com.brandon.nivel1.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Test para DetectorAnagramas.
 */
class DetectorAnagramasTest {

    @Test
    void testAnagramasValidos() {
        DetectorAnagramas detector = new DetectorAnagramas();
        
        // Arrange & Act & Assert
        assertTrue(detector.sonAnagramas("Listen", "Silent"), "Listen y Silent deberían ser anagramas");
        assertTrue(detector.sonAnagramas("Roma", "Amor"), "Roma y Amor deberían ser anagramas");
        assertTrue(detector.sonAnagramas("A gentleman", "Elegant man"), "Frases con espacios también cuentan");
    }

    @Test
    void testAnagramasInvalidos() {
        DetectorAnagramas detector = new DetectorAnagramas();
        
        assertFalse(detector.sonAnagramas("Hola", "Adios"), "Palabras distintas no son anagramas");
        assertFalse(detector.sonAnagramas("Java", "Jvaa1"), "Diferente longitud no son anagramas");
    }

    @Test
    void testCasosLimite() {
        DetectorAnagramas detector = new DetectorAnagramas();
        
        assertTrue(detector.sonAnagramas("", ""), "Strings vacíos son anagramas técnicos");
        assertTrue(detector.sonAnagramas("   ", " "), "Solo espacios deben considerarse vacíos e iguales");
    }
}
