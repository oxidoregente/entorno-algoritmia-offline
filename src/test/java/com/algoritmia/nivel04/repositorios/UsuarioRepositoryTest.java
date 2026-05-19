package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Test para ejercicio de Repositorio de Usuario.
 * Valida operaciones CRUD y consultas con Spring Data JPA.
 */
@DataJpaTest
class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepositoryEnunciado repository;

    @Test
    void testUsuariosActivosRecientes() {
        LocalDateTime ayer = LocalDateTime.now().minusDays(1);
        repository.save(new UsuarioEnunciado("test@mail.com", true, LocalDateTime.now()));

        // Act
        // Object resultado = repository.findByActivoTrueAndFechaRegistroAfter(ayer);
        // assertNotNull(resultado);
    }
}
