package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Cursos (@Query JPQL).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa una consulta personalizada con @Query y JPQL para encontrar cursos
 * que tengan más de N estudiantes inscritos (basado en el tamaño de la colección).</p>
 * <p>Consulta sugerida: {@code @Query("SELECT c FROM CursoEnunciado c WHERE SIZE(c.alumnos) > :minimo")}</p>
 */
public interface CursoRepositoryEnunciado extends JpaRepository<CursoEnunciado, Long> {
    // TODO: Consulta JPQL para encontrar cursos populares
}
