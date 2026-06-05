package com.algoritmia.nivel10;

/**
 * 🎓 RETO: Dependencias y Healthchecks en Compose.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Configura el servicio {@code app} para que espere a que {@code db} esté
 * realmente <b>listo</b> para aceptar conexiones, no simplemente
 * <i>arrancado</i>. Para ello combinamos {@code depends_on} con
 * {@code condition: service_healthy} y declaramos un {@code healthcheck} en
 * el servicio de la base de datos.</p>
 *
 * <p><b>Reglas / Estructura del Compose:</b></p>
 * <ul>
 *   <li>El servicio {@code db} debe definir un bloque {@code healthcheck:}
 *       usando {@code pg_isready} (incluido en la imagen oficial de
 *       PostgreSQL).</li>
 *   <li>El servicio {@code app} debe declarar {@code depends_on:} con la
 *       forma larga: <code>db: { condition: service_healthy }</code>.</li>
 *   <li>El <i>healthcheck</i> de {@code db} debe incluir
 *       {@code interval}, {@code timeout} y {@code retries}.</li>
 *   <li>Sin esta técnica, Spring Boot puede fallar al arrancar si la BD aún
 *       no acepta conexiones.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * services:
 *   db:
 *     image: postgres:15-alpine
 *     environment:
 *       POSTGRES_DB: algoritmia
 *       POSTGRES_USER: postgres
 *       POSTGRES_PASSWORD: postgres
 *     healthcheck:
 *       test: ["CMD-SHELL", "pg_isready -U postgres -d algoritmia"]
 *       interval: 5s
 *       timeout: 3s
 *       retries: 10
 *
 *   app:
 *     build: .
 *     ports:
 *       - "8080:8080"
 *     environment:
 *       SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/algoritmia
 *     depends_on:
 *       db:
 *         condition: service_healthy
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>La sintaxis <i>larga</i> de {@code depends_on} con
 *       {@code condition: service_healthy} requiere Compose v2.</li>
 *   <li>{@code pg_isready} ya viene en la imagen oficial de PostgreSQL: no
 *       necesitas instalar nada extra.</li>
 *   <li>Si tu servicio de BD no expone un healthcheck nativo, puedes usar
 *       un {@code test} con {@code curl} o {@code wget}.</li>
 * </ul>
 */
public class ComposeDependsOnEnunciado {

    /**
     * Genera el contenido del {@code docker-compose.yml} configurando
     * {@code depends_on} con {@code condition: service_healthy} para esperar
     * a que la base de datos esté realmente lista.
     *
     * @return String con el contenido YAML del docker-compose.
     */
    public String generarCompose() {
        // TODO: Retorna un YAML usando depends_on con condition: service_healthy.
        // Debes añadir el healthcheck al servicio db.
        return "";
    }
}
