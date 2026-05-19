package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Entidad Estudiante.
 *
 * <p>Entidad JPA que modela un estudiante con email.
 * La tabla se llama {@code estudiante_solucion} para evitar conflictos
 * con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "estudiante_solucion")
public class EstudianteSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public EstudianteSolucion() {}
    public EstudianteSolucion(String email) { this.email = email; }
    public Long getId() { return id; }
    public String getEmail() { return email; }
}
