package com.algoritmia.nivel08;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 🎓 RETO: Documentación de Modelos (Schemas).
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Usa anotaciones de Swagger para documentar el siguiente record. 
 * Debes añadir descripciones y ejemplos a cada campo para que se vean 
 * correctamente en el Swagger UI.</p>
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
