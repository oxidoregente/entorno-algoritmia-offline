package com.brandon.nivel19.externo;

import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

class BuscadorReposAvanzadoTest {

    @Test
    void testFlujoReactivo() {
        BuscadorReposAvanzadoEnunciado buscador = new BuscadorReposAvanzadoEnunciado(WebClient.builder());
        Flux<Map> flux = buscador.buscarPorLenguaje("Java");
        
        // assertNull(flux, "Por defecto el enunciado devuelve null");
    }
}
