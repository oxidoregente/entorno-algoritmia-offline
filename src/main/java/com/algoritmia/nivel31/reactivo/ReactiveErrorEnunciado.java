package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Flux;
import java.time.Duration;

/**
 * 🎓 RETO: Manejo de Errores Reactivos.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En el paradigma reactivo, los errores son eventos de primera clase que viajan por
 * un canal paralelo al de los datos. Cuando un <code>Flux</code> o <code>Mono</code>
 * falla, el operador aguas abajo recibe la señal <code>onError</code> y el flujo se
 * completa. Para evitar que un fallo puntual tumbe toda la cadena, Reactor ofrece
 * operadores de recuperación como <code>onErrorReturn</code>, <code>onErrorResume</code>
 * o <code>onErrorMap</code>, que permiten devolver un valor por defecto, un flujo
 * alternativo o transformar el error.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><code>onErrorReturn(valor)</code>: emite un valor fijo si se produce un error.</li>
 *   <li><code>onErrorResume(fallback)</code>: se suscribe a otro Flux/Mono de respaldo.</li>
 *   <li><code>onErrorMap(f)</code>: transforma el error (p. ej. para envolverlo en una excepción de negocio).</li>
 *   <li>El control de errores debe situarse en el punto donde sabemos cómo recuperarnos; no capturar todo genéricamente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Flux&lt;String&gt; flujo = servicio.buscar()
 *     .onErrorReturn("Error recuperado");
 *
 * // O con fallback dinámico:
 * flujo.onErrorResume(err -&gt; Mono.just("Fallback: " + err.getMessage()));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para un valor estático: <code>flujo.onErrorReturn("Error recuperado")</code>.</li>
 *   <li>Para un fallback reactivo: <code>flujo.onErrorResume(e -&gt; Mono.just(...))</code>.</li>
 *   <li>Si solo te interesan ciertos tipos de error, filtra: <code>onErrorReturn(IllegalStateException.class, "x")</code>.</li>
 * </ul>
 */
public class ReactiveErrorEnunciado {

    /**
     * Captura los errores del flujo y devuelve un valor por defecto
     * ("Error recuperado") para que la cadena continúe.
     *
     * @param flujo flujo reactivo del que pueden propagarse errores.
     * @return un nuevo {@link Flux} con la recuperación aplicada.
     */
    public Flux<String> manejarError(Flux<String> flujo) {
        // TODO: Si el flujo falla, retorna un mensaje por defecto "Error recuperado"
        // usando .onErrorReturn() o .onErrorResume().
        return null;
    }
}
