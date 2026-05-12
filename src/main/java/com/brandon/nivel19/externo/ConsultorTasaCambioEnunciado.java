package com.brandon.nivel19.externo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * 🎓 RETO: Consultor de Tasa de Cambio.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que consulte una API externa para obtener el valor 
 * del Dólar frente al Euro.</p>
 * 
 * <p>Endpoint simulado: GET /api/v1/rates/USD-EUR</p>
 */
@Service
public class ConsultorTasaCambioEnunciado {

    private final WebClient webClient;

    public ConsultorTasaCambioEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api-finanzas.com").build();
    }

    public Mono<Double> obtenerTasaUSD() {
        // TODO: Realiza la llamada GET, recupera el body como Map y extrae el campo "rate"
        return null;
    }
}
