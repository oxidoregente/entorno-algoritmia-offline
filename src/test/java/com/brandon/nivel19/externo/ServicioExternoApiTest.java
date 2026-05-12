package com.brandon.nivel19.externo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import java.util.Map;

@SpringBootTest
class ServicioExternoApiTest {

    @Autowired
    private ServicioExternoApiEnunciado servicio;

    @Test
    void testLlamadaGitHub() {
        // Act
        Mono<Map> resultado = servicio.obtenerInfoRepositorio("google", "gson");
        
        // Assert
        // assertNotNull(resultado);
    }
}
