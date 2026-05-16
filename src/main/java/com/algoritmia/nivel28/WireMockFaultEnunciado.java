package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🎓 RETO: Simulación de Errores y Retrasos.
 * <b>Dificultad: Media</b>
 * 
 * <p>Una de las mayores ventajas de WireMock es probar cómo reacciona 
 * tu app ante fallos de red o lentitud del servidor externo.</p>
 */
public class WireMockFaultEnunciado {

    public void simularLentitud() {
        // TODO: Configura un stub que tarde 5 segundos en responder.
        // Pista: Usa .withFixedDelay(5000)
    }

    public void simularErrorServidor() {
        // TODO: Configura un stub que retorne un status 500.
    }
}
