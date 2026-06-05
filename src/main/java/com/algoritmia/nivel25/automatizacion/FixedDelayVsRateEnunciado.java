package com.algoritmia.nivel25.automatizacion;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: FixedRate vs FixedDelay.
 * <b>Dificultad: Media</b>
 *
 * <p>{@code @Scheduled} admite dos modalidades de periodicidad
 * que se confunden con frecuencia:
 * <ul>
 *   <li><b>fixedRate</b>: el intervalo se mide entre el <b>inicio</b>
 *       de dos ejecuciones consecutivas. Si la tarea tarda más
 *       que el intervalo, se solapan.</li>
 *   <li><b>fixedDelay</b>: el intervalo se mide entre el <b>fin</b>
 *       de la ejecución actual y el inicio de la siguiente.
 *       Nunca se solapan.</li>
 * </ul>
 * Elegir uno u otro depende de si la tarea soporta concurrencia
 * (fixedRate) o si necesita ejecutarse de forma estrictamente
 * secuencial (fixedDelay).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code @Scheduled(fixedRate = 5000)} → se ejecuta cada 5 s desde el inicio
 *       de la anterior.</li>
 *   <li>{@code @Scheduled(fixedDelay = 5000)} → se ejecuta 5 s después de que la
 *       anterior termine.</li>
 *   <li>Para evitar solapamientos usa {@code @Scheduled(fixedDelay = ...)} o añade
 *       un lock distribuido con ShedLock.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class FixedDelayVsRateEnunciado {
 *     &#64;Scheduled(fixedRate = 5000)
 *     public void tareaFrecuente() {
 *         // puede solaparse con la siguiente si tarda más de 5 s
 *     }
 *
 *     &#64;Scheduled(fixedDelay = 5000)
 *     public void tareaSecuencial() {
 *         // siempre espera 5 s tras terminar
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para reportes batch pesados, prefiere {@code fixedDelay} para no saturar la
 *       base de datos.</li>
 *   <li>Para tareas idempotentes y ligeras, {@code fixedRate} permite máxima
 *       cadencia.</li>
 * </ul>
 */
@Component
public class FixedDelayVsRateEnunciado {

    /**
     * Se ejecuta cada 5 segundos, sin importar cuánto dure la tarea.
     * Si la ejecución anterior no ha terminado y han pasado 5 s, se inicia
     * una nueva instancia concurrentemente.
     */
    @Scheduled(fixedRate = 5000)
    public void tareaFrecuente() {
        // Implementación
    }

    /**
     * Se ejecuta 5 segundos DESPUÉS de que termine la anterior.
     * Garantiza no solapamiento: cada ejecución espera a la previa.
     */
    // TODO: Añade la anotación @Scheduled(fixedDelay = 5000) sobre este método.
    public void tareaSecuencial() {
        // Implementación
    }
}
