package com.algoritmia.nivel22.graphql;

import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import reactor.core.publisher.Flux;
import org.springframework.stereotype.Controller;
import java.time.Duration;

/**
 * 🎓 RETO: Suscripciones en GraphQL.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>A diferencia de Query y Mutation, Subscription permite enviar datos 
 * en tiempo real al cliente usando WebSockets.</p>
 */
@Controller
public class GraphQLSubscriptionEnunciado {

    @SubscriptionMapping
    public Flux<String> notificacionesTiempoReal() {
        // TODO: Retorna un Flux que emita un mensaje cada segundo 
        // usando Flux.interval().
        return null;
    }
}
