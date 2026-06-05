package com.algoritmia.nivel13.compose;

/**
 * 🎓 RETO: Docker Compose Básico.
 * <b>Dificultad: Media</b>
 *
 * <p>Define un archivo {@code docker-compose.yml} que levante dos servicios
 * coordinados: {@code app} (la aplicación Java/Spring Boot) y {@code db}
 * (PostgreSQL 15). Docker Compose permite describir toda la topología de
 * una aplicación multi-contenedor en un único fichero declarativo.</p>
 *
 * <p><b>Reglas / Estructura del Compose:</b></p>
 * <ul>
 *   <li>Clave raíz {@code services:} con dos hijos: {@code app} y {@code db}.</li>
 *   <li>{@code db}: imagen {@code postgres:15-alpine} con variables de entorno
 *       {@code POSTGRES_DB}, {@code POSTGRES_USER} y {@code POSTGRES_PASSWORD}.</li>
 *   <li>{@code app}: construido desde el {@code Dockerfile} local
 *       ({@code build: .}), exponiendo el puerto {@code 8080:8080} y con la
 *       variable {@code SPRING_DATASOURCE_URL} apuntando a {@code db}.</li>
 *   <li>Opcional: volumen para persistir los datos del PostgreSQL.</li>
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
 *     volumes:
 *       - pgdata:/var/lib/postgresql/data
 *
 *   app:
 *     build: .
 *     ports:
 *       - "8080:8080"
 *     environment:
 *       SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/algoritmia
 *     depends_on:
 *       - db
 *
 * volumes:
 *   pgdata:
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El método debe devolver el YAML completo (en bloque de texto o como
 *       string multilínea).</li>
 *   <li>{@code depends_on} solo garantiza el <i>arranque</i>, no la
 *       disponibilidad real (eso se cubre en otro reto con
 *       {@code condition: service_healthy}).</li>
 *   <li>El host de la base de datos desde {@code app} es el nombre del
 *       servicio: {@code jdbc:postgresql://db:5432/...}.</li>
 * </ul>
 */
public class ComposeBasicoEnunciado {

    /**
     * Genera el contenido del archivo {@code docker-compose.yml} definiendo
     * los servicios {@code app} (aplicación Java) y {@code db} (PostgreSQL 15).
     *
     * @return String con el contenido YAML del docker-compose.
     */
    public String generarCompose() {
        // TODO: Retorna un YAML con:
        // services:
        //   db: image: postgres:15-alpine, environment: [POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD]
        //   app: build: ., ports: ["8080:8080"], environment: [SPRING_DATASOURCE_URL]
        return "";
    }
}
