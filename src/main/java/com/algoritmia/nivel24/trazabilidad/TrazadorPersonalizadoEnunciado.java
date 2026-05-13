package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Trazado Manual de Operaciones.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Aprende a usar el Tracer de Micrometer para crear Spans personalizados
 * que se verán reflejados en Zipkin.</p>
 */
@Service
public class TrazadorPersonalizadoEnunciado {

    private final Tracer tracer;

    public TrazadorPersonalizadoEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    public void ejecutarOperacionTrazada() {
        // TODO: Crea un nuevo Span llamado "mi-operacion-especial"
        // TODO: Añade un tag "tipo" con valor "auditoria"
        // TODO: Inicia el span, realiza un log simulado y finaliza el span.
    }
}
