package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Prioridad de Stubs.
 * <b>Dificultad: Media</b>
 * 
 * <p>Cuando varias reglas de WireMock coinciden con una petición, 
 * la prioridad define cuál se ejecuta. Útil para tener respuestas 
 * genéricas y casos específicos.</p>
 */
public class WireMockPriorityEnunciado {

    public void configurarPrioridades() {
        // TODO: Configura un stub genérico para "/api/.*" con prioridad baja (10).
        // TODO: Configura un stub específico para "/api/urgente" con prioridad alta (1).
    }
}
