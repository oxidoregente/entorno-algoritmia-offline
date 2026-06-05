package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Simulación de Errores y Retrasos.
 * <b>Dificultad: Media</b>
 *
 * <p>Una aplicación robusta debe tolerar respuestas lentas o fallidas de las APIs
 * externas (timeouts, 5xx, conexiones caídas). WireMock permite simular estos
 * escenarios de forma controlada para validar la lógica de reintentos, circuit
 * breakers, fallbacks y mensajes al usuario que implementa nuestro servicio.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Los retrasos se configuran con <code>withFixedDelay(millis)</code> en la respuesta.</li>
 *   <li>Los errores HTTP se simulan devolviendo códigos 4xx/5xx desde el stub.</li>
 *   <li>También puede forzarse una respuesta vacía, un fallo de conexión (<code>aResponse().withFault(...)</code>), etc.</li>
 *   <li>Estos stubs deben ser deterministas en duración para no alargar la suite de tests.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * // Latencia
 * stubFor(get(urlEqualTo("/api/lento"))
 *         .willReturn(aResponse().withStatus(200).withFixedDelay(5000)));
 *
 * // Error 500
 * stubFor(get(urlEqualTo("/api/caida"))
 *         .willReturn(aResponse().withStatus(500).withBody("Internal Server Error")));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para 5 segundos usa <code>.withFixedDelay(5000)</code> (el valor es en milisegundos).</li>
 *   <li>Para el 500, basta con <code>.withStatus(500)</code>; opcionalmente añade un body explicativo.</li>
 *   <li>Combínalo con aserciones que verifiquen reintentos, timeouts o fallback del cliente.</li>
 * </ul>
 */
public class WireMockFaultEnunciado {

    /**
     * Configura un stub que retrasa la respuesta 5 segundos para
     * probar timeouts y reintentos del cliente.
     */
    public void simularLentitud() {
        // TODO: Configura un stub que tarde 5 segundos en responder.
        // Pista: Usa .withFixedDelay(5000)
    }

    /**
     * Configura un stub que devuelve HTTP 500 para validar la
     * reacción del cliente ante errores del servidor.
     */
    public void simularErrorServidor() {
        // TODO: Configura un stub que retorne un status 500.
    }
}
