package com.algoritmia.nivel09;

/**
 * 🎓 RETO: Dockerfile Básico.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Escribe las instrucciones de un Dockerfile para una aplicación Spring Boot. 
 * Debes usar una imagen base de Java 21, copiar el archivo JAR y definir 
 * el comando de entrada.</p>
 */
public class DockerBasicoEnunciado {

    public String generarDockerfile() {
        // TODO: Retorna un String con las instrucciones:
        // FROM openjdk:21-jdk-slim
        // COPY target/*.jar app.jar
        // ENTRYPOINT ["java", "-jar", "/app.jar"]
        return "";
    }
}
