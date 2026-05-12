package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Cursos con Conteo de Relaciones.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Utiliza una consulta personalizada (@Query) para encontrar cursos 
 * que tengan más de N estudiantes inscritos.</p>
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
