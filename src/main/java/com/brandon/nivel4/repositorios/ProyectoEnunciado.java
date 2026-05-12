package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Gestor de Tareas Relacionales.
 */
@Entity
public class ProyectoEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ProyectoEnunciado() {}
    public ProyectoEnunciado(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
