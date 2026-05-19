package com.algoritmia.nivel06.servicios;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.algoritmia.nivel06.excepciones.ErrorDeNegocioException;
import org.junit.jupiter.api.Test;

/**
 * Test para ejercicio de Validador de Transacción de Negocio.
 * Valida reglas de negocio con excepciones.
 */
class ValidadorTransaccionNegocioTest {

    @Test
    void testExcepcionLanzada() {
        ValidadorTransaccionNegocioEnunciado validador = new ValidadorTransaccionNegocioEnunciado();
        
        assertThrows(ErrorDeNegocioException.class, () -> {
            validador.validarMonto(15000);
        });
    }
}
