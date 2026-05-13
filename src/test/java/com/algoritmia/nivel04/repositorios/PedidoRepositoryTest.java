package com.algoritmia.nivel04.repositorios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PedidoRepositoryTest {

    @Autowired
    private PedidoRepositoryEnunciado repository;

    @Test
    void testBusquedaAvanzada() {
        repository.save(new PedidoEnunciado(100.0, LocalDateTime.now()));
        // List<PedidoEnunciado> list = repository.findByMontoGreaterThanOrderByFechaDesc(50.0);
        // assertNotNull(list);
    }
}
