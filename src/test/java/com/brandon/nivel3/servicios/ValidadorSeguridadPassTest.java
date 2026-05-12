package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.brandon.nivel3.servicios.ValidadorSeguridadPassEnunciado.NivelSeguridad;

class ValidadorSeguridadPassTest {

    @Test
    void testEvaluacionContraseñas() {
        ValidadorSeguridadPassEnunciado validador = new ValidadorSeguridadPassEnunciado();
        
        assertEquals(NivelSeguridad.FUERTE, validador.evaluar("Admin123!"));
        assertEquals(NivelSeguridad.MEDIA, validador.evaluar("Solountexto1"));
        assertEquals(NivelSeguridad.DEBIL, validador.evaluar("123"));
    }
}
