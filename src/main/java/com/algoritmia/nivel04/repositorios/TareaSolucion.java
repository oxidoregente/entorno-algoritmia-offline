package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Gestor de Tareas Relacionales.
 */
@Entity
@Table(name = "tarea_solucion")
public class TareaSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private ProyectoSolucion proyecto;

    public TareaSolucion() {}
    public TareaSolucion(String descripcion, ProyectoSolucion proyecto) {
        this.descripcion = descripcion;
        this.proyecto = proyecto;
    }
}
