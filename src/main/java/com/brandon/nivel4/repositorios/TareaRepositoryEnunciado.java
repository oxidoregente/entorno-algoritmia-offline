package com.brandon.nivel4.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TareaRepositoryEnunciado extends JpaRepository<TareaEnunciado, Long> {
    // TODO: Encontrar tareas por el ID del proyecto
}
