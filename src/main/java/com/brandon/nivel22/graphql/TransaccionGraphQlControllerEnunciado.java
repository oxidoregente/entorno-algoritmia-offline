package com.brandon.nivel22.graphql;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

/**
 * RETO: GraphQL Controller.
 * 
 * Implementa los puntos de entrada para consultas flexibles.
 * El estudiante debe mapear los métodos del esquema .graphqls.
 */
@Controller
public class TransaccionGraphQlControllerEnunciado {

    private final TransaccionRepositoryEnunciado repositorio;

    public TransaccionGraphQlControllerEnunciado(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    @QueryMapping
    public List<TransaccionEnunciado> todasLasTransacciones() {
        // TODO: Implementar consulta total
        return null;
    }

    @QueryMapping
    public TransaccionEnunciado transaccionPorId(@Argument Long id) {
        // TODO: Implementar consulta por ID
        return null;
    }
}
