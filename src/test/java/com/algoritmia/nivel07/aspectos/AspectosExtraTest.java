package com.algoritmia.nivel07.aspectos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AspectosExtraTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testManejadorTiempoBeanExists() {
        assertTrue(context.containsBean("manejadorTiempoEjecucionEnunciado"), 
            "El bean ManejadorTiempoEjecucionEnunciado no existe");
    }

    @Test
    void testInterceptadorErroresBeanExists() {
        assertTrue(context.containsBean("interceptadorErroresEnunciado"), 
            "El bean InterceptadorErroresEnunciado no existe");
    }
}
