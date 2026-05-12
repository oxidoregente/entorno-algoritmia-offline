package com.brandon.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CocheRepositoryTest {

    @Autowired
    private CocheRepositoryEnunciado repository;

    @Test
    void testConteoPorMarca() {
        repository.save(new CocheEnunciado("Toyota", "Corolla"));
        repository.save(new CocheEnunciado("Toyota", "Yaris"));
        
        // long count = repository.countByMarca("Toyota");
        // assertEquals(2, count);
    }
}
