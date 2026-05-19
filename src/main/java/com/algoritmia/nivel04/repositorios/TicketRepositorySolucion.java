package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Tickets.
 *
 * <p>Repository JPA para la entidad TicketSolucion con consultas derivadas.</p>
 */
public interface TicketRepositorySolucion extends JpaRepository<TicketSolucion, Long> {
    List<TicketSolucion> findByPrioridadOrderByFechaCreacionDesc(String prioridad);
}
