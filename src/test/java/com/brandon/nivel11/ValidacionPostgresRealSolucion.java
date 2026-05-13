package com.brandon.nivel11;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * 🏆 SOLUCIÓN: Validación con Postgres Real.
 */
public class ValidacionPostgresRealSolucion {

    // Esta clase no es un test ejecutable, sino un contenedor de la lógica de solución
    // para que el estudiante la consulte.
    
    /*
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine");

    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }
    */
}
