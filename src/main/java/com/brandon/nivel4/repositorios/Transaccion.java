package com.brandon.nivel4.repositorios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

/**
 * Nivel 4: Persistencia con Spring Data JPA.
 * 
 * @Entity marca esta clase para que JPA la mapee a una tabla en la base de datos.
 */
@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;
    private Double monto;
    private LocalDateTime fecha;

    // Constructor vacío requerido por JPA
    public Transaccion() {}

    public Transaccion(String estado, Double monto) {
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
