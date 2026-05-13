package com.algoritmia.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepositoryEnunciado repository;

    @Test
    void testBuscarItemsAgotados() {
        repository.save(new ItemEnunciado("Laptop", 5, "Electrónica"));
        repository.save(new ItemEnunciado("Mouse", 0, "Accesorios"));

        // Act
        // List<ItemEnunciado> agotados = repository.findByStockLessThan(1);
        // assertNotNull(agotados);
        // assertEquals(1, agotados.size());
    }
}
