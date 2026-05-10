package com.brandon.nivel11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.brandon.nivel4.repositorios.Transaccion;
import com.brandon.nivel4.repositorios.TransaccionRepository;

/**
 * Nivel 11: Testing de Integración con Testcontainers.
 * 
 * <p>Este test levanta un contenedor real de PostgreSQL usando Docker.
 * Es la forma más fiable de probar que nuestra aplicación funciona con la base de datos de producción.</p>
 */
@SpringBootTest
@Testcontainers
class TestIntegracionReal {

    // Definimos el contenedor de PostgreSQL
    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine")
            .withDatabaseName("testdb")
            .withUsername("testuser")
            .withPassword("testpass");

    // Sobrescribimos las propiedades de Spring para usar el contenedor dinámico
    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

    @Autowired
    private TransaccionRepository repository;

    @Test
    void testPersistenciaEnPostgresReal() {
        // Arrange
        Transaccion t = new Transaccion("POSTGRES_REAL", 999.99);
        
        // Act
        repository.save(t);
        long count = repository.count();
        
        // Assert
        assertEquals(1, count, "Debería haber una transacción guardada en el contenedor de Postgres");
        assertEquals("POSTGRES_REAL", repository.findAll().get(0).getEstado());
    }
}
