package com.algoritmia.nivel19.externo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * 🎓 RETO: Consultor de Tasa de Cambio.
 * <b>Dificultad: Media</b>
 *
 * <p>En aplicaciones de e-commerce, banca o conversión de
 * divisas, obtener tasas de cambio actualizadas es esencial.
 * WebClient permite consumir APIs externas de forma
 * reactiva (no bloqueante) y tipar la respuesta como
 * {@code Mono} para un único valor. Este reto consume un
 * endpoint simulado {@code /api/v1/rates/USD-EUR} y extrae
 * la tasa actual del Dólar frente al Euro.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Configurar el {@link WebClient} con un {@code baseUrl} evita repetir la URL
 *       en cada llamada.</li>
 *   <li>{@code .retrieve().bodyToMono(Map.class)} convierte la respuesta JSON en un
 *       mapa clave-valor.</li>
 *   <li>Para extraer un campo del mapa se puede usar {@code .mapNotNull(m -> ((Number) m.get("rate")).doubleValue())}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class ConsultorTasaCambioEnunciado {
 *     private final WebClient webClient;
 *
 *     public ConsultorTasaCambioEnunciado(WebClient.Builder b) {
 *         this.webClient = b.baseUrl("http://api-finanzas.com").build();
 *     }
 *
 *     public Mono&lt;Double&gt; obtenerTasaUSD() {
 *         return webClient.get()
 *                 .uri("/api/v1/rates/USD-EUR")
 *                 .retrieve()
 *                 .bodyToMono(Map.class)
 *                 .map(m -&gt; ((Number) m.get("rate")).doubleValue());
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>En producción, modela la respuesta con un DTO (registro Java) en lugar de
 *       {@code Map} para type-safety y autocompletado.</li>
 *   <li>Si el valor puede ser {@code null}, devuelve {@code Mono.empty()} con
 *       {@code .filter(Objects::nonNull)} en lugar de propagar NPE.</li>
 * </ul>
 */
@Service
public class ConsultorTasaCambioEnunciado {

    private final WebClient webClient;

    public ConsultorTasaCambioEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api-finanzas.com").build();
    }

    /**
     * Obtiene la tasa de cambio actual del Dólar frente al Euro.
     *
     * @return {@code Mono} reactivo que emite la tasa solicitada
     *         (campo {@code rate} de la respuesta JSON)
     */
    public Mono<Double> obtenerTasaUSD() {
        // TODO: Realiza la llamada GET, recupera el body como Map y extrae el campo "rate"
        return null;
    }
}
