package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * RETO: Repositorio de Tickets de Soporte.
 */
@Entity
public class TicketEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String prioridad; // "ALTA", "MEDIA", "BAJA"
    private LocalDateTime fechaCreacion;

    public TicketEnunciado() {}
    public TicketEnunciado(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now();
    }
    public Long getId() { return id; }
}
