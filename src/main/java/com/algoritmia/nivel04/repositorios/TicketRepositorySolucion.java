package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepositorySolucion extends JpaRepository<TicketSolucion, Long> {
    List<TicketSolucion> findByPrioridadOrderByFechaCreacionDesc(String prioridad);
}
