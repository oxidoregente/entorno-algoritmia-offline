package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;

/**
 * 🏆 SOLUCIONES: Nivel 08 - Documentación Dinámica.
 * 
 * <p>Swagger (OpenAPI) es el estándar industrial para documentar APIs REST. 
 * En Spring Boot 3, usamos la librería 'springdoc-openapi'.</p>
 */
public class SwaggerSoluciones {

    /**
     * Ex 1: Configuración Básica.
     * <p>El bean OpenAPI es el punto de entrada para personalizar la documentación.</p>
     */
    public OpenAPI configBasica() {
        return new OpenAPI();
    }

    /**
     * Ex 2: Metadatos Personalizados.
     * <p>Es vital que la API tenga un título y versión claros para los consumidores.</p>
     * <p><b>Ejemplo:</b></p>
     * <pre>
     * info:
     *   title: Algoritmia API
     *   version: v1.0
     * </pre>
     */
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Algoritmia API")
                        .version("v1.0")
                        .description("Laboratorio de Ingeniería"));
    }

    /**
     * Ex 3: Seguridad JWT.
     * <p>Para que Swagger permita probar endpoints protegidos, debemos definir 
     * un esquema de seguridad (SecurityScheme) y aplicarlo globalmente.</p>
     */
    public OpenAPI addSecurity(OpenAPI openApi) {
        final String securitySchemeName = "bearerAuth";
        return openApi
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")));
    }

    /**
     * Ex 4: Agrupación.
     * <p>GroupedOpenApi permite dividir una API grande en secciones lógicas 
     * (ej: Public, Admin, Mobile).</p>
     */
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Public-API")
                .pathsToMatch("/api/v1/public/**")
                .build();
    }
}
