package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 🏆 SOLUCIONES: Micrometer Tracing.
 */
public class TraceExtraSoluciones {

    public void procesoInterno(Tracer tracer) {
        Span span = tracer.nextSpan().name("calculo-complejo").start();
        try (Tracer.SpanInScope ws = tracer.withSpan(span)) {
            // Lógica
        } finally {
            span.end();
        }
    }

    public void añadirContexto(Tracer tracer, String userId) {
        tracer.currentSpan().tag("user.id", userId);
        tracer.createBaggage("tenant").set("default");
    }

    public void filterTrace(Tracer tracer, HttpServletResponse response) {
        String traceId = tracer.currentSpan().context().traceId();
        response.addHeader("X-Trace-Id", traceId);
    }
}
