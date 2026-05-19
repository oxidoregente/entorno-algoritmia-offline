package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Items.
 *
 * <p>Repository JPA para la entidad ItemSolucion con consultas derivadas.</p>
 */
public interface ItemRepositorySolucion extends JpaRepository<ItemSolucion, Long> {
    List<ItemSolucion> findByStockLessThan(Integer stockMinimo);
}
