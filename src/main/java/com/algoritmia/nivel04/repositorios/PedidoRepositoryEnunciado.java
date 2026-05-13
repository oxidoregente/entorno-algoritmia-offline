package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PedidoRepositoryEnunciado extends JpaRepository<PedidoEnunciado, Long> {
    // TODO: Buscar por monto mayor que X ordenado por fecha desc
    // List<PedidoEnunciado> findByMontoGreaterThanOrderByFechaDesc(Double monto);
}
