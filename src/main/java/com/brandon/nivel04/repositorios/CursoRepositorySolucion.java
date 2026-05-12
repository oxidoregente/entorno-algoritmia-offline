package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * 🏆 SOLUCIÓN: Repositorio de Cursos.
 */
public interface CursoRepositorySolucion extends JpaRepository<CursoEnunciado, Long> {
    @Query("SELECT c FROM CursoEnunciado c WHERE SIZE(c.alumnos) > ?1")
    List<CursoEnunciado> encontrarCursosPopulares(int minimo);
}
