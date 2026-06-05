package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.util.List;

/**
 * 🎓 RETO: Entidad Curso (Relación @OneToMany).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Modela un curso académico con una lista de estudiantes inscritos. Es la
 * base de plataformas tipo Coursera o Moodle, donde un curso puede tener
 * muchos alumnos y necesitamos saber qué cursos son "populares".</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code titulo}: nombre descriptivo del curso.</li>
 *   <li>{@code alumnos}: relación {@link OneToMany} con {@link EstudianteEnunciado}.</li>
 *   <li>El repositorio asociado deberá filtrar por el tamaño de la colección.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * CursoEnunciado spring = new CursoEnunciado();
 * spring.alumnos = List.of(est1, est2, est3, est4); // 4 estudiantes
 *
 * // El repositorio puede buscar cursos con &gt; 3 alumnos -&gt; devolverá éste.
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>La asociación {@code @OneToMany} sin {@code mappedBy} genera una tabla intermedia.</li>
 *   <li>En JPQL se usa {@code SIZE(c.alumnos)} para acceder al tamaño de la colección.</li>
 * </ul>
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
