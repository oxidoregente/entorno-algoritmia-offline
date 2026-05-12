package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CursoRepositoryEnunciado extends JpaRepository<CursoEnunciado, Long> {
    // TODO: Consulta personalizada con JPQL para contar alumnos
    // @Query("SELECT c FROM CursoEnunciado c WHERE SIZE(c.alumnos) > :minimo")
    // List<CursoEnunciado> encontrarCursosPopulares(int minimo);
}
