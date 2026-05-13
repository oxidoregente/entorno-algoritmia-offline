package com.algoritmia.nivel19.externo;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.test.StepVerifier;

@WireMockTest(httpPort = 8090)
class ConsultorTasaCambioTest {

    private final ConsultorTasaCambioEnunciado servicio = 
        new ConsultorTasaCambioEnunciado(WebClient.builder().baseUrl("http://localhost:8090"));

    @Test
    void testObtenerTasa() {
        stubFor(get(urlEqualTo("/api/v1/rates/USD-EUR"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"rate\": 0.92}")));

        // Este test fallará hasta que el estudiante implemente el WebClient
        // StepVerifier.create(servicio.obtenerTasaUSD())
        //         .expectNext(0.92)
        //         .verifyComplete();
    }
}
