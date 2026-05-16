package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Flux;
import java.time.Duration;

/**
 * 🎓 RETO: Manejo de Errores Reactivos.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>En el mundo reactivo, los errores fluyen por el canal de error. 
 * Aprende a capturarlos y proveer una alternativa (fallback).</p>
 */
public class ReactiveErrorEnunciado {

    public Flux<String> manejarError(Flux<String> flujo) {
        // TODO: Si el flujo falla, retorna un mensaje por defecto "Error recuperado" 
        // usando .onErrorReturn() o .onErrorResume().
        return null;
    }
}
