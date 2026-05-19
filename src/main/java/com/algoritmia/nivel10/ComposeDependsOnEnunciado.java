package com.algoritmia.nivel10;

/**
 * 🎓 RETO: Dependencias y Healthchecks en Compose.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Configura el servicio 'app' para que espere a que 'db' esté realmente 
 * listo (no solo iniciado, sino aceptando conexiones).</p>
 */
public class ComposeDependsOnEnunciado {

    /**
     * Genera el contenido del docker-compose.yml configurando depends_on
     * con condition: service_healthy para esperar a que la BD esté lista.
     *
     * @return String con el contenido YAML del docker-compose
     */
    public String generarCompose() {
        // TODO: Retorna un YAML usando depends_on con condition: service_healthy.
        // Debes añadir el healthcheck al servicio db.
        return "";
    }
}
