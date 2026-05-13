package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;

/**
 * 🏆 SOLUCIÓN: Trazado Manual de Operaciones.
 */
public class TrazadorPersonalizadoSolucion {

    private final Tracer tracer;

    public TrazadorPersonalizadoSolucion(Tracer tracer) {
        this.tracer = tracer;
    }

    public void ejecutarOperacionTrazada() {
        Span nuevoSpan = this.tracer.nextSpan().name("mi-operacion-especial");
        try (Tracer.SpanInScope ws = this.tracer.withSpan(nuevoSpan.start())) {
            nuevoSpan.tag("tipo", "auditoria");
            System.out.println("Ejecutando lógica dentro de un Span personalizado...");
        } finally {
            nuevoSpan.end();
        }
    }
}
