package com.brandon.nivel22.graphql;

import com.brandon.nivel4.repositorios.TransaccionEnunciado;
import com.brandon.nivel4.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Nivel 22: GraphQL Controller.
 * 
 * Permite realizar consultas flexibles donde el cliente elige qué campos obtener.
 */
@Controller
public class TransaccionGraphQlController {

    private final TransaccionRepositoryEnunciado repositorio;

    public TransaccionGraphQlController(TransaccionRepositoryEnunciado repositorio) {
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
