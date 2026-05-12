package com.brandon.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class TicketRepositoryTest {

    @Autowired
    private TicketRepositoryEnunciado repository;

    @Test
    void testTicketsPrioritarios() {
        repository.save(new TicketEnunciado("Error base", "ALTA"));
        // Act
        // List<TicketEnunciado> tickets = repository.findByPrioridadOrderByFechaCreacionDesc("ALTA");
        // assertNotNull(tickets);
    }
}
