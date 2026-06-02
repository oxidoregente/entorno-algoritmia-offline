package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Items (Inventario).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para encontrar items con stock menor a un valor dado (productos agotados o por agotarse).</p>
 * <p>Método sugerido: {@code findByStockLessThan(Integer stockMinimo)}</p>
 */
public interface ItemRepositoryEnunciado extends JpaRepository<ItemEnunciado, Long> {
    // TODO: Encontrar items con stock menor a un valor
    List<ItemEnunciado> findByStockLessThan(int stock);
}
