package com.brandon.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * 🏆 SOLUCIÓN: Consultor de Tasa de Cambio.
 */
public class ConsultorTasaCambioSolucion {

    private final WebClient webClient;

    public ConsultorTasaCambioSolucion(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<Double> obtenerTasaUSD() {
        return this.webClient.get()
                .uri("/api/v1/rates/USD-EUR")
                .retrieve()
                .bodyToMono(Map.class)
                .map(mapa -> (Double) mapa.get("rate"));
    }
}
