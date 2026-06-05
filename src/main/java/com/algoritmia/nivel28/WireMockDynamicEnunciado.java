package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Stubbing Dinámico (Response Templating).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Muchas APIs reales devuelven datos derivados de la petición (echo del ID, cálculo
 * de totales, propagación de headers, etc.). El <em>Response Templating</em> de WireMock,
 * basado en Handlebars, permite construir la respuesta en función de los datos
 * recibidos, simulando este comportamiento de forma determinista en los tests.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Hay que habilitar el transformer <code>"response-template"</code> en la respuesta.</li>
 *   <li>Las plantillas Handlebars acceden a <code>{{request.path}}</code>, <code>{{jsonPath request.body '$.id'}}</code>, etc.</li>
 *   <li>El body y los headers de la respuesta admiten expresiones <code>{{...}}</code>.</li>
 *   <li>Es necesario añadir la dependencia <code>handlebars.java</code> en el classpath para que funcione.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stubFor(post(urlEqualTo("/api/echo"))
 *         .willReturn(aResponse()
 *                 .withStatus(200)
 *                 .withHeader("Content-Type", "application/json")
 *                 .withTransformers("response-template")
 *                 .withBody("{\"id\":\"{{jsonPath request.body '$.id'}}\"}")));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Activa el transformer con <code>.withTransformers("response-template")</code>.</li>
 *   <li>Para leer del body JSON usa el helper <code>{{jsonPath request.body '$.campo'}}</code>.</li>
 *   <li>Si la dependencia no está, el placeholder se devuelve literal; revisa el pom.xml si ocurre.</li>
 * </ul>
 */
public class WireMockDynamicEnunciado {

    /**
     * Configura un stub que extrae un valor del JSON de la petición
     * y lo refleja en la respuesta usando plantillas Handlebars.
     */
    public void configurarStubDinamico() {
        // TODO: Configura un stub que use Handlebars para extraer
        // un valor del JSON de la petición y ponerlo en la respuesta.
    }
}
