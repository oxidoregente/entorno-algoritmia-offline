package com.brandon.nivel22.graphql;

import com.brandon.nivel4.repositorios.Transaccion;
import com.brandon.nivel4.repositorios.TransaccionRepository;
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

    private final TransaccionRepository repositorio;

    public TransaccionGraphQlController(TransaccionRepository repositorio) {
        this.repositorio = repositorio;
    }

    @QueryMapping
    public List<Transaccion> todasLasTransacciones() {
        return repositorio.findAll();
    }

    @QueryMapping
    public Transaccion transaccionPorId(@Argument Long id) {
        return repositorio.findById(id).orElse(null);
    }
}
