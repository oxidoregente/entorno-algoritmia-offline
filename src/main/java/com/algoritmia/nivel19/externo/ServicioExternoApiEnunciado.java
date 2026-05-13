package com.algoritmia.nivel19.externo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * RETO: Integración con API de GitHub con Resiliencia.
 */
@Service
public class ServicioExternoApiEnunciado {

    private final WebClient webClient;

    public ServicioExternoApiEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    @CircuitBreaker(name = "githubApi", fallbackMethod = "fallbackObtenerInfo")
    public Mono<Map> obtenerInfoRepositorio(String user, String repo) {
        // TODO: Implementar llamada GET reactiva
        return null;
    }

    public Mono<Map> fallbackObtenerInfo(String user, String repo, Throwable t) {
        // TODO: Implementar respuesta de respaldo
        return null;
    }
}
