package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * SOLUCIÓN: Entidad Pedido.
 *
 * <p>Entidad JPA que modela un pedido con monto y fecha.
 * La tabla se llama {@code pedido_solucion} para evitar conflictos
 * con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "pedido_solucion")
public class PedidoSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double monto;
    private LocalDateTime fecha;

    public PedidoSolucion() {}
    public PedidoSolucion(Double monto, LocalDateTime fecha) { this.monto = monto; this.fecha = fecha; }
    public Long getId() { return id; }
    public Double getMonto() { return monto; }
    public LocalDateTime getFecha() { return fecha; }
}
