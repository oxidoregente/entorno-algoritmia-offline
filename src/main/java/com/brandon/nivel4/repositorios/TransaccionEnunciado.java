package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * RETO: Gestión de Transacciones.
 * 
 * Implementa la persistencia para una entidad financiera.
 * El estudiante debe definir las anotaciones JPA básicas y 
 * el Query Method en el repositorio.
 */
@Entity
public class TransaccionEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;
    private Double monto;
    private LocalDateTime fecha;

    public TransaccionEnunciado() {}

    public TransaccionEnunciado(String estado, Double monto) {
        this.estado = estado;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public LocalDateTime getFecha() { return fecha; }
}
