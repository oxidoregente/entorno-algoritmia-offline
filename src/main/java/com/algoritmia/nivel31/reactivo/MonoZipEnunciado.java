package com.algoritmia.nivel31.reactivo;

import reactor.core.publisher.Mono;

/**
 * 🎓 RETO: Combinación de Monos (Mono.zip).
 * <b>Dificultad: Media</b>
 *
 * <p>Un <code>Mono&lt;T&gt;</code> representa un valor asíncrono (0..1). A menudo
 * necesitamos esperar a que varias tareas reactivas finalicen y combinar sus
 * resultados (por ejemplo, datos de perfil y datos de auditoría antes de renderizar
 * una vista). <code>Mono.zip</code> lo consigue de forma declarativa y no bloqueante,
 * suscribiéndose a todos a la vez y emitiendo cuando todos completan.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><code>Mono.zip(m1, m2)</code> espera a que ambos Monos emitan un valor.</li>
 *   <li>Si alguno emite vacío o error, el Mono resultante también lo hará.</li>
 *   <li>El combinador recibe un <code>BiFunction</code> (o <code>Function&lt;Tuple2&lt;A,B&gt;, R&gt;</code>) para fusionar los resultados.</li>
 *   <li>Existen variantes para 3+ Monos: <code>Mono.zip(m1, m2, m3)</code>, <code>Mono.zipDelayError</code>, etc.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Mono&lt;String&gt; usuario = usuarioService.buscar(id);
 * Mono&lt;String&gt; auditoria = auditoriaService.ultimo(id);
 *
 * return Mono.zip(usuario, auditoria)
 *         .map(tuple -&gt; tuple.getT1() + " | " + tuple.getT2());
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>Mono.zip(m1, m2)</code> y luego <code>.map(tuple -&gt; ...)</code> para combinar.</li>
 *   <li>Para concatenar dos Strings: <code>tuple.getT1() + tuple.getT2()</code> o <code>String.join("", ...)</code>.</li>
 *   <li>Si necesitas tratar errores, sustituye por <code>Mono.zipDelayError</code> para esperar a todos.</li>
 * </ul>
 */
public class MonoZipEnunciado {

    /**
     * Combina dos fuentes reactivas esperando a que ambas emitan
     * y devuelve la concatenación de sus resultados.
     *
     * @param m1 primer {@link Mono} a esperar.
     * @param m2 segundo {@link Mono} a esperar.
     * @return un nuevo {@link Mono} que emite la concatenación de los valores.
     */
    public Mono<String> combinarResultados(Mono<String> m1, Mono<String> m2) {
        // TODO: Usa Mono.zip para esperar ambos y retornar la concatenación.
        return null;
    }
}
