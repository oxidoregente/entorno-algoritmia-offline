package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;
import java.time.Instant;

/**
 * 🎓 RETO: Programación Dinámica con TaskScheduler.
 * <b>Dificultad: Difícil</b>
 *
 * <p>{@code @Scheduled} es ideal para tareas con horario
 * conocido, pero muchas aplicaciones necesitan programar
 * tareas en <b>tiempo de ejecución</b>: un recordatorio
 * creado por el usuario, una reunión, una factura que vence
 * en N días, etc. Para estos casos, Spring expone la
 * interfaz {@link TaskScheduler}, que permite registrar
 * tareas dinámicas y cancelarlas si es necesario.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link TaskScheduler#schedule(Runnable, Instant)} programa una tarea para un
 *       {@link Instant} concreto y devuelve un {@link java.util.concurrent.ScheduledFuture}
 *       que permite cancelarla.</li>
 *   <li>El bean {@code TaskScheduler} lo autoconfigura Spring Boot al detectar
 *       {@code @EnableScheduling}.</li>
 *   <li>Si el {@code Instant} ya pasó, la tarea se ejecuta inmediatamente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class DynamicSchedulerEnunciado {
 *     private final TaskScheduler taskScheduler;
 *
 *     public DynamicSchedulerEnunciado(TaskScheduler taskScheduler) {
 *         this.taskScheduler = taskScheduler;
 *     }
 *
 *     public void programarTarea(Runnable tarea, Instant momento) {
 *         taskScheduler.schedule(tarea, momento);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para tareas periódicas dinámicas, usa
 *       {@code scheduleAtFixedRate(task, Instant, Duration)}.</li>
 *   <li>Guarda el {@code ScheduledFuture} devuelto si necesitas cancelar la tarea
 *       más adelante (ej. cuando el usuario elimina el recordatorio).</li>
 * </ul>
 */
@Component
public class DynamicSchedulerEnunciado {

    private final TaskScheduler taskScheduler;

    public DynamicSchedulerEnunciado(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    /**
     * Programa la ejecución de una tarea en un instante concreto.
     *
     * @param tarea   bloque de código que se ejecutará de forma asíncrona
     * @param momento instante absoluto en el que debe dispararse la tarea
     */
    public void programarTarea(Runnable tarea, Instant momento) {
        // TODO: Usa el taskScheduler para programar la tarea en el momento indicado.
    }
}
