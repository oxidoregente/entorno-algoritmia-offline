package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Repositorio de Estudiantes con Pattern Matching.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un Query Method para buscar estudiantes cuyo correo termine 
 * en un dominio específico.</p>
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
