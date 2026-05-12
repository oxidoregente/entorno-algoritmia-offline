package com.brandon.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepositoryEnunciado extends JpaRepository<ProductoEnunciado, Long> {
    // TODO: Busca productos cuyo precio sea MENOR a X y tengan stock MAYOR a 0
    // findByPrecioLessThanAndStockGreaterThan
}
