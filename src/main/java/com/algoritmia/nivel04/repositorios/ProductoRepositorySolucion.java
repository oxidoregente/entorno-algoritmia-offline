package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepositorySolucion extends JpaRepository<ProductoSolucion, Long> {
    List<ProductoSolucion> findByPrecioLessThanAndStockGreaterThan(Double precioMax, Integer stockMin);
}
