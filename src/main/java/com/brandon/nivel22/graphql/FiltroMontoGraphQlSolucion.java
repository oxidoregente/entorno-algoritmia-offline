package com.brandon.nivel22.graphql;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🏆 SOLUCIÓN: Filtros Complejos en GraphQL.
 */
public class FiltroMontoGraphQlSolucion {

    private final TransaccionRepositoryEnunciado repository;

    public FiltroMontoGraphQlSolucion(TransaccionRepositoryEnunciado repository) {
        this.repository = repository;
    }

    public List<TransaccionEnunciado> filtrarPorMontoMinimo(Double monto) {
        return repository.findAll().stream()
                .filter(t -> t.getMonto() >= monto)
                .collect(Collectors.toList());
    }
}
