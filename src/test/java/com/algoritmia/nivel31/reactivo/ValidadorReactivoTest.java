package com.algoritmia.nivel31.reactivo;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

/**
 * Test para ejercicio de Validador Reactivo.
 * Valida operaciones reactivas con Mono y Flux.
 */
class ValidadorReactivoTest {

    @Test
    void testValidacionParalela() {
        ValidadorReactivoEnunciado validador = new ValidadorReactivoEnunciado();
        // El test fallará hasta que el estudiante use Mono.zip
        // StepVerifier.create(validador.validarTodo(1L, 1L))
        //         .expectNext(true)
        //         .verifyComplete();
    }
}
