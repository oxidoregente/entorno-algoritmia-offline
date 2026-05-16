package com.algoritmia.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.time.Duration;

/**
 * 🏆 SOLUCIONES: WebClient POST y Reintentos.
 */
public class WebClientExtraSoluciones {

    private final WebClient webClient = WebClient.builder().build();

    public Mono<String> enviarDatos(Object body) {
        return webClient.post()
                .uri("https://api.ejemplo.com/data")
                .bodyValue(body)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> consultarConReintento(String url) {
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .retry(3);
    }
}
