package com.algoritmia.nivel19.externo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * 🎓 RETO: Integración con API de GitHub con Resiliencia.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa un servicio que consulte la API de GitHub
 * ({@code GET /repos/{user}/{repo}}) de forma reactiva y protegida
 * con un CircuitBreaker de Resilience4j.</p>
 *
 * <p>Si la API externa falla, el método de fallback debe devolver
 * una respuesta de respaldo con datos simulados.</p>
 *
 * <h3>Example:</h3>
 * <pre>
 * obtenerInfoRepositorio("spring-projects", "spring-boot")
 *   -> Mono&lt;Map&gt; con datos del repositorio o fallback
 * </pre>
 */
@Service
public class ServicioExternoApiEnunciado {

    private final WebClient webClient;

    public ServicioExternoApiEnunciado(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    /**
     * Obtiene información de un repositorio de GitHub.
     *
     * @param user Nombre del usuario/organización en GitHub.
     * @param repo Nombre del repositorio.
     * @return Mono con los datos del repositorio o fallback si falla.
     */
    @CircuitBreaker(name = "githubApi", fallbackMethod = "fallbackObtenerInfo")
    public Mono<Map> obtenerInfoRepositorio(String user, String repo) {
        // TODO: Implementar llamada GET reactiva
        return null;
    }

    /**
     * Método de respaldo cuando el CircuitBreaker está abierto.
     *
     * @param user Nombre del usuario/organización en GitHub.
     * @param repo Nombre del repositorio.
     * @param t    Excepción que causó la falla.
     * @return Mono con datos simulados de respaldo.
     */
    public Mono<Map> fallbackObtenerInfo(String user, String repo, Throwable t) {
        // TODO: Implementar respuesta de respaldo
        return null;
    }
}
