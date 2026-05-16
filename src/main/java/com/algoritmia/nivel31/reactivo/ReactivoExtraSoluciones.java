package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 🏆 SOLUCIONES: Programación Reactiva.
 */
public class ReactivoExtraSoluciones {

    public Flux<String> transform(Flux<String> flux) {
        return flux.filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .distinct();
    }

    public Mono<String> zip(Mono<String> m1, Mono<String> m2) {
        return Mono.zip(m1, m2, (s1, s2) -> s1 + s2);
    }

    public Flux<String> errors(Flux<String> flux) {
        return flux.onErrorReturn("Error recuperado");
    }
}
