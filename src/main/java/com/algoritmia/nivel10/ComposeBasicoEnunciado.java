package com.algoritmia.nivel10;

/**
 * 🎓 RETO: Docker Compose Básico.
 * <b>Dificultad: Media</b>
 * 
 * <p>Define un archivo docker-compose.yml que levante dos servicios: 
 * 'app' (tu aplicación Java) y 'db' (PostgreSQL 15).</p>
 */
public class ComposeBasicoEnunciado {

    public String generarCompose() {
        // TODO: Retorna un YAML con:
        // services:
        //   db: image: postgres:15-alpine, environment: [POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD]
        //   app: build: ., ports: ["8080:8080"], environment: [SPRING_DATASOURCE_URL]
        return "";
    }
}
