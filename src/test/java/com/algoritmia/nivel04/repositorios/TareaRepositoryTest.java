package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Test para ejercicio de Repositorio de Tarea.
 * Valida consultas por estado y fecha límite.
 */
@DataJpaTest
class TareaRepositoryTest {

    @Autowired
    private TareaRepositoryEnunciado repository;

    @Test
    void testTareasPorProyecto() {
        // Arrange
        // ProyectoEnunciado p = new ProyectoEnunciado("Ecommerce");
        // TareaEnunciado t = new TareaEnunciado("Crear API");
        // repository.save(t);

        // Act
        // TODO: implementar findByProyectoId en el repositorio
        // List<TareaEnunciado> tareas = repository.findByProyectoId(1L);
        // assertNotNull(tareas);
    }
}
