package com.brandon.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * SOLUCIÓN: Integración con API de GitHub con Resiliencia.
 */
public class ServicioExternoApiSolucion {

    private final WebClient webClient;

    public ServicioExternoApiSolucion(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    public Mono<Map> obtenerInfoRepositorio(String user, String repo) {
        return this.webClient.get()
                .uri("/repos/{user}/{repo}", user, repo)
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> fallbackObtenerInfo(String user, String repo, Throwable t) {
        return Mono.just(Map.of("status", "offline"));
    }
}
