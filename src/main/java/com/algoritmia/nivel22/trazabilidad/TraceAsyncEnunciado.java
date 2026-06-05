package com.algoritmia.nivel22.trazabilidad;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Propagación de Trazas en Hilos Asíncronos.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Cuando una petición se procesa de forma asíncrona (con <code>@Async</code>,
 * <code>CompletableFuture</code> o un <code>TaskExecutor</code>), el hilo nuevo
 * no hereda automáticamente el contexto de tracing. Si no configuras la
 * propagación, en Zipkin verás trazas "rotas" sin un padre identificable.
 * Micrometer Tracing ofrece decoradores como <code>ContextSnapshot</code> para
 * capturar y restaurar el contexto entre hilos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El <code>TaskExecutor</code> de Spring debe configurarse con un <code>ContextPropagatingTaskDecorator</code> para propagar el contexto.</li>
 *   <li>También se puede usar <code>ContextSnapshot</code> manualmente al lanzar tareas reactivas.</li>
 *   <li>Tras la configuración, el <code>traceId</code> en el nuevo hilo será el mismo que en el origen.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * @Bean
 * public TaskExecutor taskExecutor() {
 *     ThreadPoolTaskExecutor exec = new ThreadPoolTaskExecutor();
 *     exec.setTaskDecorator(new ContextPropagatingTaskDecorator());
 *     return exec;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Registra un <code>TaskDecorator</code> en el <code>TaskExecutor</code> para copiar el <code>ContextSnapshot</code> al hilo nuevo.</li>
 *   <li>Verifica con <code>tracer.currentSpan().context().traceId()</code> que el ID coincide.</li>
 * </ul>
 */
@Service
public class TraceAsyncEnunciado {

    /**
     * Tarea asíncrona que debería mantener el mismo TraceID que el hilo que la invoca.
     */
    @Async
    public void tareaAsincrona() {
        // TODO: Verifica que el TraceID en este hilo sea el mismo
        // que el del hilo que llamó a este método.
    }
}
