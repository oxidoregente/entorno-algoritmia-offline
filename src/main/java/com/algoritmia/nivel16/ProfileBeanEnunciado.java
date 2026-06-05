package com.algoritmia.nivel16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 🎓 RETO: Beans Condicionales por Perfil.
 * <b>Dificultad: Media</b>
 *
 * <p>En una aplicación real, los componentes de infraestructura
 * (DataSource, caché, cliente HTTP) cambian entre entornos. En
 * desarrollo se usa H2 en memoria y un cliente HTTP simple, pero
 * en producción se necesita PostgreSQL con TLS, un pool
 * HikariCP dimensionado y un cliente con timeouts. Spring Profiles
 * permiten declarar beans alternativos y activar el correcto
 * mediante {@code spring.profiles.active=dev|prod|test}.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Anotar una clase con {@code @Configuration} y sus métodos {@code @Bean} con
 *       {@link Profile} para registrar variantes por entorno.</li>
 *   <li>Se puede aplicar {@code @Profile} a nivel de clase (afecta a todos los beans)
 *       o a nivel de método (afecta solo al bean declarado).</li>
 *   <li>El perfil activo se establece en {@code application.properties} con
 *       {@code spring.profiles.active=prod} o por variable de entorno
 *       {@code SPRING_PROFILES_ACTIVE}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Configuration
 * public class ProfileBeanEnunciado {
 *     &#64;Bean
 *     &#64;Profile("dev")
 *     public String dataSourceDev() {
 *         return "H2-Memory-Database";
 *     }
 *
 *     &#64;Bean
 *     &#64;Profile("prod")
 *     public String dataSourceProd() {
 *         return "PostgreSQL-External-Database";
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El nombre del método ({@code dataSourceProd}) se usa como nombre del bean por
 *       defecto; úsalo al inyectar con {@code @Qualifier} si hay ambigüedad.</li>
 *   <li>Puedes combinar perfiles con operadores lógicos:
 *       {@code @Profile({"dev", "test"})}.</li>
 * </ul>
 */
@Configuration
public class ProfileBeanEnunciado {

    /**
     * Bean del DataSource para el perfil {@code dev}.
     *
     * @return nombre identificador del datasource en memoria
     */
    @Bean
    @Profile("dev")
    public String dataSourceDev() {
        return "H2-Memory-Database";
    }

    /**
     * Bean del DataSource para el perfil {@code prod}.
     *
     * @return nombre identificador del datasource externo (PostgreSQL)
     */
    @Bean
    // TODO: Añade la anotación @Profile para que este bean solo se cargue en "prod"
    public String dataSourceProd() {
        return "PostgreSQL-External-Database";
    }
}
