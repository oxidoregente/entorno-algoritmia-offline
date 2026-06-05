package com.algoritmia.nivel29.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import java.util.Map;

/**
 * 🎓 RETO: Endpoint Personalizado de Actuator.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Más allá de los endpoints estándar de Spring Boot Actuator
 * (/health, /info, /metrics), muchas aplicaciones necesitan exponer
 * información operativa propia (ej: versión desplegada, modo de
 * mantenimiento, resumen de cache). Esto se logra creando un
 * {@code @Endpoint} personalizado que aparece automáticamente en
 * {@code /actuator/{id}} cuando se habilita la exposición.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Anotar la clase con {@link Endpoint} definiendo un {@code id} único (URL).</li>
 *   <li>Cada método público se mapea a un verbo HTTP mediante {@link ReadOperation},
 *       {@code WriteOperation} o {@code DeleteOperation}.</li>
 *   <li>Los endpoints personalizados deben habilitarse en {@code application.properties}
 *       con la propiedad {@code management.endpoints.web.exposure.include}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Component
 * &#64;Endpoint(id = "resumen")
 * public class ActuatorCustomEndpointEnunciado {
 *     &#64;ReadOperation
 *     public Map&lt;String, String&gt; obtenerResumen() {
 *         return Map.of("estado", "activo", "version", "1.0.0");
 *     }
 * }
 * // Acceso: GET http://localhost:8080/actuator/resumen
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code Map.of("estado", "activo", "version", "1.0")} para un mapa inmutable simple.</li>
 *   <li>Si el endpoint no aparece, revisa la propiedad
 *       {@code management.endpoints.web.exposure.include=resumen,health,info}.</li>
 * </ul>
 */
@Component
@Endpoint(id = "resumen")
public class ActuatorCustomEndpointEnunciado {

    /**
     * Expone un resumen del estado y versión de la aplicación.
     *
     * @return mapa inmutable con clave-valor (ej: estado, version)
     */
    @ReadOperation
    public Map<String, String> obtenerResumen() {
        // TODO: Retorna un mapa con información como "estado: activo"
        // y "version: 1.0".
        return null;
    }
}
