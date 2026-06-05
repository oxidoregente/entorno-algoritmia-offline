package com.algoritmia.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para ejercicio de Repositorio de Cliente.
 * Valida consultas por región y pedidos.
 */
@DataJpaTest
class ClienteRepositoryTest {

    @Autowired
    private ClienteRepositoryEnunciado repository;

    @Test
    void testBuscarPorNombre() {
        repository.save(new ClienteEnunciado("UsuarioPrueba"));
        // TODO: implementar findByNombre en el repositorio
        // List<ClienteEnunciado> list = repository.findByNombre("UsuarioPrueba");
        // assertNotNull(list);
    }
}
