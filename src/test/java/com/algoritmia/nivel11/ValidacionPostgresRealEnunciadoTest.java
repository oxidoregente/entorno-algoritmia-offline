package com.algoritmia.nivel11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

/**
 * 🎓 RETO: Validación con Postgres Real.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Configura un test que use Testcontainers para validar que el sistema 
 * es capaz de persistir datos en un PostgreSQL real de Docker.</p>
 */
@SpringBootTest
@Testcontainers
class ValidacionPostgresRealEnunciadoTest {

    // TODO: Define el @Container estático de PostgreSQLContainer
    // TODO: Define el @DynamicPropertySource para inyectar las credenciales
    
    @Test
    void testConexionYPersistencia() {
        // TODO: Inserta un dato en cualquier repositorio y verifica su existencia
    }
}
