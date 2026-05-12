package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface JugadorRepositoryEnunciado extends JpaRepository<JugadorEnunciado, Long> {
    // TODO: Implementa un Query Method para obtener los 3 jugadores con mayor puntaje
}
