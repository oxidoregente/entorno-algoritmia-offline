package com.algoritmia.nivel16;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("prod")
class ProfileTest {

    @Autowired
    private ProfileConfigEnunciado profileConfig;

    @Test
    void testEsProduccion() {
        assertTrue(profileConfig.esProduccion(), "Debería detectar que el perfil 'prod' está activo");
    }
}
