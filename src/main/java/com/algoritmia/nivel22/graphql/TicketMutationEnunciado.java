package com.algoritmia.nivel22.graphql;

import com.algoritmia.nivel04.repositorios.TicketEnunciado;
import com.algoritmia.nivel04.repositorios.TicketRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Mutaciones en GraphQL.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa una mutación para actualizar el estado de un ticket de soporte.</p>
 */
@Controller
public class TicketMutationEnunciado {

    private final TicketRepositoryEnunciado repository;

    public TicketMutationEnunciado(TicketRepositoryEnunciado repository) {
        this.repository = repository;
    }

    @MutationMapping
    public TicketEnunciado actualizarEstadoTicket(@Argument Long id, @Argument String nuevoEstado) {
        // TODO: Busca el ticket por ID
        // TODO: Si existe, actualiza su campo prioridad (simulado como estado) y guarda
        return null;
    }
}
