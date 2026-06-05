package com.algoritmia.nivel19.reactivo;

import reactor.core.publisher.Flux;

/**
 * 🎓 RETO: Transformación de Flux.
 * <b>Dificultad: Media</b>
 *
 * <p>En programación reactiva, un <code>Flux&lt;T&gt;</code> representa un flujo de 0..N
 * elementos asíncronos. Las transformaciones se encadenan con operadores funcionales
 * (<code>map</code>, <code>filter</code>, <code>flatMap</code>, <code>distinct</code>…)
 * que se aplican sin bloquear el hilo, ideales para procesar streams de eventos,
 * resultados paginados o mensajes de Kafka.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><code>map</code>: transforma 1 a 1 cada elemento emitido.</li>
 *   <li><code>filter</code>: descarta los elementos que no cumplen un predicado.</li>
 *   <li><code>distinct</code>: elimina duplicados consecutivos (o globales, según la variante).</li>
 *   <li>Los operadores se evalúan de forma perezosa: nada ocurre hasta que alguien se suscribe al Flux.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Flux&lt;String&gt; flujo = Flux.just("Ana", "Alberto", "bea", "Ana");
 *
 * flujo.filter(n -&gt; n.startsWith("A"))
 *      .map(String::toUpperCase)
 *      .distinct()
 *      .subscribe(System.out::println);
 * // Salida: ANA, ALBERTO
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encadena los operadores en el orden lógico: primero <code>filter</code>, luego <code>map</code> y por último <code>distinct</code>.</li>
 *   <li>Para comprobaciones <em>case-insensitive</em> considera convertir a mayúsculas también antes del <code>filter</code>.</li>
 *   <li>Recuerda: nada se ejecuta hasta que un <code>subscribe(...)</code> se materializa.</li>
 * </ul>
 */
public class FluxTransformEnunciado {

    /**
     * Procesa un flujo de nombres: conserva los que empiezan por "A",
     * los pasa a mayúsculas y elimina duplicados.
     *
     * @param nombres flujo reactivo de nombres en su forma original.
     * @return un nuevo {@link Flux} con los nombres transformados.
     */
    public Flux<String> procesarNombres(Flux<String> nombres) {
        // TODO: Filtra los nombres que empiecen por "A",
        // conviértelos a mayúsculas y quita duplicados.
        return null;
    }
}
