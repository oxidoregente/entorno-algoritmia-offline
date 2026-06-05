package com.algoritmia.nivel27.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Propiedades por Perfil.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Spring Boot carga automáticamente archivos
 * {@code application.properties} (base) y, según el perfil
 * activo, los archivos específicos
 * {@code application-{perfil}.properties}. Esto permite
 * mantener valores distintos para una misma clave
 * (URLs, credenciales, niveles de log) sin recompilar ni
 * condicionales en el código. La anotación
 * {@code @Value} los inyecta directamente en los beans.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>La inyección con {@code @Value("${propiedad}")} lee del entorno (properties,
 *       variables del sistema, argumentos JVM).</li>
 *   <li>Si la propiedad no existe y no se indica valor por defecto, la app no arranca.</li>
 *   <li>Se puede proporcionar un valor por defecto con
 *       {@code @Value("${app.mensaje:Bienvenido}")}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # application-dev.properties
 * app.mensaje=Entorno de desarrollo
 *
 * # application-prod.properties
 * app.mensaje=Entorno de producción
 *
 * &#64;Component
 * public class ProfilePropsEnunciado {
 *     &#64;Value("${app.mensaje}")
 *     private String mensaje;
 *
 *     public String getMensaje() { return mensaje; }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para evitar el acoplamiento a {@code @Value}, considera
 *       {@code @ConfigurationProperties} con una clase POJO.</li>
 *   <li>Verifica que ambos archivos
 *       ({@code application-dev.properties} y {@code application-prod.properties})
 *       definan {@code app.mensaje}, o usa un valor por defecto en la anotación.</li>
 * </ul>
 */
@Component
public class ProfilePropsEnunciado {

    @Value("${app.mensaje}")
    private String mensaje;

    /**
     * Devuelve el mensaje configurado para el perfil activo.
     *
     * @return valor de la propiedad {@code app.mensaje} definido en el
     *         archivo de propiedades correspondiente al perfil activo
     */
    public String getMensaje() {
        // TODO: Asegúrate de tener definido 'app.mensaje' en application-dev.properties
        // y application-prod.properties con valores distintos.
        return mensaje;
    }
}
