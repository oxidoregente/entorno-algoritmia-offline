package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

/**
 * 🎓 RETO: Seguridad JWT en Swagger.
 * <b>Dificultad: Media</b>
 * 
 * <p>Configura Swagger para que soporte autenticación por Token JWT (Bearer). 
 * Los usuarios deben poder ingresar el token en la interfaz de Swagger UI.</p>
 */
public class SwaggerSecurityEnunciado {

    public OpenAPI addSecurity(OpenAPI openApi) {
        // TODO: Añade un SecurityScheme de tipo HTTP, esquema "bearer", formato "JWT".
        // Luego añade el SecurityRequirement global a la instancia de OpenAPI.
        return openApi;
    }
}
