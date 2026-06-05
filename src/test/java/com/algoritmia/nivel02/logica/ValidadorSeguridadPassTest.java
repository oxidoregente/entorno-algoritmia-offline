package com.algoritmia.nivel02.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado.NivelSeguridad;

/**
 * Test para ejercicio de Validador de Seguridad de Password.
 * Valida evaluación de nivel de seguridad de contraseñas.
 */
class ValidadorSeguridadPassTest {

    @Test
    void testEvaluacionContraseñas() {
        ValidadorSeguridadPassEnunciado validador = new ValidadorSeguridadPassEnunciado();
        
        assertEquals(NivelSeguridad.FUERTE, validador.evaluar("Admin123!"));
        assertEquals(NivelSeguridad.MEDIA, validador.evaluar("Solountexto1"));
        assertEquals(NivelSeguridad.DEBIL, validador.evaluar("123"));
    }
}
