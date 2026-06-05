package com.algoritmia.nivel19.reactivo;

import reactor.core.publisher.Flux;

/**
 * 🎓 RETO: Contrapresión (Backpressure).
 * <b>Dificultad: Difícil</b>
 *
 * <p>En sistemas reactivos el productor puede ser más rápido que el consumidor (p. ej.
 * una API que emite miles de eventos por segundo contra un consumidor que escribe en
 * una base de datos). La <em>backpressure</em> (contrapresión) es el mecanismo por el
 * cual el suscriptor le indica al publicador cuántos elementos está dispuesto a recibir,
 * regulando así el ritmo de procesamiento y evitando el desbordamiento de memoria.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El suscriptor controla el flujo mediante <code>subscription.request(n)</code>.</li>
 *   <li>Project Reactor aplica backpressure de forma automática cuando se usa un <code>BaseSubscriber</code>.</li>
 *   <li>El operador <code>limitRate(n)</code> solicita en bloques de N elementos a medida que el consumidor va procesando.</li>
 *   <li>Otra opción es <code>onBackpressureBuffer</code> o <code>onBackpressureDrop</code> según la estrategia deseada.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * flujoRapido
 *     .limitRate(10)
 *     .subscribe(System.out::println);
 *
 * // Equivalente manual con BaseSubscriber:
 * flujoRapido.subscribe(new BaseSubscriber&lt;Integer&gt;() {
 *     &#64;Override
 *     protected void hookOnSubscribe(Subscription s) { s.request(10); }
 *
 *     &#64;Override
 *     protected void hookOnNext(Integer item) {
 *         System.out.println(item);
 *         request(10);
 *     }
 * });
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El atajo más directo: <code>flujoRapido.limitRate(10).subscribe(...)</code>.</li>
 *   <li>Si quieres control fino, extiende <code>BaseSubscriber</code> y llama a <code>request(10)</code> en cada <code>hookOnNext</code>.</li>
 *   <li>Si no quieres perder elementos pero tampoco puedes procesarlos, considera <code>onBackpressureBuffer</code>.</li>
 * </ul>
 */
public class ReactiveBackpressureEnunciado {

    /**
     * Gestiona la contrapresión de un flujo rápido, procesando
     * los elementos en bloques de 10 para no saturar al consumidor.
     *
     * @param flujoRapido flujo reactivo que emite elementos a alta velocidad.
     */
    public void manejarBackpressure(Flux<Integer> flujoRapido) {
        // TODO: Suscríbete al flujo limitando la demanda (request)
        // para procesar de 10 en 10.
    }
}
