package com.algoritmia.nivel09;

/**
 * 🎓 RETO: Dockerfile con Healthcheck.
 * <b>Dificultad: Media</b>
 *
 * <p>Añade una instrucción {@code HEALTHCHECK} al Dockerfile para que Docker
 * (y orquestadores como Docker Compose o Kubernetes) puedan monitorizar si
 * la aplicación Spring Boot está <i>lista</i> para recibir tráfico. La
 * forma estándar en Spring Boot es apoyarse en el endpoint
 * {@code /actuator/health} que expone Spring Boot Actuator.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code HEALTHCHECK --interval=30s --timeout=3s CMD curl -f ... || exit 1}.</li>
 *   <li>El comando debe devolver código 0 si el servicio está sano, y un
 *       código distinto de 0 en caso contrario.</li>
 *   <li>La imagen base debe incluir {@code curl} (o {@code wget}); las
 *       imágenes {@code -slim} no lo traen por defecto.</li>
 *   <li>Recuerda que {@code /actuator/health} debe estar expuesto y
 *       accesible desde dentro del contenedor (mismo {@code localhost}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * FROM eclipse-temurin:21-jre-jammy
 * RUN apt-get update &amp;&amp; apt-get install -y curl &amp;&amp; rm -rf /var/lib/apt/lists/*
 * WORKDIR /app
 * COPY target/*.jar app.jar
 * EXPOSE 8080
 * HEALTHCHECK --interval=30s --timeout=3s --start-period=20s \
 *   CMD curl -f http://localhost:8080/actuator/health || exit 1
 * ENTRYPOINT ["java", "-jar", "/app.jar"]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code --start-period} para dar tiempo a la aplicación a arrancar
 *       antes de que se empiecen a contar fallos.</li>
 *   <li>{@code -f} en {@code curl} hace que el comando devuelva error si el
 *       código HTTP no es 2xx.</li>
 *   <li>Si la imagen base no tiene {@code curl}, considera cambiar a
 *       {@code wget} o instalar la dependencia.</li>
 * </ul>
 */
public class DockerHealthCheckEnunciado {

    /**
     * Genera el contenido del Dockerfile incluyendo la instrucción
     * {@code HEALTHCHECK} para monitorear el estado de la aplicación
     * Spring Boot.
     *
     * @return String con el contenido completo del Dockerfile.
     */
    public String generarDockerfile() {
        // TODO: Retorna un String con la instrucción HEALTHCHECK.
        // Ejemplo: HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8080/actuator/health || exit 1
        return "";
    }
}
