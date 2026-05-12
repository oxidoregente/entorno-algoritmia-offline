package com.brandon.nivel06.servicios;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.brandon.nivel06.excepciones.ErrorDeNegocioException;
import org.junit.jupiter.api.Test;

class ValidadorTransaccionNegocioTest {

    @Test
    void testExcepcionLanzada() {
        ValidadorTransaccionNegocioEnunciado validador = new ValidadorTransaccionNegocioEnunciado();
        
        assertThrows(ErrorDeNegocioException.class, () -> {
            validador.validarMonto(15000);
        });
    }
}
