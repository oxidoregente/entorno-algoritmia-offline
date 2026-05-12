package com.brandon.nivel22.graphql;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransaccionGraphQlTest {

    @Autowired
    private TransaccionGraphQlControllerEnunciado controller;

    @Test
    void testQueryTodasLasTransacciones() {
        // Act
        // Object resultado = controller.todasLasTransacciones();
        // assertNotNull(resultado);
    }
}
