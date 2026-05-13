package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Mono;

/**
 * 🏆 SOLUCIÓN: Validador de Negocio Reactivo.
 */
public class ValidadorReactivoSolucion {

    public Mono<Boolean> validarTodo(Long userId, Long pedidoId) {
        Mono<Boolean> userOk = Mono.just(true);
        Mono<Boolean> pedidoOk = Mono.just(true);

        return Mono.zip(userOk, pedidoOk)
                .map(tuple -> tuple.getT1() && tuple.getT2());
    }
}
