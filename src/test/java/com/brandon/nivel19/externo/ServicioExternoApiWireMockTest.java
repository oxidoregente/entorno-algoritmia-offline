package com.brandon.nivel19.externo;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.*;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
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
    private final ServicioExternoApiEnunciado servicio = new ServicioExternoApiEnunciado(webClientBuilder.baseUrl("http://localhost:8089"));

    @Test
    @SuppressWarnings("unchecked")
    void testLlamadaGitHubSimulada() {
        // Arrange
        stubFor(get(urlEqualTo("/repos/brandon/java-lab"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"name\": \"java-lab\", \"stars\": 100}")));

        // Act - Usamos .block() para simplificar el test y evitar dependencias extra de reactor-test
        Map<String, Object> resultado = (Map<String, Object>) servicio.obtenerInfoRepositorio("brandon", "java-lab").block();

        // Assert
        assertNotNull(resultado);
        assertEquals("java-lab", resultado.get("name"));
    }
}
