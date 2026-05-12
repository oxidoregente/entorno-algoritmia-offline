package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepositorySolucion extends JpaRepository<ItemSolucion, Long> {
    List<ItemSolucion> findByStockLessThan(Integer stockMinimo);
}
