package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Gestor de Tareas Relacionales.
 */
@Entity
@Table(name = "proyecto_solucion")
public class ProyectoSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ProyectoSolucion() {}
    public ProyectoSolucion(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
