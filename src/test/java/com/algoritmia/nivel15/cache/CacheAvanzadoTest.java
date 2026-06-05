package com.algoritmia.nivel15.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test para ejercicio de Cache Avanzado.
 * Valida configuración de caché en Spring.
 */
@SpringBootTest
class CacheAvanzadoTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testBeansExisten() {
        assertTrue(context.containsBean("gestorCacheManualEnunciado"));
        assertTrue(context.containsBean("cacheInvalidadorEnunciado"));
        assertTrue(context.containsBean("cacheCondicionalEnunciado"));
        assertTrue(context.containsBean("cachePutEnunciado"));
    }
}
