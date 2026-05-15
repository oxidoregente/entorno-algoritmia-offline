package com.algoritmia.nivel09;

/**
 * 🎓 RETO: Dockerfile Multi-Etapa (Multi-stage).
 * <b>Dificultad: Media</b>
 * 
 * <p>Crea un Dockerfile que primero compile la aplicación usando Maven y 
 * luego copie solo el artefacto final a una imagen ligera para ejecución.</p>
 */
public class DockerMultiStageEnunciado {

    public String generarDockerfile() {
        // TODO: Retorna un String con:
        // 1. Etapa de build: FROM maven:3.9-eclipse-temurin-21 AS build
        // 2. Copia de src y pom.xml
        // 3. Ejecución de mvn package
        // 4. Etapa final: FROM eclipse-temurin:21-jre-jammy
        // 5. COPY --from=build ...
        return "";
    }
}
