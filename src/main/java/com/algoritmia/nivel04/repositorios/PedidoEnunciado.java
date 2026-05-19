package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Pedido.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un pedido con monto y fecha. El repositorio asociado deberá filtrar
 * pedidos con monto superior a X y ordenarlos por fecha descendente.</p>
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
