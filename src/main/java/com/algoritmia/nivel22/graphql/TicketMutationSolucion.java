package com.algoritmia.nivel22.graphql;

import com.algoritmia.nivel04.repositorios.TicketEnunciado;
import com.algoritmia.nivel04.repositorios.TicketRepositoryEnunciado;

/**
 * 🏆 SOLUCIÓN: Mutaciones en GraphQL.
 */
public class TicketMutationSolucion {

    private final TicketRepositoryEnunciado repository;

    public TicketMutationSolucion(TicketRepositoryEnunciado repository) {
        this.repository = repository;
    }

    public TicketEnunciado actualizarEstadoTicket(Long id, String nuevoEstado) {
        return repository.findById(id)
                .map(ticket -> {
                    // En este reto usamos prioridad como campo de estado simulado
                    // ticket.setPrioridad(nuevoEstado); // Asumiendo que existe el setter
                    return repository.save(ticket);
                }).orElse(null);
    }
}
