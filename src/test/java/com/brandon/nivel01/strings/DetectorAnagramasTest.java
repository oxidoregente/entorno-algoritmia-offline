package com.brandon.nivel01.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Test para validar DetectorAnagramasEnunciado.
 * El estudiante debe programar para poner estos tests en verde.
 */
class DetectorAnagramasTest {

    @Test
    void testAnagramasValidos() {
        DetectorAnagramasEnunciado detector = new DetectorAnagramasEnunciado();
        
        assertTrue(detector.sonAnagramas("Listen", "Silent"), "Listen y Silent deberían ser anagramas");
        assertTrue(detector.sonAnagramas("Roma", "Amor"), "Roma y Amor deberían ser anagramas");
        assertTrue(detector.sonAnagramas("A gentleman", "Elegant man"), "Frases con espacios también cuentan");
    }

    @Test
    void testAnagramasInvalidos() {
        DetectorAnagramasEnunciado detector = new DetectorAnagramasEnunciado();
        
        assertFalse(detector.sonAnagramas("Hola", "Adios"), "Palabras distintas no son anagramas");
        assertFalse(detector.sonAnagramas("Java", "Jvaa1"), "Diferente longitud no son anagramas");
    }

    @Test
    void testCasosLimite() {
        DetectorAnagramasEnunciado detector = new DetectorAnagramasEnunciado();
        
        assertTrue(detector.sonAnagramas("", ""), "Strings vacíos son anagramas técnicos");
        assertTrue(detector.sonAnagramas("   ", " "), "Solo espacios deben considerarse vacíos e iguales");
    }
}
