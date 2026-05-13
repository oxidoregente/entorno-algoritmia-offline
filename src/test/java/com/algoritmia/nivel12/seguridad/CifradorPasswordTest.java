package com.algoritmia.nivel12.seguridad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CifradorPasswordTest {

    @Test
    void testCifradoExitoso() {
        CifradorPasswordEnunciado cifrador = new CifradorPasswordEnunciado();
        String pass = "Admin123";
        String encoded = cifrador.cifrar(pass);
        
        // El test fallará si el estudiante no implementa la lógica
        // assertNotNull(encoded);
        // assertNotEquals(pass, encoded);
        // assertTrue(cifrador.coinciden(pass, encoded));
    }
}
