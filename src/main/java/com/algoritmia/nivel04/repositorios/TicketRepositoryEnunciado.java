package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepositoryEnunciado extends JpaRepository<TicketEnunciado, Long> {
    // TODO: Encontrar tickets por prioridad ordenados por fecha de creación descendente
    // findByPrioridadOrderByFechaCreacionDesc
}
