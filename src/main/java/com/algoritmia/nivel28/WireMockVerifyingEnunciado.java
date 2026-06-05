package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Verificación de Peticiones.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Configurar stubs permite simular respuestas, pero también necesitamos asegurar que
 * nuestra aplicación interactúa correctamente con la API externa: que llama al endpoint
 * adecuado, con el método HTTP correcto, las cabeceras precisas y el payload esperado.
 * WireMock permite aserciones en forma de <em>verificaciones</em> que se ejecutan tras
 * la acción bajo prueba.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Las verificaciones se construyen con <code>postRequestedFor(urlEqualTo(...))</code> y se aplican con <code>verify(...)</code>.</li>
 *   <li>Se valida el número exacto de invocaciones (<code>requestedForMatching(...).times(n)</code>).</li>
 *   <li>Las cabeceras se inspeccionan con <code>matchingHeader("X", "valor")</code> o <code>equalTo</code>.</li>
 *   <li>También es posible verificar el body con <code>matchingJsonPath("$.campo", equalTo("x"))</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * verify(postRequestedFor(urlEqualTo("/api/usuarios"))
 *         .withHeader("Content-Type", equalTo("application/json")));
 * verify(1, postRequestedFor(urlEqualTo("/api/usuarios")));
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Combina <code>verify(count, postRequestedFor(...))</code> con matchers de cabecera.</li>
 *   <li>Para "exactamente 1" usa <code>verify(1, postRequestedFor(urlEqualTo("/api/usuarios")))</code>.</li>
 *   <li>Para validar la cabecera: <code>.withHeader("Content-Type", equalTo("application/json"))</code>.</li>
 * </ul>
 */
public class WireMockVerifyingEnunciado {

    /**
     * Verifica que se haya realizado exactamente una petición POST
     * a "/api/usuarios" con la cabecera Content-Type: application/json.
     */
    public void verificarLlamada() {
        // TODO: Verifica que se haya realizado exactamente 1 petición POST
        // a "/api/usuarios" con una cabecera "Content-Type" igual a "application/json".
    }
}
