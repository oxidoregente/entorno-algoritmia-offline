package com.algoritmia.nivel18.externo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import java.util.Map;
import java.time.Duration;

/**
 * 🎓 RETO: Buscador de Repositorios Avanzado (Reactivo).
 * <b>Dificultad: Difícil</b>
 *
 * <p>En integraciones con APIs externas, una sola llamada
 * sin resiliencia es una bomba de relojería. WebClient, el
 * cliente HTTP reactivo de Spring, permite componer
 * operadores de Reactor para añadir <b>timeout</b> (límite
 * de espera) y <b>reintentos</b> (backoff) en una sola
 * cadena funcional. Este reto consume la API de búsqueda
 * de repositorios de GitHub filtrando por lenguaje, con un
 * timeout de 2 s y hasta 3 reintentos antes de rendirse.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Construir el {@link WebClient} con un {@code baseUrl} y, opcionalmente,
 *       cabeceras comunes (User-Agent, Authorization).</li>
 *   <li>Usar {@code .timeout(Duration)} para acotar la espera máxima.</li>
 *   <li>Usar {@code .retry(n)} para reintentar la cadena completa n veces ante error.</li>
 *   <li>Devolver un {@code Flux<Map>} para flujos reactivos de elementos.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class BuscadorReposAvanzadoEnunciado {
 *     private final WebClient webClient;
 *
 *     public BuscadorReposAvanzadoEnunciado(WebClient.Builder b) {
 *         this.webClient = b.baseUrl("https://api.github.com").build();
 *     }
 *
 *     public Flux&lt;Map&gt; buscarPorLenguaje(String lenguaje) {
 *         return webClient.get()
 *                 .uri("/search/repositories?q=language:{lang}", lenguaje)
 *                 .retrieve()
 *                 .bodyToFlux(Map.class)
 *                 .timeout(Duration.ofSeconds(2))
 *                 .retry(3);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code uri("/search/repositories?q=language:{lang}", lenguaje)} para
 *       parámetros seguros codificados automáticamente.</li>
 *   <li>Si necesitas distinguir reintentos por tipo de error, prefiere
 *       {@code .retryWhen(Retry.fixedDelay(3, Duration.ofSeconds(1)))}.</li>
 * </ul>
 */
@Service
public class BuscadorReposAvanzadoEnunciado {

    private final WebClient webClient;

    public BuscadorReposAvanzadoEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    /**
     * Busca repositorios en GitHub por lenguaje con políticas de timeout y reintento.
     *
     * @param lenguaje lenguaje de programación usado para filtrar (ej. {@code "java"})
     * @return {@code Flux} reactivo con los repositorios encontrados, limitado a 2 s
     *         por intento y reintentado hasta 3 veces en caso de error
     */
    public Flux<Map> buscarPorLenguaje(String lenguaje) {
        // TODO: Implementa GET /search/repositories?q=language:{lenguaje}
        // TODO: Añade .timeout(Duration.ofSeconds(2))
        // TODO: Añade .retry(3)
        return null;
    }
}
