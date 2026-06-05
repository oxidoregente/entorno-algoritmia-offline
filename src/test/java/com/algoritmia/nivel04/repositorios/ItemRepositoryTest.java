package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Test para ejercicio de Repositorio de Item.
 * Valida consultas por tipo y rareza.
 */
@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepositoryEnunciado repository;

    @Test
    void testBuscarItemsAgotados() {
        repository.save(new ItemEnunciado("Laptop", 5, "Electrónica"));
        repository.save(new ItemEnunciado("Mouse", 0, "Accesorios"));

        // Act
        // TODO: implementar findByStockLessThan en el repositorio
        // List<ItemEnunciado> agotados = repository.findByStockLessThan(1);
        // assertNotNull(agotados);
        // assertEquals(1, agotados.size());
    }
}
