package com.algoritmia.nivel09;

/**
 * 🎓 RETO: Dockerfile con Healthcheck.
 * <b>Dificultad: Media</b>
 * 
 * <p>Añade una instrucción HEALTHCHECK a tu Dockerfile para que Docker 
 * pueda monitorear si la aplicación Spring Boot está lista (usando Actuator).</p>
 */
public class DockerHealthCheckEnunciado {

    public String generarDockerfile() {
        // TODO: Retorna un String con la instrucción HEALTHCHECK.
        // Ejemplo: HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8080/actuator/health || exit 1
        return "";
    }
}
