package com.algoritmia.nivel22.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Creación de Spans Personalizados.
 * <b>Dificultad: Media</b>
 *
 * <p>Una traza (Trace) está formada por múltiples Spans. Spring Boot crea
 * automáticamente spans para peticiones HTTP, llamadas a la base de datos,
 * etc. Pero a veces necesitas medir lógica de negocio específica (un cálculo
 * costoso, una llamada a un servicio externo vía SDK). Para ello creas un
 * Span manual y lo cierras en un bloque <code>finally</code>.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>tracer.nextSpan().name("...").start()</code> para crear e iniciar un span.</li>
 *   <li>Envuélvelo con <code>try (Tracer.SpanInScope scope = tracer.withSpan(span)) { ... }</code> para que sea el actual.</li>
 *   <li>Cierra siempre el span con <code>span.end()</code> en un <code>finally</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Span span = tracer.nextSpan().name("calculo-complejo").start();
 * try (Tracer.SpanInScope scope = tracer.withSpan(span)) {
 *     // lógica de negocio
 * } finally {
 *     span.end();
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encadena llamadas: <code>tracer.nextSpan().name("calculo-complejo").start()</code>.</li>
 *   <li>Usa try-with-resources con <code>Tracer.SpanInScope</code> para no olvidar cerrar el scope.</li>
 * </ul>
 */
@Service
public class SpanCustomEnunciado {

    private final Tracer tracer;

    public SpanCustomEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    /**
     * Ejecuta un proceso interno envuelto en un Span personalizado para poder
     * medir su duración en Zipkin.
     */
    public void procesoInterno() {
        // TODO: Crea un nuevo span llamado "calculo-complejo", inícialo,
        // haz que sea el actual, y asegúrate de terminarlo en un bloque finally.
    }
}
