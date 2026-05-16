package com.algoritmia.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * 🎓 RETO: Peticiones POST con WebClient.
 * <b>Dificultad: Media</b>
 * 
 * <p>Aprende a enviar datos (cuerpo de la petición) a una API externa 
 * de forma reactiva.</p>
 */
public class WebClientPostEnunciado {

    private final WebClient webClient;

    public WebClientPostEnunciado(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.ejemplo.com").build();
    }

    public Mono<String> enviarDatos(Object body) {
        // TODO: Usa webClient.post(), define el bodyValue y recupera el bodyToMono(String.class)
        return null;
    }
}
