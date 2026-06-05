package com.algoritmia.nivel19.externo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import java.util.Map;

/**
 * Test para ejercicio de Buscador de Repos Avanzado.
 * Valida búsqueda reactiva de repositorios.
 */
class BuscadorReposAvanzadoTest {

    @Test
    void testFlujoReactivo() {
        BuscadorReposAvanzadoEnunciado buscador = new BuscadorReposAvanzadoEnunciado(WebClient.builder());
        Flux<Map> flux = buscador.buscarPorLenguaje("Java");
        
        assertNull(flux, "Por defecto el enunciado devuelve null");
    }
}
