package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.OpenAPI;
import org.junit.jupiter.api.Test;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SwaggerConfigTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testSwaggerConfigBeanExists() {
        // Verifica que el bean de configuración básica exista
        assertTrue(context.containsBean("customOpenAPI"), "El bean customOpenAPI no ha sido definido");
        OpenAPI openAPI = context.getBean(OpenAPI.class);
        assertNotNull(openAPI, "La instancia de OpenAPI es nula");
    }

    @Test
    void testSwaggerInfo() {
        SwaggerInfoEnunciado enunciado = new SwaggerInfoEnunciado();
        OpenAPI api = enunciado.apiInfo();
        
        assertNotNull(api, "El método apiInfo retornó null");
        assertNotNull(api.getInfo(), "Info no fue inicializado");
        assertEquals("Algoritmia API", api.getInfo().getTitle());
        assertEquals("v1.0", api.getInfo().getVersion());
    }

    @Test
    void testSwaggerSecurity() {
        SwaggerSecurityEnunciado enunciado = new SwaggerSecurityEnunciado();
        OpenAPI base = new OpenAPI();
        OpenAPI secured = enunciado.addSecurity(base);
        
        assertNotNull(secured.getComponents(), "Los componentes de OpenAPI son nulos");
        assertTrue(secured.getComponents().getSecuritySchemes().containsKey("bearerAuth"), 
            "No se encontró el esquema de seguridad bearerAuth");
    }

    @Test
    void testSwaggerGroup() {
        SwaggerGroupEnunciado enunciado = new SwaggerGroupEnunciado();
        GroupedOpenApi group = enunciado.publicApi();
        
        assertNotNull(group, "El grupo de API es nulo");
        assertEquals("Public-API", group.getGroup());
    }
}
