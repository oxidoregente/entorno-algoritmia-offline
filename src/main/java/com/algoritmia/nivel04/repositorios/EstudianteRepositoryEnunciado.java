package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EstudianteRepositoryEnunciado extends JpaRepository<EstudianteEnunciado, Long> {
    // TODO: Buscar estudiantes cuyo email termine en X
    // List<EstudianteEnunciado> findByEmailEndingWith(String dominio);
}
