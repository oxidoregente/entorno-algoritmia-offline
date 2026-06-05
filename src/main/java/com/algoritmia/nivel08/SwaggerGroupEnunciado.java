package com.algoritmia.nivel08;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

/**
 * 🎓 RETO: Agrupación de Endpoints en Swagger.
 * <b>Dificultad: Media</b>
 *
 * <p>Configura un grupo de API llamado {@code "Public-API"} que solo incluya
 * los endpoints cuyo path comience por {@code "/api/v1/public/**"}. Los
 * grupos (o <i>groups</i>) permiten partir una API grande en varios
 * documentos OpenAPI, lo que resulta muy útil para separar versiones, áreas
 * de negocio o niveles de acceso.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>El nombre del grupo ({@code "Public-API"}) aparecerá como pestaña
 *       desplegable en Swagger UI.</li>
 *   <li>El filtro de rutas usa Ant-style: {@code /api/v1/public/**} captura
 *       cualquier sub-ruta.</li>
 *   <li>El método productor debe estar anotado con {@link Bean} para que
 *       Springdoc lo registre.</li>
 *   <li>Puedes definir varios {@link GroupedOpenApi} en paralelo (uno por
 *       cada área de la API).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Bean
 * public GroupedOpenApi publicApi() {
 *     return GroupedOpenApi.builder()
 *         .group("Public-API")
 *         .pathsToMatch("/api/v1/public/**")
 *         .build();
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa el patrón <i>builder</i> de {@link GroupedOpenApi}: es la forma
 *       recomendada y más legible.</li>
 *   <li>Si quieres añadir varios paths, encadena varios {@code .pathsToMatch(...)}
 *       o usa {@code .pathsToMatch("/api/v1/public/**", "/health/**")}.</li>
 *   <li>El nombre del grupo es <i>case-sensitive</i> y se muestra tal cual en
 *       el selector de Swagger UI.</li>
 * </ul>
 */
public class SwaggerGroupEnunciado {

    /**
     * Define el grupo de endpoints públicos de la API para Swagger UI.
     *
     * @return un {@link GroupedOpenApi} configurado con el nombre
     *         {@code "Public-API"} y el filtro de rutas indicado.
     */
    @Bean
    public GroupedOpenApi publicApi() {
        // TODO: Crea y retorna un GroupedOpenApi con nombre "Public-API"
        // y filtro de rutas por el patrón indicado.
        return GroupedOpenApi.builder().group("Public-API").pathsToMatch("/api/v1/public/**").build();
    }
}
