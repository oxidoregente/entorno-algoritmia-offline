package com.brandon.nivel19.externo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * Nivel 19/23: Integración Externa con Resiliencia.
 * 
 * <p>WebClient consume la API, y Resilience4j protege la llamada.</p>
 */
@Service
public class ServicioExternoApi {

    private final WebClient webClient;

    public ServicioExternoApi(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    /**
     * Obtiene info de un repositorio. Si falla, entra el Circuit Breaker.
     */
    @CircuitBreaker(name = "githubApi", fallbackMethod = "fallbackObtenerInfo")
    public Mono<Map> obtenerInfoRepositorio(String user, String repo) {
        return this.webClient.get()
                .uri("/repos/{user}/{repo}", user, repo)
                .retrieve()
                .bodyToMono(Map.class);
    }

    /**
     * Método de respaldo que se ejecuta cuando la API externa falla.
     */
    public Mono<Map> fallbackObtenerInfo(String user, String repo, Throwable t) {
        System.err.println(">> [RESILIENCIA] La API de GitHub falló. Error: " + t.getMessage());
        return Mono.just(Map.of(
            "status", "offline",
            "mensaje", "Información no disponible temporalmente",
            "causa", t.getClass().getSimpleName()
        ));
    }
}
