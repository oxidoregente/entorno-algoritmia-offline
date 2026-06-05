package com.algoritmia.nivel10;

/**
 * 🎓 RETO: Uso de Archivos {@code .env} en Docker Compose.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Configura tu {@code docker-compose.yml} para que use variables externas
 * definidas en un archivo {@code .env} (por ejemplo credenciales de la base
 * de datos). Esto evita dejar secretos en el repositorio y permite cambiar
 * la configuración entre entornos (local, staging, producción) sin tocar el
 * compose.</p>
 *
 * <p><b>Reglas / Estructura del Compose:</b></p>
 * <ul>
 *   <li>Crea un bloque {@code env_file:} que apunte al archivo
 *       {@code .env} del proyecto.</li>
 *   <li>Dentro de los servicios, referencia las variables con la sintaxis
 *       {@code ${NOMBRE_VARIABLE}} (por ejemplo
 *       {@code ${DB_NAME}}, {@code ${DB_USER}}, {@code ${DB_PASSWORD}}).</li>
 *   <li>El archivo {@code .env} <b>no</b> debe versionarse en Git; añade
 *       {@code .env} a tu {@code .gitignore}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # .env (NO subir al repositorio)
 * DB_NAME=algoritmia
 * DB_USER=postgres
 * DB_PASSWORD=postgres
 *
 * # docker-compose.yml
 * services:
 *   db:
 *     image: postgres:15-alpine
 *     environment:
 *       POSTGRES_DB: ${DB_NAME}
 *       POSTGRES_USER: ${DB_USER}
 *       POSTGRES_PASSWORD: ${DB_PASSWORD}
 *
 *   app:
 *     build: .
 *     env_file:
 *       - .env
 *     environment:
 *       SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/${DB_NAME}
 *     depends_on:
 *       - db
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Puedes definir un valor por defecto con
 *       {@code ${DB_USER:-postgres}}: si la variable no existe, se usa
 *       {@code postgres}.</li>
 *   <li>{@code env_file} carga las variables al entorno del contenedor;
 *       la sustitución con {@code ${...}} se hace en tiempo de parsing del
 *       compose.</li>
 *   <li>Para producción se recomienda usar Docker Secrets o un vault externo
 *       en lugar de un simple {@code .env}.</li>
 * </ul>
 */
public class ComposeEnvFileEnunciado {

    /**
     * Genera el contenido del {@code docker-compose.yml} que utiliza
     * variables externas desde un archivo {@code .env} para las credenciales
     * de la base de datos.
     *
     * @return String con el contenido YAML del docker-compose.
     */
    public String generarCompose() {
        // TODO: Retorna un YAML que use ${VARIABLE} para DB_NAME, DB_USER, etc.
        return "";
    }
}
