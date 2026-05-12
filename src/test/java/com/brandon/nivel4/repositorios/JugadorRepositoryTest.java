package com.brandon.nivel4.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class JugadorRepositoryTest {

    @Autowired
    private JugadorRepositoryEnunciado repository;

    @Test
    void testTopJugadores() {
        repository.save(new JugadorEnunciado("Brandon", 100));
        repository.save(new JugadorEnunciado("Ana", 500));
        repository.save(new JugadorEnunciado("Carlos", 300));
        repository.save(new JugadorEnunciado("Zulema", 900));

        // Act
        // List<JugadorEnunciado> top = repository.findTop3ByOrderByPuntajeDesc();
        // assertEquals(3, top.size());
        // assertEquals("Zulema", top.get(0).getNickname());
    }
}
