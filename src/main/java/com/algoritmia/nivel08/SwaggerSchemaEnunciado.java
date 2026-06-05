package com.algoritmia.nivel08;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 🎓 RETO: Documentación de Modelos (Schemas) en Swagger.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Usa anotaciones de Swagger para documentar un {@code record} Java 21.
 * Debes añadir descripciones y ejemplos a cada campo para que se muestren
 * correctamente en el panel <i>Schemas</i> de Swagger UI. Una buena
 * documentación de modelos reduce el tiempo de integración de terceros.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>La anotación a nivel de clase {@link Schema} con {@code description}
 *       describe el modelo completo.</li>
 *   <li>La anotación {@link Schema} a nivel de componente del {@code record}
 *       permite añadir {@code description} y {@code example} por campo.</li>
 *   <li>Los ejemplos son <i>literales de serialización</i> (lo que se ve en
 *       el JSON), no objetos Java.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Schema(description = "Representa un resumen de usuario para la API")
 * public record SwaggerSchemaEnunciado(
 *
 *     &#64;Schema(description = "ID único del usuario", example = "1")
 *     Long id,
 *
 *     &#64;Schema(description = "Nombre completo", example = "Juan Pérez")
 *     String nombre,
 *
 *     &#64;Schema(description = "Correo electrónico", example = "juan@example.com")
 *     String email
 * ) { }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>La anotación {@link Schema} se coloca justo antes del componente del
 *       {@code record}, no dentro del cuerpo.</li>
 *   <li>Para campos opcionales usa {@code requiredMode = RequiredMode.NOT_REQUIRED}
 *       y para fechas añade {@code format = "date-time"} o {@code "email"} para
 *       correos (no olvides el patrón regex).</li>
 *   <li>Swagger UI infiere el nombre del campo a partir del nombre del
 *       componente del record.</li>
 * </ul>
 */
@Schema(description = "Representa un resumen de usuario para la API")
public record SwaggerSchemaEnunciado(

    // TODO: Añade @Schema con descripción "ID único del usuario" y ejemplo "1"
    Long id,

    // TODO: Añade @Schema con descripción "Nombre completo" y ejemplo "Juan Pérez"
    String nombre,

    // TODO: Añade @Schema con descripción "Correo electrónico" y ejemplo "juan@example.com"
    String email
) {
}
