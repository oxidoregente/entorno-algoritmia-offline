package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Agregación de Datos (API Composition).
 * <b>Dificultad: Media</b>
 *
 * <p>En arquitecturas de microservicios es habitual que la información que necesita el
 * cliente esté repartida entre varios servicios (usuario, pedidos, puntos, preferencias…).
 * El patrón <em>API Composition</em> introduce un orquestador que consulta esas fuentes
 * en paralelo y unifica la respuesta, simplificando el contrato externo y evitando que
 * el cliente haga N llamadas.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Un componente (el "compositor") se responsabiliza de llamar a los servicios internos y fusionar los datos.</li>
 *   <li>Las llamadas deben hacerse en paralelo (p. ej. con <code>CompletableFuture</code>, <code>Mono.zip</code> o <code>Flux.merge</code>) para minimizar latencia.</li>
 *   <li>El resultado es un agregado o DTO que el cliente consume con una única llamada.</li>
 *   <li>Hay que tratar los fallos parciales: ¿se devuelve el agregado incompleto, se hace fallback, o se propaga el error?</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Mono&lt;Usuario&gt; u = usuarioService.find(id);
 * Mono&lt;List&lt;Pedido&gt;&gt; p = pedidoService.listByUser(id);
 * Mono&lt;Integer&gt; pts = puntosService.getByUser(id);
 *
 * return Mono.zip(u, p, pts)
 *         .map(t -&gt; new PerfilCompleto(t.getT1(), t.getT2(), t.getT3()));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para llamadas paralelas, evita <code>servicio1().then(servicio2())</code> en serie; usa <code>Mono.zip</code> o <code>CompletableFuture.allOf</code>.</li>
 *   <li>El tipo de retorno puede ser un DTO inmutable o un <code>Map</code> con los datos agregados.</li>
 *   <li>Si un servicio no es crítico, encapsúlalo en <code>onErrorResume</code> para no romper el resto del agregado.</li>
 * </ul>
 */
public class ApiCompositionEnunciado {

    /**
     * Construye un perfil completo a partir de la información repartida
     * entre los servicios de usuario, pedidos y puntos.
     *
     * @param userId identificador del usuario del que se compone el perfil.
     * @return agregado (DTO o estructura equivalente) con los datos combinados,
     *         o {@code null} si aún no se ha implementado.
     */
    public Object obtenerPerfilCompleto(String userId) {
        // TODO: Simula llamadas paralelas a:
        // 1. Servicio de Usuario, 2. Servicio de Pedidos, 3. Servicio de Puntos.
        // Combina los resultados en un solo objeto.
        return null;
    }
}
