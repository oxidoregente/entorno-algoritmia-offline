package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

/**
 * 🎓 RETO: Personalización de Metadatos en Swagger.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Personaliza la información visible en la cabecera de Swagger UI. Debes
 * incluir un título, una versión y una descripción descriptiva del proyecto
 * para que cualquier desarrollador que abra la documentación sepa
 * inmediatamente qué API está consultando.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Crea un objeto {@link Info} con los metadatos: título, versión y
 *       descripción.</li>
 *   <li>Asigna ese {@link Info} a una nueva instancia de {@link OpenAPI}
 *       mediante {@code .info(...)}.</li>
 *   <li>El método productor debe estar anotado con {@link Bean} para que
 *       Springdoc lo detecte y reemplace al bean por defecto.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Bean
 * public OpenAPI apiInfo() {
 *     return new OpenAPI().info(new Info()
 *         .title("Algoritmia API")
 *         .version("v1.0")
 *         .description("Laboratorio de Ingeniería"));
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El título y la versión son obligatorios; la descripción es opcional
 *       pero muy recomendable.</li>
 *   <li>Puedes añadir más campos: {@code .termsOfService(...)},
 *       {@code .contact(...)} y {@code .license(...)}.</li>
 *   <li>El bean que devuelve este método es el que Swagger UI usará para
 *       rellenar la cabecera del documento OpenAPI.</li>
 * </ul>
 */
public class SwaggerInfoEnunciado {

    /**
     * Construye la instancia de {@link OpenAPI} con los metadatos básicos de la API.
     *
     * @return instancia de {@link OpenAPI} con título, versión y descripción configurados.
     */
    @Bean
    public OpenAPI apiInfo() {
        // TODO: Crea un objeto Info con título "Algoritmia API", versión "v1.0"
        // y descripción "Laboratorio de Ingeniería".
        // Luego asígnalo a una nueva instancia de OpenAPI.
        return null;
    }
}
