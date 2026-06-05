package com.algoritmia.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Repositorio de Estudiante.
 * Valida consultas por GPA y cursos.
 */
@DataJpaTest
class EstudianteRepositoryTest {

    @Autowired
    private EstudianteRepositoryEnunciado repository;

    @Test
    void testBusquedaPorDominio() {
        repository.save(new EstudianteEnunciado("brandon@ingenieria.edu"));
        // TODO: implementar findByEmailEndingWith en el repositorio
        // List<EstudianteEnunciado> list = repository.findByEmailEndingWith(".edu");
        // assertNotNull(list);
    }
}
