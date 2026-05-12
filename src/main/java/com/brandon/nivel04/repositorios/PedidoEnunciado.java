package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Repositorio de Pedidos con Filtros.
 * <b>Dificultad: Media</b>
 * 
 * <p>Busca pedidos con un monto superior a X y ordénalos por fecha descendente.</p>
 */
@Entity
public class PedidoEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double monto;
    private LocalDateTime fecha;

    public PedidoEnunciado() {}
    public PedidoEnunciado(Double monto, LocalDateTime fecha) { this.monto = monto; this.fecha = fecha; }
}
