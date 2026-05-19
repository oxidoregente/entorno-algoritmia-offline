package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.util.List;

/**
 * 🎓 RETO: Entidad Curso (Conteo de Relaciones).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Modela un curso con una lista de estudiantes inscritos. El repositorio asociado deberá
 * utilizar una consulta JPQL personalizada para encontrar cursos con más de N estudiantes.</p>
 */
@Entity
public class CursoEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany
    private List<EstudianteEnunciado> alumnos;

    public CursoEnunciado() {}
}
