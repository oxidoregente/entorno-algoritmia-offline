package com.algoritmia.nivel10;

/**
 * 🎓 RETO: Docker Compose Básico.
 * <b>Dificultad: Media</b>
 * 
 * <p>Define un archivo docker-compose.yml que levante dos servicios: 
 * 'app' (tu aplicación Java) y 'db' (PostgreSQL 15).</p>
 */
public class ComposeBasicoEnunciado {

    /**
     * Genera el contenido del archivo docker-compose.yml definiendo los
     * servicios 'app' (aplicación Java) y 'db' (PostgreSQL 15).
     *
     * @return String con el contenido YAML del docker-compose
     */
    public String generarCompose() {
        // TODO: Retorna un YAML con:
        // services:
        //   db: image: postgres:15-alpine, environment: [POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD]
        //   app: build: ., ports: ["8080:8080"], environment: [SPRING_DATASOURCE_URL]
        return "";
    }
}
