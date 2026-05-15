package com.algoritmia.nivel10;

/**
 * 🏆 SOLUCIONES: Nivel 10 - Orquestación (Compose).
 */
public class ComposeSoluciones {

    public String solucionBasica() {
        return """
               version: '3.8'
               services:
                 db:
                   image: postgres:15-alpine
                   environment:
                     POSTGRES_DB: algoritmia
                     POSTGRES_USER: user
                     POSTGRES_PASSWORD: pass
                 app:
                   build: .
                   ports:
                     - "8080:8080"
                   environment:
                     SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/algoritmia
               """;
    }

    public String solucionVolumenes() {
        return """
               services:
                 db:
                   image: postgres:15-alpine
                   volumes:
                     - postgres_data:/var/lib/postgresql/data
               volumes:
                 postgres_data:
               """;
    }

    public String solucionNetworks() {
        return """
               services:
                 db:
                   image: postgres:15-alpine
                   networks:
                     - backend
                 app:
                   build: .
                   networks:
                     - backend
                     - frontend
               networks:
                 backend:
                 frontend:
               """;
    }

    public String solucionDependsOn() {
        return """
               services:
                 db:
                   image: postgres:15-alpine
                   healthcheck:
                     test: ["CMD-SHELL", "pg_isready -U user -d db"]
                     interval: 10s
                     timeout: 5s
                     retries: 5
                 app:
                   build: .
                   depends_on:
                     db:
                       condition: service_healthy
               """;
    }
}
