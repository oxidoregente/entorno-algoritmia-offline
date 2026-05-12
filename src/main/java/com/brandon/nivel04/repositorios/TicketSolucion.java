package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * SOLUCIÓN: Repositorio de Tickets de Soporte.
 */
@Entity
@Table(name = "ticket_solucion")
public class TicketSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String prioridad;
    private LocalDateTime fechaCreacion;

    public TicketSolucion() {}
}
