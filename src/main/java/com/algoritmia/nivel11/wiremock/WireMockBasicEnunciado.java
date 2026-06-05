package com.algoritmia.nivel11.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Stubbing Básico con WireMock.
 * <b>Dificultad: Media</b>
 *
 * <p>WireMock permite simular servidores HTTP externos (APIs de terceros, microservicios
 * no disponibles en el entorno de tests, pasarelas de pago, etc.). En esta práctica
 * aprenderás a interceptar una ruta concreta y devolver una respuesta fija controlada,
 * evitando depender de sistemas reales durante las pruebas.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>WireMock expone una API fluida estática (DSL) basada en <code>WireMock.stubFor(...)</code>.</li>
 *   <li>Un stub asocia un <code>RequestPattern</code> (método + URL + matchers) con una <code>ResponseDefinition</code>.</li>
 *   <li>Para respuestas simples basta con <code>aResponse().withStatus(...).withBody(...)</code>.</li>
 *   <li>El stub debe declararse en el setup del test o antes de invocar al cliente HTTP bajo prueba.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stubFor(get(urlEqualTo("/api/test"))
 *         .willReturn(aResponse()
 *                 .withStatus(200)
 *                 .withHeader("Content-Type", "text/plain")
 *                 .withBody("Hola desde WireMock")));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Importa los métodos estáticos con <code>import static com.github.tomakehurst.wiremock.client.WireMock.*;</code>.</li>
 *   <li>Usa <code>get(urlEqualTo("/api/test"))</code> para matcher exacto de ruta y método.</li>
 *   <li>El cuerpo se pasa con <code>withBody(String)</code> y el código con <code>withStatus(int)</code>.</li>
 * </ul>
 */
public class WireMockBasicEnunciado {

    /**
     * Configura el stub que intercepta un GET a "/api/test" y devuelve
     * un status 200 con cuerpo "Hola desde WireMock".
     */
    public void configurarStub() {
        // TODO: Configura un stub que intercepte un GET a "/api/test"
        // y retorne un status 200 con el cuerpo "Hola desde WireMock".
    }
}
