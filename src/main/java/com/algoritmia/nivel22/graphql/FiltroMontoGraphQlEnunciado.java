package com.algoritmia.nivel22.graphql;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Filtros Complejos en GraphQL.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa una consulta que filtre las transacciones por un monto mínimo
 * directamente en la lógica del resolver.</p>
 */
@Controller
public class FiltroMontoGraphQlEnunciado {

    private final TransaccionRepositoryEnunciado repository;

    public FiltroMontoGraphQlEnunciado(TransaccionRepositoryEnunciado repository) {
        this.repository = repository;
    }

    @QueryMapping
    public List<TransaccionEnunciado> filtrarPorMontoMinimo(@Argument Double monto) {
        // TODO: Obtén todas las transacciones y filtra usando Streams aquellas con monto > parámetro
        return null;
    }
}
