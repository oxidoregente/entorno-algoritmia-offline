package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Tarea (Relación Many-to-One).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela una tarea asociada a un proyecto mediante una relación @ManyToOne.
 * Debes añadir la relación y el repositorio deberá consultar tareas por ID de proyecto.</p>
 */
@Entity
public class TareaEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    // TODO: Añadir relación @ManyToOne con ProyectoEnunciado
    // private ProyectoEnunciado proyecto;

    public TareaEnunciado() {}
    public TareaEnunciado(String descripcion) { this.descripcion = descripcion; }
    public Long getId() { return id; }
    public String getDescripcion() { return descripcion; }
}
