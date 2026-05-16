package com.algoritmia.nivel28;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * 🏆 SOLUCIONES: WireMock Simulation.
 */
public class WireMockSoluciones {

    public void basicStub() {
        stubFor(get(urlEqualTo("/api/test"))
                .willReturn(aResponse().withStatus(200).withBody("Hola")));
    }

    public void faultStub() {
        stubFor(get(urlEqualTo("/api/slow"))
                .willReturn(aResponse().withFixedDelay(5000)));
    }

    public void verifyCall() {
        verify(postRequestedFor(urlEqualTo("/api/usuarios"))
                .withHeader("Content-Type", equalTo("application/json")));
    }
}
