package com.algoritmia.nivel13.compose;

/**
 * 🎓 RETO: Redes en Docker Compose.
 * <b>Dificultad: Media</b>
 *
 * <p>Configura dos redes separadas en tu {@code docker-compose.yml}:
 * {@code backend} y {@code frontend}. La base de datos solo debe estar en
 * {@code backend}, mientras que la aplicación debe estar en ambas redes
 * para poder comunicarse con la BD y, al mismo tiempo, ser accesible
 * desde el exterior (o desde un proxy inverso).</p>
 *
 * <p><b>Reglas / Estructura del Compose:</b></p>
 * <ul>
 *   <li>Define las redes en una clave raíz {@code networks:} (a nivel del
 *       compose, no dentro de un servicio).</li>
 *   <li>El servicio {@code db} debe usar <b>solo</b> la red {@code backend}.</li>
 *   <li>El servicio {@code app} debe estar en <b>ambas</b> redes:
 *       {@code backend} y {@code frontend}.</li>
 *   <li>Las redes definidas por defecto (driver {@code bridge}) son
 *       suficientes para un entorno local.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * services:
 *   db:
 *     image: postgres:15-alpine
 *     networks:
 *       - backend
 *     environment:
 *       POSTGRES_DB: algoritmia
 *       POSTGRES_USER: postgres
 *       POSTGRES_PASSWORD: postgres
 *
 *   app:
 *     build: .
 *     ports:
 *       - "8080:8080"
 *     networks:
 *       - backend
 *       - frontend
 *     environment:
 *       SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/algoritmia
 *     depends_on:
 *       - db
 *
 * networks:
 *   backend:
 *   frontend:
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Aislar la base de datos en una red interna es una buena práctica de
 *       seguridad: nadie desde {@code frontend} puede llegar a ella
 *       directamente.</li>
 *   <li>Si necesitas un nombre DNS distinto del nombre del servicio, añade
 *       {@code aliases:} dentro de la sección {@code networks:} del servicio.</li>
 *   <li>Para eliminar una red usa {@code docker network rm <nombre>}.</li>
 * </ul>
 */
public class ComposeNetworksEnunciado {

    /**
     * Genera el contenido del {@code docker-compose.yml} definiendo dos redes
     * separadas ({@code backend} y {@code frontend}) y asignándolas a los
     * servicios.
     *
     * @return String con el contenido YAML del docker-compose.
     */
    public String generarCompose() {
        // TODO: Retorna un YAML que defina las redes y las asigne a los servicios.
        return "";
    }
}
