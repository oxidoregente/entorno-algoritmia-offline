package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Tickets.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para encontrar tickets por prioridad ordenados por fecha de creación descendente.</p>
 * <p>Método sugerido: {@code findByPrioridadOrderByFechaCreacionDesc(String prioridad)}</p>
 */
public interface TicketRepositoryEnunciado extends JpaRepository<TicketEnunciado, Long> {
    // TODO: Encontrar tickets por prioridad ordenados por fecha descendente
    List<TicketEnunciado> findByPrioridadOrderByFechaCreacionDesc(String prioridad);
}
