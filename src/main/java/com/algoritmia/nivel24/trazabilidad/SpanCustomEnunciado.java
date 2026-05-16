package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Creación de Spans Personalizados.
 * <b>Dificultad: Media</b>
 * 
 * <p>Un Span representa una unidad de trabajo. Aprende a crear spans 
 * manuales para medir partes específicas de tu código dentro de una traza.</p>
 */
@Service
public class SpanCustomEnunciado {

    private final Tracer tracer;

    public SpanCustomEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    public void procesoInterno() {
        // TODO: Crea un nuevo span llamado "calculo-complejo", inícialo, 
        // haz que sea el actual, y asegúrate de terminarlo en un bloque finally.
    }
}
