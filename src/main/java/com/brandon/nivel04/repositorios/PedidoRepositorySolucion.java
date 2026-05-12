package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🏆 SOLUCIÓN: Repositorio de Pedidos con Filtros.
 */
public interface PedidoRepositorySolucion extends JpaRepository<PedidoEnunciado, Long> {
    List<PedidoEnunciado> findByMontoGreaterThanOrderByFechaDesc(Double monto);
}
