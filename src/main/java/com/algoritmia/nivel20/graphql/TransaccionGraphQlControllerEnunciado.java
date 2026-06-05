package com.algoritmia.nivel20.graphql;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

/**
 * 🎓 RETO: GraphQL Controller de Transacciones.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa los puntos de entrada (Query resolvers) para consultar
 * transacciones a través de GraphQL.</p>
 *
 * <p>El estudiante debe mapear los métodos del esquema {@code .graphqls}
 * para exponer consultas como {@code todasLasTransacciones} y
 * {@code transaccionPorId}.</p>
 *
 * <h3>Example:</h3>
 * <pre>
 * query {
 *   todasLasTransacciones { id monto }
 *   transaccionPorId(id: 1) { id monto estado }
 * }
 * </pre>
 */
@Controller
public class TransaccionGraphQlControllerEnunciado {

    private final TransaccionRepositoryEnunciado repositorio;

    public TransaccionGraphQlControllerEnunciado(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Retorna todas las transacciones registradas.
     *
     * @return Lista completa de transacciones.
     */
    @QueryMapping
    public List<TransaccionEnunciado> todasLasTransacciones() {
        // TODO: Implementar consulta total
        return null;
    }

    /**
     * Busca una transacción por su identificador único.
     *
     * @param id Identificador de la transacción.
     * @return Transacción encontrada o null si no existe.
     */
    @QueryMapping
    public TransaccionEnunciado transaccionPorId(@Argument Long id) {
        // TODO: Implementar consulta por ID
        return null;
    }
}
