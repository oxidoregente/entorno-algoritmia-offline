package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class LogAccesoRepositoryTest {

    @Autowired
    private LogAccesoRepositoryEnunciado repository;

    @Test
    void testBuscarLogsPorRango() {
        LocalDateTime ahora = LocalDateTime.now();
        repository.save(new LogAccesoEnunciado("192.168.1.1", ahora.minusDays(1)));
        repository.save(new LogAccesoEnunciado("10.0.0.1", ahora));

        // Act
        // List<LogAccesoEnunciado> logs = repository.findByFechaAccesoBetween(ahora.minusHours(1), ahora.plusHours(1));
        // assertNotNull(logs);
    }
}
