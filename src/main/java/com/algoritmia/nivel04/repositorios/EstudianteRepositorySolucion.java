package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🏆 SOLUCIÓN: Repositorio de Estudiantes.
 */
public interface EstudianteRepositorySolucion extends JpaRepository<EstudianteEnunciado, Long> {
    List<EstudianteEnunciado> findByEmailEndingWith(String dominio);
}
