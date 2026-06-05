package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Pedido.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un pedido de un ecommerce con el monto total y la fecha en que se
 * realizó. El repositorio asociado permitirá filtrar pedidos por importe
 * mínimo y ordenarlos cronológicamente para mostrarlos en un dashboard.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code monto}: importe total del pedido ({@link Double}).</li>
 *   <li>{@code fecha}: marca temporal en que se realizó el pedido ({@link LocalDateTime}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new PedidoEnunciado(150.0, LocalDateTime.now().minusDays(2)));
 * repository.save(new PedidoEnunciado( 50.0, LocalDateTime.now().minusDays(1)));
 * repository.save(new PedidoEnunciado(300.0, LocalDateTime.now()));
 *
 * // findByMontoGreaterThanOrderByFechaDesc(100.0)
 * // -&gt; [Pedido(300, hoy), Pedido(150, hace 2 días)]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 *   <li>En aplicaciones reales se usaría {@code BigDecimal} para evitar errores de redondeo.</li>
 * </ul>
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
