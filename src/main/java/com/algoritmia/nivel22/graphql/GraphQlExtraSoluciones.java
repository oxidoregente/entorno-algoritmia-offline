package com.algoritmia.nivel22.graphql;

import reactor.core.publisher.Flux;
import java.time.Duration;

/**
 * 🏆 SOLUCIONES: GraphQL Subscriptions.
 */
public class GraphQlExtraSoluciones {
    public Flux<String> notificacionesTiempoReal() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> "Notificación #" + i);
    }
}
