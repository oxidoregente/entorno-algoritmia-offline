package com.algoritmia.nivel12.docker;

/**
 * 🎓 RETO: Dockerfile Multi-Etapa (Multi-Stage Build).
 * <b>Dificultad: Media</b>
 *
 * <p>Crea un Dockerfile <i>multi-stage</i> que primero compile la aplicación
 * usando Maven y luego copie únicamente el artefacto final (.jar) a una
 * imagen ligera basada en JRE. Esta técnica reduce drásticamente el tamaño
 * de la imagen final y mejora la seguridad al no incluir el toolchain de
 * compilación en producción.</p>
 *
 * <p><b>Reglas / Estructura del Dockerfile:</b></p>
 * <ul>
 *   <li><b>Etapa de build</b> ({@code AS build}): usa una imagen con Maven y
 *       JDK 21 (por ejemplo {@code maven:3.9-eclipse-temurin-21}), copia
 *       {@code pom.xml} y {@code src/}, y ejecuta {@code mvn package}.</li>
 *   <li><b>Etapa final</b>: usa una imagen mínima con sólo JRE 21
 *       ({@code eclipse-temurin:21-jre-jammy}).</li>
 *   <li>Copia el JAR ya construido desde la etapa {@code build} con
 *       {@code COPY --from=build /app/target/*.jar app.jar}.</li>
 *   <li>Define el {@code ENTRYPOINT} en la etapa final.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Etapa 1: build con Maven
 * FROM maven:3.9-eclipse-temurin-21 AS build
 * WORKDIR /app
 * COPY pom.xml .
 * COPY src ./src
 * RUN mvn -B -DskipTests package
 *
 * # Etapa 2: runtime ligero
 * FROM eclipse-temurin:21-jre-jammy
 * WORKDIR /app
 * COPY --from=build /app/target/*.jar app.jar
 * EXPOSE 8080
 * ENTRYPOINT ["java", "-jar", "/app.jar"]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El alias {@code AS build} es obligatorio para referenciar la primera
 *       etapa desde la segunda.</li>
 *   <li>Si solo quieres el JAR <i>executable</i> (sin dependencias sueltas),
 *       usa {@code mvn package} con el plugin
 *       {@code spring-boot-maven-plugin} que ya está configurado.</li>
 *   <li>El tamaño típico de la imagen final con JRE es ~250 MB frente a los
 *       ~600 MB de una imagen basada en JDK.</li>
 * </ul>
 */
public class DockerMultiStageEnunciado {

    /**
     * Genera el contenido del Dockerfile multi-etapa que compila la
     * aplicación con Maven y copia solo el artefacto a una imagen ligera.
     *
     * @return String con el contenido completo del Dockerfile.
     */
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
