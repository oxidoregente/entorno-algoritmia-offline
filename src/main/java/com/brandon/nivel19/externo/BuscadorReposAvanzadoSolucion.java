package com.brandon.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import java.util.Map;
import java.time.Duration;

/**
 * 🏆 SOLUCIÓN: Buscador de Repositorios Avanzado.
 */
public class BuscadorReposAvanzadoSolucion {

    private final WebClient webClient;

    public BuscadorReposAvanzadoSolucion(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Flux<Map> buscarPorLenguaje(String lenguaje) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search/repositories")
                        .queryParam("q", "language:" + lenguaje)
                        .build())
                .retrieve()
                .bodyToFlux(Map.class)
                .timeout(Duration.ofSeconds(2))
                .retry(3);
    }
}
