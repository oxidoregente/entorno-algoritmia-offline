package com.algoritmia.nivel20.graphql;

import com.algoritmia.nivel04.repositorios.TicketEnunciado;
import com.algoritmia.nivel04.repositorios.TicketRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Mutaciones en GraphQL.
 * <b>Dificultad: Media</b>
 *
 * <p>En un sistema de soporte, cuando un agente cierra un ticket o cambia su
 * prioridad, el cliente envía una mutación a GraphQL. El backend localiza la
 * entidad, modifica el campo afectado y persiste el cambio. Es la operación
 * de escritura del esquema (a diferencia de Query que es de lectura).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>@MutationMapping</code> para exponer la operación como Mutation.</li>
 *   <li>Cada <code>@Argument</code> se mapea a un parámetro de la mutación GraphQL.</li>
 *   <li>Si el recurso no existe, debes decidir entre lanzar una excepción o devolver <code>null</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Mutación GraphQL
 * mutation { actualizarEstadoTicket(id: 1, nuevoEstado: "CERRADO") { id prioridad } }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>repository.findById(id).orElse(null)</code> para localizar el ticket.</li>
 *   <li>Modifica el campo y guarda con <code>repository.save(ticket)</code>.</li>
 * </ul>
 */
@Controller
public class TicketMutationEnunciado {

    private final TicketRepositoryEnunciado repository;

    public TicketMutationEnunciado(TicketRepositoryEnunciado repository) {
        this.repository = repository;
    }

    /**
     * Actualiza el estado/prioridad de un ticket existente.
     *
     * @param id Identificador del ticket a modificar.
     * @param nuevoEstado Nuevo valor de prioridad/estado a aplicar.
     * @return Ticket actualizado, o {@code null} si el id no existe o la implementación no está lista.
     */
    @MutationMapping
    public TicketEnunciado actualizarEstadoTicket(@Argument Long id, @Argument String nuevoEstado) {
        // TODO: Busca el ticket por ID
        // TODO: Si existe, actualiza su campo prioridad (simulado como estado) y guarda
        return null;
    }
}
