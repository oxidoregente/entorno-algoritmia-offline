package com.algoritmia.nivel05.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 🎓 RETO: Endpoint de Ping.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un controlador REST que responda "Pong" a una petición GET
 * en la ruta "/api/v1/ping". Es el endpoint más básico para verificar que
 * el servidor está funcionando (health check simple).</p>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Anota la clase con @RestController.</li>
 *   <li>Anota el método con @GetMapping("/api/v1/ping").</li>
 * </ul>
 */
@RestController
public class PingControllerEnunciado {

    /**
     * Responde a una petición GET con "Pong" para verificar el estado del servidor.
     *
     * @return String "Pong".
     */
    // TODO: Define el @GetMapping para la ruta /api/v1/ping
    public String responderPing() {
        return null;
    }
}
