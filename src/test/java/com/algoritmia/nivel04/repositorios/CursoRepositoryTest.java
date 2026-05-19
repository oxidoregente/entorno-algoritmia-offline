package com.algoritmia.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Repositorio de Curso.
 * Valida consultas por categoría y duración.
 */
@DataJpaTest
class CursoRepositoryTest {

    @Autowired
    private CursoRepositoryEnunciado repository;

    @Test
    void testCursosPopulares() {
        // Act
        // List<CursoEnunciado> list = repository.encontrarCursosPopulares(5);
        // assertNotNull(list);
    }
}
