package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 🎓 RETO: Configuración Básica de Swagger.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Configura un bean de tipo {@link OpenAPI} para habilitar la documentación 
 * automática de la API. El bean debe estar en una clase de configuración.</p>
 */
@Configuration
public class SwaggerConfigEnunciado {

    @Bean
    public OpenAPI customOpenAPI() {
        // TODO: Retorna una instancia básica de OpenAPI
        return null;
    }
}
