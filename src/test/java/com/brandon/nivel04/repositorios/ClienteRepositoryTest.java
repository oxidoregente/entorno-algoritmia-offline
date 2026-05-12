package com.brandon.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClienteRepositoryTest {

    @Autowired
    private ClienteRepositoryEnunciado repository;

    @Test
    void testBuscarPorNombre() {
        repository.save(new ClienteEnunciado("Brandon"));
        // List<ClienteEnunciado> list = repository.findByNombre("Brandon");
        // assertNotNull(list);
    }
}
