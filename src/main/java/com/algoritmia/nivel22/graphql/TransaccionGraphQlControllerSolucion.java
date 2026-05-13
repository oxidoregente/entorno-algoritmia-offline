package com.algoritmia.nivel22.graphql;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

/**
 * SOLUCIÓN: GraphQL Controller.
 */

public class TransaccionGraphQlControllerSolucion {

    private final TransaccionRepositoryEnunciado repositorio;

    public TransaccionGraphQlControllerSolucion(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    @QueryMapping
    public List<TransaccionEnunciado> todasLasTransacciones() {
        return repositorio.findAll();
    }

    @QueryMapping
    public TransaccionEnunciado transaccionPorId(@Argument Long id) {
        return repositorio.findById(id).orElse(null);
    }
}
