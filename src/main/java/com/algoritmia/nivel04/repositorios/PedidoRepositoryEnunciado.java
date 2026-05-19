package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Pedidos.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un Query Method para buscar pedidos con monto mayor a X, ordenados por fecha descendente.</p>
 * <p>Método sugerido: {@code findByMontoGreaterThanOrderByFechaDesc(Double monto)}</p>
 */
public interface PedidoRepositoryEnunciado extends JpaRepository<PedidoEnunciado, Long> {
    // TODO: Buscar por monto mayor que X ordenado por fecha descendente
}
