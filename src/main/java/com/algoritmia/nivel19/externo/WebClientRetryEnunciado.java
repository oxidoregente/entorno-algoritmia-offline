package com.algoritmia.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.time.Duration;

/**
 * 🎓 RETO: Reintentos en WebClient.
 * <b>Dificultad: Media</b>
 * 
 * <p>Las redes fallan. WebClient facilita la implementación de políticas 
 * de reintento para hacer nuestras integraciones más robustas.</p>
 */
public class WebClientRetryEnunciado {

    private final WebClient webClient;

    public WebClientRetryEnunciado(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public Mono<String> consultarConReintento(String url) {
        // TODO: Haz un GET a la URL y añade .retry(3) para reintentar 
        // hasta 3 veces en caso de error.
        return null;
    }
}
