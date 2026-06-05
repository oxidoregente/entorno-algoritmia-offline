package com.algoritmia.nivel12.docker;

/**
 * 🎓 RETO: Metadatos con Labels en Docker.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Añade metadatos a la imagen Docker usando la instrucción {@code LABEL}.
 * Estos <i>labels</i> son pares clave/valor visibles con
 * {@code docker inspect} y se usan para auditoría, clasificación,
 * versionado o integración con herramientas externas (CI/CD, registries,
 * escáneres de seguridad).</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Incluye al menos un {@code LABEL maintainer="..."} con tu correo
 *       o el del equipo.</li>
 *   <li>Incluye {@code LABEL description="..."} con una descripción legible
 *       del proyecto.</li>
 *   <li>Cada {@code LABEL} añade una capa a la imagen: combínalos con
 *       {@code \}-continuación de línea o declarando un único LABEL
 *       con varias claves.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * FROM eclipse-temurin:21-jre-jammy
 * LABEL maintainer="tu-nombre@example.com" \
 *       description="Laboratorio de Algoritmia" \
 *       version="1.0.0"
 * WORKDIR /app
 * COPY target/*.jar app.jar
 * EXPOSE 8080
 * ENTRYPOINT ["java", "-jar", "/app.jar"]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa la barra invertida ({@code \}) al final de cada línea para
 *       encadenar varios labels en uno solo y reducir capas.</li>
 *   <li>Convención OCI estándar: prefija tus labels con el dominio invertido,
 *       por ejemplo {@code com.algoritmia.mantenimiento=...}.</li>
 *   <li>Los labels se pueden consultar en cualquier momento con
 *       {@code docker image inspect &lt;imagen&gt;}.</li>
 * </ul>
 */
public class DockerLabelsEnunciado {

    /**
     * Genera el contenido del Dockerfile añadiendo metadatos con la
     * instrucción {@code LABEL} (autor y descripción del proyecto).
     *
     * @return String con el contenido completo del Dockerfile.
     */
    public String generarDockerfile() {
        // TODO: Retorna un String con:
        // LABEL maintainer="tu-nombre@example.com"
        // LABEL description="Laboratorio de Algoritmia"
        return "";
    }
}
