package com.algoritmia.nivel21.resiliencia;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 🎓 RETO: Estrategia de Reintentos (Retry).
 * <b>Dificultad: Media</b>
 *
 * <p>Muchas fallas son transitorias: un timeout de red, un servicio reiniciándose,
 * un deadlock momentáneo. Reintentar la operación automáticamente es una de las
 * estrategias de resiliencia más efectivas. Resilience4j lo implementa con la
 * anotación <code>@Retry</code>, configurable vía propiedades.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>@Retry(name = "...")</code> para proteger el método.</li>
 *   <li>Configura <code>max-attempts</code>, <code>wait-duration</code> y backoff en <code>application.yml</code>.</li>
 *   <li>Solo tiene sentido reintentar ante excepciones "recuperables" (no en errores de validación).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # application.yml
 * resilience4j.retry:
 *   instances:
 *     reintentosVarios:
 *       max-attempts: 3
 *       wait-duration: 500ms
 *       exponential-backoff-multiplier: 2
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Incrementa el contador con <code>intentos.incrementAndGet()</code>.</li>
 *   <li>Lanza <code>throw new RuntimeException("Fallo temporal")</code> mientras <code>intentos &lt; 3</code>.</li>
 *   <li>Devuelve <code>"Éxito tras reintentos"</code> cuando <code>intentos == 3</code>.</li>
 * </ul>
 */
@Service
public class ReintentadorServicioEnunciado {

    private AtomicInteger intentos = new AtomicInteger(0);

    /**
     * Simula una operación que falla las dos primeras veces y tiene éxito al tercer intento.
     *
     * @return Mensaje de éxito una vez superados los reintentos, o {@code null} si la implementación no está lista.
     */
    @Retry(name = "reintentosVarios")
    public String operacionConFallaTemporal() {
        // TODO: Incrementa el contador de intentos
        // TODO: Si intentos < 3 -> Lanza RuntimeException
        // TODO: Si intentos == 3 -> Devuelve "Éxito tras reintentos"
        return null;
    }

    /**
     * Devuelve la cantidad de veces que el método {@link #operacionConFallaTemporal()} ha sido invocado.
     *
     * @return Número de intentos acumulados.
     */
    public int getIntentos() { return intentos.get(); }
}
