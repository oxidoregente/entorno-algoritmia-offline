package com.algoritmia.nivel09;

/**
 * 🏆 SOLUCIONES: Nivel 09 - Dockerización.
 * 
 * <p>Docker permite empaquetar una aplicación con todas sus dependencias en una 
 * unidad estándar de software llamada contenedor.</p>
 */
public class DockerSoluciones {

    /**
     * Ex 1: Dockerfile Básico.
     * <p>Usa una imagen ligera (slim) para reducir el tamaño final de la imagen.</p>
     */
    public String solucionBasica() {
        return """
               FROM openjdk:21-jdk-slim
               COPY target/*.jar app.jar
               ENTRYPOINT ["java", "-jar", "/app.jar"]
               """;
    }

    /**
     * Ex 2: Multi-stage Build.
     * <p>Permite compilar en un contenedor (con Maven) y ejecutar en otro 
     * (sin Maven), resultando en imágenes mucho más pequeñas y seguras.</p>
     */
    public String solucionMultiStage() {
        return """
               # Etapa de compilación
               FROM maven:3.9-eclipse-temurin-21 AS build
               COPY src /app/src
               COPY pom.xml /app
               RUN mvn -f /app/pom.xml clean package -DskipTests
               
               # Etapa de ejecución
               FROM eclipse-temurin:21-jre-jammy
               COPY --from=build /app/target/*.jar app.jar
               EXPOSE 8080
               ENTRYPOINT ["java", "-jar", "/app.jar"]
               """;
    }
    
    /**
     * Ex 3: Seguridad (Usuario no-root).
     * <p>Es una mejor práctica de seguridad no ejecutar contenedores como root.</p>
     */
    public String solucionUser() {
        return """
               FROM openjdk:21-jdk-slim
               RUN useradd -m myuser
               USER myuser
               COPY --chown=myuser:myuser target/*.jar app.jar
               ENTRYPOINT ["java", "-jar", "/app.jar"]
               """;
    }
}
