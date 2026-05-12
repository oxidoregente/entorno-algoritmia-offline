package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * SOLUCIÓN: Gestión de Transacciones.
 * 
 * <p>Teoría:
 * Spring Data JPA permite generar consultas SQL automáticas simplemente siguiendo
 * convenciones de nombres en los métodos de la interfaz (Query Methods).</p>
 */
@Entity
@Table(name = "transaccion_solucion")
public class TransaccionSolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;
    private Double monto;
    private LocalDateTime fecha;

    public TransaccionSolucion() {}

    public TransaccionSolucion(String estado, Double monto) {
        this.estado = estado;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getEstado() { return estado; }
    public Double getMonto() { return monto; }
    public LocalDateTime getFecha() { return fecha; }
}
