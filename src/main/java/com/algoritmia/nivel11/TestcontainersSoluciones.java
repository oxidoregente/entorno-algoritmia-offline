package com.algoritmia.nivel11;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.RabbitMQContainer;

/**
 * 🏆 SOLUCIONES: Nivel 11 - Testcontainers.
 */
public class TestcontainersSoluciones {

    // Ex 1: Postgres
    /*
    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine")
            .withDatabaseName("testdb")
            .withUsername("user")
            .withPassword("pass");
    */

    // Ex 2: Redis
    /*
    @Container
    static GenericContainer<?> redis = new GenericContainer<>("redis:7-alpine")
            .withExposedPorts(6379);
    */

    // Ex 3: RabbitMQ
    /*
    @Container
    static RabbitMQContainer rabbit = new RabbitMQContainer("rabbitmq:3-management-alpine");
    */

    // Ex 4: Dynamic Properties
    /*
    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }
    */

    // Ex 5: Singleton Pattern
    /*
    public abstract class AbstractIntegrationTest {
        static final PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine");
        static {
            postgres.start();
        }
    }
    */
}
