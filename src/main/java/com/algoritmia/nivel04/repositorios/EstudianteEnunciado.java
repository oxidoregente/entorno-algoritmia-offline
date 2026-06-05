package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Estudiante (pattern matching por email).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un estudiante de una plataforma educativa identificado por su
 * email. Es el punto de partida para hacer búsquedas por dominio del correo
 * (p. ej. todos los estudiantes con email corporativo de una universidad).</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code email}: dirección de correo (cadena libre).</li>
 *   <li>No se exponen getters: la entidad se usa principalmente para persistencia.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new EstudianteEnunciado("ana@uam.es"));
 * repository.save(new EstudianteEnunciado("luis@gmail.com"));
 * repository.save(new EstudianteEnunciado("eva@uam.es"));
 *
 * // findByEmailEndingWith("@uam.es") -&gt; [ana@uam.es, eva@uam.es]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 *   <li>También se usa como entidad asociada en {@code CursoEnunciado.alumnos}.</li>
 * </ul>
 */
@Entity
public class EstudianteEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public EstudianteEnunciado() {}
    public EstudianteEnunciado(String email) { this.email = email; }
}
