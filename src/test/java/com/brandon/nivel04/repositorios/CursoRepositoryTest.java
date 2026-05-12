package com.brandon.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

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
