package com.algoritmia.nivel08;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

/**
 * 🎓 RETO: Agrupación de Endpoints.
 * <b>Dificultad: Media</b>
 * 
 * <p>Configura un grupo de API llamado "Public-API" que solo incluya 
 * los endpoints que comiencen con el path "/api/v1/public/**".</p>
 */
public class SwaggerGroupEnunciado {

    @Bean
    public GroupedOpenApi publicApi() {
        // TODO: Crea y retorna un GroupedOpenApi con nombre "Public-API" 
        // y filtro de rutas por el patrón indicado.
        return null;
    }
}
