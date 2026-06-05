package com.algoritmia.nivel12.docker;

/**
 * 🎓 RETO: Dockerfile Básico para Spring Boot.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Escribe las instrucciones de un Dockerfile para empaquetar una
 * aplicación Spring Boot en una imagen Docker. El objetivo es que el
 * artefacto {@code .jar} producido por Maven pueda ejecutarse de forma
 * aislada y reproducible en cualquier entorno que disponga de Docker.</p>
 *
 * <p><b>Reglas / Estructura del Dockerfile:</b></p>
 * <ul>
 *   <li>{@code FROM openjdk:21-jdk-slim}: imagen base oficial con JDK 21.</li>
 *   <li>{@code COPY target/*.jar app.jar}: copia el JAR construido por Maven.</li>
 *   <li>{@code ENTRYPOINT ["java", "-jar", "/app.jar"]}: comando de arranque
 *       en formato <i>exec</i> (sin shell intermedio).</li>
 *   <li>Exponer el puerto 8080 con {@code EXPOSE}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * FROM eclipse-temurin:21-jre-jammy
 * WORKDIR /app
 * COPY target/*.jar app.jar
 * EXPOSE 8080
 * ENTRYPOINT ["java", "-jar", "/app.jar"]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El método debe devolver <b>todo</b> el contenido del Dockerfile como
 *       un único {@link String} multilínea.</li>
 *   <li>Recuerda escapar las comillas dentro de Java con {@code \"}} o usar
 *       <i>text blocks</i> de Java 15+ (recomendado).</li>
 *   <li>En un proyecto real, la imagen final debería ser la JRE, no la JDK,
 *       para reducir el tamaño final.</li>
 * </ul>
 */
public class DockerBasicoEnunciado {

    /**
     * Genera el contenido del Dockerfile con las instrucciones necesarias
     * para construir la imagen de la aplicación Spring Boot.
     *
     * @return String con el contenido completo del Dockerfile.
     */
    public String generarDockerfile() {
        // TODO: Retorna un String con las instrucciones:
        // FROM openjdk:21-jdk-slim
        // COPY target/*.jar app.jar
        // ENTRYPOINT ["java", "-jar", "/app.jar"]
        return "";
    }
}
