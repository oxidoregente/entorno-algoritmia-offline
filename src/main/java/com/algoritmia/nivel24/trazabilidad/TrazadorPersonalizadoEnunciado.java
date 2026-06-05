package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Trazado Manual de Operaciones.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Spring Boot instrumenta automáticamente HTTP, JDBC, RestTemplate, etc.
 * Sin embargo, hay lógica de negocio interna (procesos batch, algoritmos
 * costosos, llamadas a SDKs externos) que no se traza por defecto. El Tracer
 * de Micrometer permite crear Spans personalizados que aparecerán en Zipkin
 * con su jerarquía, duración y metadatos (tags).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>tracer.nextSpan().name("...").start()</code> para crear un span.</li>
 *   <li>Enriquece con <code>span.tag("clave", "valor")</code> antes o durante la operación.</li>
 *   <li>Cierra con <code>span.end()</code> en un bloque <code>finally</code> para no perder mediciones.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Span span = tracer.nextSpan().name("mi-operacion-especial").start();
 * try (Tracer.SpanInScope scope = tracer.withSpan(span)) {
 *     span.tag("tipo", "auditoria");
 *     // lógica a medir
 * } finally {
 *     span.end();
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encadena <code>tracer.nextSpan().name("mi-operacion-especial").start()</code> en una sola línea.</li>
 *   <li>Para los tags usa el orden: crear -&gt; tag -&gt; iniciar, o crear+iniciar -&gt; tag (ambos son válidos).</li>
 * </ul>
 */
@Service
public class TrazadorPersonalizadoEnunciado {

    private final Tracer tracer;

    public TrazadorPersonalizadoEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    /**
     * Ejecuta una operación simulada instrumentada con un Span propio que
     * aparecerá en Zipkin con su nombre y tags personalizados.
     */
    public void ejecutarOperacionTrazada() {
        // TODO: Crea un nuevo Span llamado "mi-operacion-especial"
        // TODO: Añade un tag "tipo" con valor "auditoria"
        // TODO: Inicia el span, realiza un log simulado y finaliza el span.
    }
}
