package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Gestor de Tareas Relacionales.
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
