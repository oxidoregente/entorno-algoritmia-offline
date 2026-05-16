package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Flux;

/**
 * 🎓 RETO: Contrapresión (Backpressure).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>La contrapresión es la capacidad de un suscriptor de decirle al 
 * publicador que baje el ritmo de envío de datos porque no puede 
 * procesarlos tan rápido.</p>
 */
public class ReactiveBackpressureEnunciado {

    public void manejarBackpressure(Flux<Integer> flujoRapido) {
        // TODO: Suscríbete al flujo limitando la demanda (request) 
        // para procesar de 10 en 10.
    }
}
