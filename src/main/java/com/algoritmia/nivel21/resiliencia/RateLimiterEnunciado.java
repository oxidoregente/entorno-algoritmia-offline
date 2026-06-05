package com.algoritmia.nivel21.resiliencia;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Limitación de Tasa (Rate Limiter).
 * <b>Dificultad: Media</b>
 *
 * <p>Cuando expones un endpoint público (API de cotizaciones, generador de
 * reportes, etc.) necesitas evitar que un cliente abuse enviando miles de
 * peticiones por segundo. El Rate Limiter descarta o retrasa las llamadas
 * que exceden el umbral configurado, protegiendo el backend.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Se aplica con <code>@RateLimiter(name = "...")</code>.</li>
 *   <li>Se configura en <code>application.yml</code> bajo <code>resilience4j.ratelimiter.instances</code>.</li>
 *   <li>Si se supera el límite se lanza <code>RequestNotPermitted</code> (o se redirige al fallback).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # application.yml
 * resilience4j.ratelimiter:
 *   instances:
 *     backendPublico:
 *       limit-for-period: 5
 *       limit-refresh-period: 1m
 *       timeout-duration: 0
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>@RateLimiter(name = "backendPublico")</code> sobre el método.</li>
 *   <li>Configura el límite por periodo en <code>application.yml</code>.</li>
 * </ul>
 */
@Service
public class RateLimiterEnunciado {

    /**
     * Consulta un recurso externo limitada a 5 llamadas por minuto para evitar
     * abuso del cliente y proteger el sistema backend.
     *
     * @return Resultado ficticio de la consulta al recurso.
     */
    @RateLimiter(name = "backendPublico")
    public String consultarRecurso() {
        return "Datos del recurso";
    }
}
