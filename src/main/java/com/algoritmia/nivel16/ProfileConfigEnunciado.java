package com.algoritmia.nivel16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Acceso a Perfiles Activos.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En tiempo de ejecución, los servicios a veces necesitan
 * condicionar su comportamiento al entorno: deshabilitar
 * trazas costosas en producción, habilitar seeds en
 * desarrollo, cambiar la URL de un partner, etc. Spring
 * expone el perfil activo a través de la interfaz
 * {@link Environment}, accesible en cualquier bean
 * administrado por el contenedor.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link Environment#getActiveProfiles()} devuelve un array de perfiles activos
 *       (puede haber varios).</li>
 *   <li>La inyección por campo con {@code @Autowired} es funcional pero la convención
 *       del proyecto es usar <b>inyección por constructor</b> con campos {@code final}.</li>
 *   <li>Para comprobaciones simples, {@code Arrays.asList(env.getActiveProfiles()).contains("prod")}
 *       es la forma más directa.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * public class ProfileConfigEnunciado {
 *     private final Environment env;
 *
 *     public ProfileConfigEnunciado(Environment env) {
 *         this.env = env;
 *     }
 *
 *     public boolean esProduccion() {
 *         return Arrays.asList(env.getActiveProfiles()).contains("prod");
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>También puedes usar el helper de Spring: {@code env.acceptsProfiles(Profiles.of("prod"))}.</li>
 *   <li>Si no hay perfil activo, {@code getActiveProfiles()} devuelve un array con
 *       el perfil por defecto {@code "default"}.</li>
 * </ul>
 */
@Component
public class ProfileConfigEnunciado {

    @Autowired
    private Environment env;

    /**
     * Determina si el perfil {@code prod} está activo.
     *
     * @return {@code true} si la aplicación se ejecuta con el perfil {@code prod},
     *         {@code false} en caso contrario
     */
    public boolean esProduccion() {
        // TODO: Verifica si el arreglo env.getActiveProfiles() contiene "prod"
        return false;
    }
}
