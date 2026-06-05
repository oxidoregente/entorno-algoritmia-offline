package com.algoritmia.nivel28.migraciones;

/**
 * 🎓 RETO: Baseline en Flyway.
 * <b>Dificultad: Media</b>
 *
 * <p>Adoptar Flyway en un proyecto que ya tiene base de datos
 * en producción (con sus tablas y datos) presenta un dilema:
 * la tabla {@code flyway_schema_history} está vacía, pero
 * el esquema no. Si Flyway ejecuta las migraciones desde
 * el inicio, fallará. El <b>baseline</b> le indica a Flyway
 * que considere el estado actual como punto de partida
 * válido a partir de una versión concreta, ignorando
 * migraciones anteriores.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Activar baseline con {@code spring.flyway.baseline-on-migrate=true}.</li>
 *   <li>Definir la versión de partida con {@code spring.flyway.baseline-version=0}
 *       (o el número desde el que se quiere empezar a trackear).</li>
 *   <li>Flyway crea automáticamente un registro inicial de baseline en
 *       {@code flyway_schema_history} con la versión indicada.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # application.properties
 * spring.flyway.enabled=true
 * spring.flyway.baseline-on-migrate=true
 * spring.flyway.baseline-version=2
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si la BD ya contiene la versión 2 aplicada manualmente, configura
 *       {@code baseline-version=2} para que Flyway no intente aplicar V1 y V2.</li>
 *   <li>Establece una {@code baseline-description} legible con la fecha del baseline
 *       para auditoría.</li>
 * </ul>
 */
public class FlywayBaselineEnunciado {

    /**
     * Devuelve la propiedad que habilita el baseline automático en Flyway.
     *
     * @return línea de configuración de {@code application.properties} para
     *         activar {@code spring.flyway.baseline-on-migrate}
     */
    public String getComandoProperties() {
        // TODO: ¿Qué propiedad de Spring Boot habilita el baseline automático?
        // spring.flyway.baseline-on-migrate=...
        return "";
    }
}
