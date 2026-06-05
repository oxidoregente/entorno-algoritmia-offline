package com.algoritmia.nivel19.externo;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.time.Duration;

/**
 * 🎓 RETO: Reintentos en WebClient.
 * <b>Dificultad: Media</b>
 *
 * <p>Las llamadas HTTP son intrínsecamente frágiles: un timeout
 * transitorio, un balanceador en mantenimiento o un 503
 * momentáneo pueden fallar sin que la integración esté rota.
 * WebClient permite añadir reintentos de forma declarativa
 * con el operador {@code .retry(n)}, que vuelve a emitir la
 * cadena completa hasta n veces ante cualquier error.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El operador {@code .retry(3)} reintenta hasta 3 veces en caso de error
 *       antes de propagar la excepción final al suscriptor.</li>
 *   <li>Para backoff exponencial, usa
 *       {@code .retryWhen(Retry.backoff(3, Duration.ofSeconds(1)))}.</li>
 *   <li>Reintentar peticiones <b>no idempotentes</b> (POST/PUT/DELETE) puede provocar
 *       duplicados; aplica la política solo a GET o a operaciones con idempotency-key.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public class WebClientRetryEnunciado {
 *     private final WebClient webClient;
 *
 *     public WebClientRetryEnunciado(WebClient.Builder builder) {
 *         this.webClient = builder.build();
 *     }
 *
 *     public Mono&lt;String&gt; consultarConReintento(String url) {
 *         return webClient.get()
 *                 .uri(url)
 *                 .retrieve()
 *                 .bodyToMono(String.class)
 *                 .retry(3);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si quieres filtrar qué errores reintentan, usa
 *       {@code .retryWhen(Retry.fixedDelay(3, Duration.ofSeconds(1))
 *                             .filter(ex -&gt; ex instanceof WebClientResponseException))}.</li>
 *   <li>Combinar con {@code .timeout(Duration)} para acotar la espera total.</li>
 * </ul>
 */
public class WebClientRetryEnunciado {

    private final WebClient webClient;

    public WebClientRetryEnunciado(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    /**
     * Realiza una petición GET a la URL indicada, reintentando hasta 3 veces
     * en caso de fallo transitorio.
     *
     * @param url URL absoluta a la que se realiza la petición GET
     * @return {@code Mono} reactivo con la respuesta del servidor como cadena
     */
    public Mono<String> consultarConReintento(String url) {
        // TODO: Haz un GET a la URL y añade .retry(3) para reintentar
        // hasta 3 veces en caso de error.
        return null;
    }
}
