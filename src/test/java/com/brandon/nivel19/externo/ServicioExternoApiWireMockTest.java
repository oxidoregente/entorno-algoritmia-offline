package com.brandon.nivel19.externo;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.*;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import java.util.Map;

/**
 * Nivel 28: Pruebas con WireMock.
 * 
 * Simula el comportamiento de la API de GitHub para que el test
 * sea determinista y no requiera internet.
 */
@WireMockTest(httpPort = 8089)
class ServicioExternoApiWireMockTest {

    private final WebClient.Builder webClientBuilder = WebClient.builder();
    // Apuntamos al puerto de WireMock (8089) en lugar de github.com
    private final ServicioExternoApiEnunciado servicio = new ServicioExternoApiEnunciado(webClientBuilder.baseUrl("http://localhost:8089"));

    @Test
    void testLlamadaGitHubSimulada() {
        // Arrange: Configuramos el "Mock" de la API externa
        stubFor(get(urlEqualTo("/repos/brandon/java-lab"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"name\": \"java-lab\", \"stars\": 100}")));

        // Act
        Mono<Map> resultado = servicio.obtenerInfoRepositorio("brandon", "java-lab");

        // Assert: Usamos StepVerifier para flujos reactivos
        StepVerifier.create(resultado)
                .assertNext(mapa -> {
                    assertEquals("java-lab", mapa.get("name"));
                })
                .verifyComplete();
    }
}
