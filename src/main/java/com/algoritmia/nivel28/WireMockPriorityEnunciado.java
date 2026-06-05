package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Prioridad de Stubs.
 * <b>Dificultad: Media</b>
 *
 * <p>Cuando varios stubs de WireMock pueden coincidir con la misma petición (p. ej. un
 * matcher genérico y otro específico), WireMock necesita una forma de desambiguar.
 * La propiedad <em>priority</em> permite ordenar las reglas: cuanto menor es el valor,
 * mayor es la prioridad. Esto es clave para tener defaults razonables y casos
 * excepcionales que los sobreescriban.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>La prioridad se asigna con <code>.atPriority(int)</code>; por defecto es 5.</li>
 *   <li>Valores menores = mayor prioridad (se evalúan antes).</li>
 *   <li>Se aplica con <code>.atPriority(1)</code> sobre el builder de <code>stubFor</code>.</li>
 *   <li>Sirve para combinar matchers regex (genéricos) con paths exactos (específicos).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * // Stub genérico (baja prioridad, valor alto)
 * stubFor(get(urlMatching("/api/.*"))
 *         .atPriority(10)
 *         .willReturn(aResponse().withStatus(200).withBody("ok")));
 *
 * // Stub específico (alta prioridad, valor bajo)
 * stubFor(get(urlEqualTo("/api/urgente"))
 *         .atPriority(1)
 *         .willReturn(aResponse().withStatus(200).withBody("urgente")));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Recuerda: <b>menor número = mayor prioridad</b> en WireMock.</li>
 *   <li>Usa <code>urlMatching("/api/.*")</code> para el genérico y <code>urlEqualTo("/api/urgente")</code> para el específico.</li>
 *   <li>Si omites <code>atPriority</code>, se aplica la prioridad por defecto (5).</li>
 * </ul>
 */
public class WireMockPriorityEnunciado {

    /**
     * Configura dos stubs para la misma jerarquía de rutas, dejando que
     * el más específico (mayor prioridad) gane sobre el genérico.
     */
    public void configurarPrioridades() {
        // TODO: Configura un stub genérico para "/api/.*" con prioridad baja (10).
        // TODO: Configura un stub específico para "/api/urgente" con prioridad alta (1).
    }
}
