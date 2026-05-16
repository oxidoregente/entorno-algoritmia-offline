package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Uso de Baggage y Tags.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Los 'Tags' añaden metadatos a un Span actual. El 'Baggage' permite 
 * propagar información a través de toda la traza distribuida (entre microservicios).</p>
 */
@Service
public class BagTagEnunciado {

    private final Tracer tracer;

    public BagTagEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    public void añadirContexto(String userId) {
        // TODO: Añade un Tag llamado "user.id" al span actual.
        // TODO: Añade un Baggage llamado "tenant" con valor "default".
    }
}
