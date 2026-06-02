package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Productos.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar productos con precio menor a X y stock mayor a 0.</p>
 * <p>Método sugerido: {@code findByPrecioLessThanAndStockGreaterThan(Double precio, Integer stock)}</p>
 */
public interface ProductoRepositoryEnunciado extends JpaRepository<ProductoEnunciado, Long> {
    // TODO: Busca productos con precio menor a X y stock mayor a 0
    List<ProductoEnunciado> findByPrecioLessThanAndStockGreaterThan(double precio, int stock);
}
