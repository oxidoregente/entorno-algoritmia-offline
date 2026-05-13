package com.algoritmia.nivel19.externo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import java.util.Map;
import java.time.Duration;

/**
 * 🎓 RETO: Buscador de Repositorios Avanzado (Reactivo).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Busca repositorios en GitHub por lenguaje, pero añade una capa de 
 * resiliencia técnica:
 * 1. Timeout: Si la API tarda más de 2 segundos, debe fallar.
 * 2. Reintentos: Si falla, debe reintentar hasta 3 veces antes de rendirse.</p>
 */
@Service
public class BuscadorReposAvanzadoEnunciado {

    private final WebClient webClient;

    public BuscadorReposAvanzadoEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    public Flux<Map> buscarPorLenguaje(String lenguaje) {
        // TODO: Implementa GET /search/repositories?q=language:{lenguaje}
        // TODO: Añade .timeout(Duration.ofSeconds(2))
        // TODO: Añade .retry(3)
        return null;
    }
}
