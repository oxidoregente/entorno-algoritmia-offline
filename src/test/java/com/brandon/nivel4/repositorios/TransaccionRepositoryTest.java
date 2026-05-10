package com.brandon.nivel4.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * @DataJpaTest configura una base de datos en memoria (H2) 
 * y escanea solo las @Entity y @Repository para pruebas rápidas.
 */
@DataJpaTest
class TransaccionRepositoryTest {

    @Autowired
    private TransaccionRepository repository;

    @Test
    void testGuardarYBuscarPorEstado() {
        // Arrange
        Transaccion t1 = new Transaccion("COMPLETADO", 150.0);
        Transaccion t2 = new Transaccion("PENDIENTE", 50.0);
        repository.save(t1);
        repository.save(t2);

        // Act
        List<Transaccion> completados = repository.findByEstado("COMPLETADO");

        // Assert
        assertNotNull(completados);
        assertEquals(1, completados.size());
        assertEquals(150.0, completados.get(0).getMonto());
    }
}
