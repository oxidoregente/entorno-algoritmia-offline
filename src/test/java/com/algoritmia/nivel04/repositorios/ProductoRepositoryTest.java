package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ProductoRepositoryTest {

    @Autowired
    private ProductoRepositoryEnunciado repository;

    @Test
    void testBusquedaFiltros() {
        repository.save(new ProductoEnunciado("Laptop", 1000.0, 5));
        repository.save(new ProductoEnunciado("Mouse", 20.0, 0)); // Sin stock

        // Act
        // Object resultado = repository.findByPrecioLessThanAndStockGreaterThan(100.0, 0);
        // assertNotNull(resultado);
    }
}
