package com.algoritmia.nivel22.trazabilidad;

import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Uso de Baggage y Tags.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En un sistema distribuido, los <b>Tags</b> añaden metadatos clave-valor
 * a un Span (ej: <code>user.id=42</code>) visibles en Zipkin. El <b>Baggage</b>
 * va más allá: se serializa en cabeceras HTTP y se propaga automáticamente a
 * otros microservicios para mantener contexto de negocio (ej: <code>tenant=acme</code>)
 * a lo largo de toda la traza.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>tracer.currentSpan().tag("clave", "valor")</code> para Tags.</li>
 *   <li>Usa <code>tracer.createBaggage("clave", "valor")</code> o <code>BaggageManager</code> para Baggage.</li>
 *   <li>El Baggage debe estar configurado en <code>application.yml</code> (<code>management.tracing.baggage</code>) para propagarse.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Span span = tracer.currentSpan();
 * span.tag("user.id", userId);
 * tracer.createBaggage("tenant", "default");
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para añadir el tag, primero obtén el span con <code>tracer.currentSpan()</code>.</li>
 *   <li>Para el baggage puedes usar <code>BaggageInScope</code> o configurar un campo de propagación en <code>application.yml</code>.</li>
 * </ul>
 */
@Service
public class BagTagEnunciado {

    private final Tracer tracer;

    public BagTagEnunciado(Tracer tracer) {
        this.tracer = tracer;
    }

    /**
     * Enriquece el span activo con el identificador del usuario y crea un baggage
     * de tenant que viajará a través de toda la traza distribuida.
     *
     * @param userId Identificador del usuario que realiza la operación.
     */
    public void añadirContexto(String userId) {
        // TODO: Añade un Tag llamado "user.id" al span actual.
        // TODO: Añade un Baggage llamado "tenant" con valor "default".
    }
}
