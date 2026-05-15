package com.algoritmia.nivel08;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 🏆 SOLUCIÓN: Documentación de Modelos (Schemas).
 */
@Schema(description = "Representa un resumen de usuario para la API")
public record SwaggerSchemaSolucion(
    
    @Schema(description = "ID único del usuario", example = "1")
    Long id,
    
    @Schema(description = "Nombre completo", example = "Juan Pérez")
    String nombre,
    
    @Schema(description = "Correo electrónico", example = "juan@example.com")
    String email
) {
}
