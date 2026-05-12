package com.brandon.nivel05.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 🏆 SOLUCIÓN: Endpoint de Ping.
 */
public class PingControllerSolucion {

    @GetMapping("/api/v1/ping")
    public String responderPing() {
        return "Pong";
    }
}
