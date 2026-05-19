package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.util.List;

/**
 * SOLUCIÓN: Entidad Curso.
 *
 * <p>Entidad JPA que modela un curso con título y lista de estudiantes
 * inscritos ({@link OneToMany}). La tabla se llama {@code curso_solucion}
 * para evitar conflictos con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "curso_solucion")
public class CursoSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany
    private List<EstudianteEnunciado> alumnos;

    public CursoSolucion() {}
    public CursoSolucion(String titulo) { this.titulo = titulo; }
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
}
