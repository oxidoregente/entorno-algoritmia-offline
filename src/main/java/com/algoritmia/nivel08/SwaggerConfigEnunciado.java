package com.algoritmia.nivel08;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 🎓 RETO: Configuración Básica de Swagger (OpenAPI).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Configura un bean de tipo {@link OpenAPI} para habilitar la documentación
 * automática de la API REST. El bean debe vivir en una clase anotada con
 * {@code @Configuration} para que Spring lo detecte durante el arranque y
 * la documentación quede expuesta en
 * {@code http://localhost:8080/swagger-ui.html} y
 * {@code http://localhost:8080/v3/api-docs}.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Anota la clase con {@link Configuration} para que Spring la registre.</li>
 *   <li>Declara un método productor con {@link Bean} que devuelva un
 *       {@link OpenAPI} inicializado.</li>
 *   <li>Este bean es el "lienzo en blanco" sobre el que se añadirán
 *       metadatos, seguridad y agrupación de endpoints (otros retos del nivel).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Configuration
 * public class SwaggerConfigEnunciado {
 *
 *     &#64;Bean
 *     public OpenAPI customOpenAPI() {
 *         return new OpenAPI();
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code springdoc-openapi-starter-webmvc-ui} debe estar en el
 *       {@code pom.xml} (ya lo está en este proyecto).</li>
 *   <li>Para que Swagger UI muestre tu API, basta con que exista al menos un
 *       bean de tipo {@link OpenAPI} en el contexto.</li>
 *   <li>El nombre del método ({@code customOpenAPI}) es libre; céntrate en el
 *       tipo de retorno.</li>
 * </ul>
 */
@Configuration
public class SwaggerConfigEnunciado {

    /**
     * Define el bean raíz de OpenAPI para que Springdoc genere la documentación.
     *
     * @return instancia de {@link OpenAPI} que se registrará en el contexto de Spring.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        // TODO: Retorna una instancia básica de new OpenAPI()
        return null;
    }
}
