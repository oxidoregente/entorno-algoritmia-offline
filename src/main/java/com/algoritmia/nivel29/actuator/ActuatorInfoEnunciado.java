package com.algoritmia.nivel29.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Contribuidor de Información Personalizado.
 * <b>Dificultad: Fácil</b>
 *
 * <p>El endpoint {@code /actuator/info} permite mostrar metadata útil
 * de la aplicación: versión, autor, commit de Git, fecha de build,
 * entorno, etc. Mientras que las propiedades estáticas pueden leerse
 * desde {@code application.properties} o el plugin
 * {@code git-commit-id-plugin}, las dinámicas se aportan con un
 * {@link InfoContributor}, que se ejecuta cada vez que se consulta
 * el endpoint.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementar la interfaz {@link InfoContributor} y registrar como bean Spring
 *       (típicamente con {@code @Component}).</li>
 *   <li>Usar el {@link Info.Builder} recibido por parámetro para añadir cada detalle
 *       con {@code .withDetail(clave, valor)}.</li>
 *   <li>Actuator fusiona todos los contribuidores en una única respuesta JSON.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class ActuatorInfoEnunciado implements InfoContributor {
 *     &#64;Override
 *     public void contribute(Info.Builder builder) {
 *         builder.withDetail("autor", "Ana López")
 *                 .withDetail("entorno", "desarrollo")
 *                 .withDetail("build", "2024-05-12T08:00:00Z");
 *     }
 * }
 * // GET /actuator/info =&gt; { "autor": "Ana López", "entorno": "desarrollo", ... }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Llama encadenadamente a {@code builder.withDetail(...)} para añadir varios
 *       pares clave-valor en una sola línea.</li>
 *   <li>Recuerda habilitar la exposición: {@code management.endpoints.web.exposure.include=info}.</li>
 * </ul>
 */
@Component
public class ActuatorInfoEnunciado implements InfoContributor {

    /**
     * Añade información personalizada al endpoint {@code /actuator/info}.
     *
     * @param builder constructor de información de Actuator donde se acumulan los detalles
     */
    @Override
    public void contribute(Info.Builder builder) {
        // TODO: Añade un detalle llamado "autor" con tu nombre.
    }
}
