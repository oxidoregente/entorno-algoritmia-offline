package com.algoritmia.nivel16;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 🎓 RETO: Perfiles Negativos (!).
 * <b>Dificultad: Media</b>
 *
 * <p>Algunos componentes solo deben existir en entornos no
 * productivos: seeds de base de datos, mocks de APIs externas,
 * herramientas de debug, auto-instrumentación de desarrollo
 * (DevTools, Swagger UI). El operador lógico {@code !} de
 * {@link Profile} permite excluirlos de producción sin
 * enumerar todos los perfiles seguros uno a uno.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code @Profile("!prod")} carga la clase en cualquier perfil excepto {@code prod}.</li>
 *   <li>Se pueden combinar con AND lógico y OR lógico: {@code @Profile("dev | test")}
 *       o {@code @Profile("dev & !cloud")}.</li>
 *   <li>Si la clase no cumple el perfil, Spring ni siquiera la instancia: ahorra memoria
 *       y reduce superficie de ataque.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Configuration
 * &#64;Profile("!prod")
 * public class ProfileNoProdEnunciado {
 *     &#64;Bean
 *     public DataSeeder seeder() {
 *         return new DataSeeder(); // solo en dev/test
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Recuerda que si ningún perfil está activo, se considera {@code "default"}, que
 *       sí está incluido por {@code !prod}.</li>
 *   <li>Puedes usar perfiles múltiples con negación múltiple:
 *       {@code @Profile("!prod & !staging")} para entornos de desarrollo estrictos.</li>
 * </ul>
 */
@Configuration
@Profile("!prod")
public class ProfileNoProdEnunciado {
    // TODO: ¿Qué significa @Profile("!prod")?
    // Significa que este componente se cargará en cualquier perfil EXCEPTO en prod.

    /**
     * Devuelve una etiqueta descriptiva del entorno no productivo.
     *
     * @return mensaje indicando que el ambiente no es seguro
     */
    public String getAmbiente() {
        return "Ambiente No Seguro (Testing/Dev)";
    }
}
