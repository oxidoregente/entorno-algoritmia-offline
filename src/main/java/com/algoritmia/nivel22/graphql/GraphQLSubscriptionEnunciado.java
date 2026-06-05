package com.algoritmia.nivel22.graphql;

import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import reactor.core.publisher.Flux;
import org.springframework.stereotype.Controller;
import java.time.Duration;

/**
 * 🎓 RETO: Suscripciones en GraphQL.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Las suscripciones son el equivalente "push" de GraphQL: el servidor envía
 * datos al cliente en tiempo real (chat, cotizaciones de bolsa, alertas de
 * monitorización). Se apoyan en WebSockets y retornan tipos reactivos
 * (<code>Flux</code> / <code>Publisher</code>).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>@SubscriptionMapping</code> en lugar de <code>@QueryMapping</code>.</li>
 *   <li>El método debe retornar <code>Flux&lt;T&gt;</code> (Project Reactor).</li>
 *   <li>Para pruebas se suele usar <code>Flux.interval(...)</code> que emite cada cierto tiempo.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Suscripción GraphQL
 * subscription { notificacionesTiempoReal }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Retorna <code>Flux.interval(Duration.ofSeconds(1)).map(t -&gt; "Mensaje " + t)</code>.</li>
 *   <li>No olvides importar <code>reactor.core.publisher.Flux</code>.</li>
 * </ul>
 */
@Controller
public class GraphQLSubscriptionEnunciado {

    /**
     * Stream reactivo que emite mensajes cada segundo simulando notificaciones en vivo.
     *
     * @return Flux de Strings con las notificaciones que serán enviadas al cliente suscrito.
     */
    @SubscriptionMapping
    public Flux<String> notificacionesTiempoReal() {
        // TODO: Retorna un Flux que emita un mensaje cada segundo
        // usando Flux.interval().
        return null;
    }
}
