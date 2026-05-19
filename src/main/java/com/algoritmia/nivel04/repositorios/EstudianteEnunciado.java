package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Estudiante (Pattern Matching).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un estudiante con email. El repositorio asociado deberá buscar
 * estudiantes cuyo correo termine en un dominio específico (pattern matching).</p>
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
