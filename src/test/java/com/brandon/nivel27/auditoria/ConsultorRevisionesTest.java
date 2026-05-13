package com.brandon.nivel27.auditoria;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import jakarta.persistence.EntityManager;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConsultorRevisionesTest {

    @Autowired(required = false)
    private ConsultorRevisionesEnunciado consultor;

    @Test
    void testServicioCargado() {
        // assertNotNull(consultor);
    }
}
