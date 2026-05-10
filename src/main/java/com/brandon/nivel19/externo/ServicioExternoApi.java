package com.brandon.nivel19.externo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * Nivel 19: Integración con APIs Externas usando WebClient.
 * 
 * <p>WebClient es el cliente HTTP moderno, no bloqueante y reactivo de Spring.
 * Sustituye al antiguo RestTemplate.</p>
 */
@Service
public class ServicioExternoApi {

    private final WebClient webClient;

    public ServicioExternoApi(WebClient.Builder webClientBuilder) {
        // Configuramos la URL base (usando una API pública de ejemplo)
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    /**
     * Obtiene información de un repositorio público como ejemplo de consumo.
     */
    public Mono<Map> obtenerInfoRepositorio(String user, String repo) {
        return this.webClient.get()
                .uri("/repos/{user}/{repo}", user, repo)
                .retrieve()
                .bodyToMono(Map.class);
    }
}
