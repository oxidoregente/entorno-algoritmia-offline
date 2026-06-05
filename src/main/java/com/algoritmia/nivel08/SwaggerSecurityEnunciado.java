package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

/**
 * 🎓 RETO: Seguridad JWT en Swagger (OpenAPI).
 * <b>Dificultad: Media</b>
 *
 * <p>Configura Swagger para que soporte autenticación por Token JWT (Bearer).
 * Los usuarios deben poder introducir su token directamente en la interfaz
 * de Swagger UI (botón <i>Authorize</i>) y este se enviará automáticamente
 * en la cabecera {@code Authorization} de cada petición.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Un {@link SecurityScheme} define <i>cómo</i> se envía el token
 *       (en este caso, como Bearer Token en la cabecera HTTP).</li>
 *   <li>Un {@link SecurityRequirement} aplica ese esquema a todos los
 *       endpoints del documento OpenAPI.</li>
 *   <li>El {@link SecurityScheme} debe registrarse en los
 *       {@link Components} de la instancia {@link OpenAPI}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public OpenAPI addSecurity(OpenAPI openApi) {
 *     SecurityScheme scheme = new SecurityScheme()
 *         .type(SecurityScheme.Type.HTTP)
 *         .scheme("bearer")
 *         .bearerFormat("JWT");
 *
 *     openApi.components(new Components().addSecuritySchemes("bearerAuth", scheme))
 *             .addSecurityItem(new SecurityRequirement().addList("bearerAuth"));
 *     return openApi;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El nombre lógico del esquema (por ejemplo {@code "bearerAuth"}) debe
 *       coincidir en {@code addSecuritySchemes(...)} y
 *       {@code addSecurityItem(...)}.</li>
 *   <li>{@code bearerFormat} es informativo: Swagger UI no valida el formato
 *       del token, solo lo envía tal cual.</li>
 *   <li>Si tu API usa OAuth2 en lugar de JWT, sustituye {@code Type.HTTP} por
 *       {@code Type.OAUTH2} y configura los flujos correspondientes.</li>
 * </ul>
 */
public class SwaggerSecurityEnunciado {

    /**
     * Añade a la instancia de {@link OpenAPI} el esquema de seguridad Bearer JWT
     * y lo aplica como requisito global a todos los endpoints.
     *
     * @param openApi instancia de {@link OpenAPI} que será enriquecida con la
     *                configuración de seguridad.
     * @return la misma instancia de {@link OpenAPI} recibida como parámetro,
     *         ya configurada con el esquema y requisito de seguridad.
     */
    public OpenAPI addSecurity(OpenAPI openApi) {
        // TODO: Añade un SecurityScheme de tipo HTTP, esquema "bearer", formato "JWT".
        // Luego añade el SecurityRequirement global a la instancia de OpenAPI.
        return openApi;
    }
}
