package com.brandon.nivel4.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.brandon.nivel4.repositorios.CartaTarot.Arcano;

/**
 * Test de persistencia para CartaTarotRepository.
 */
@DataJpaTest
class CartaTarotRepositoryTest {

    @Autowired
    private CartaTarotRepository repository;

    @Test
    void testBuscarArcanosMayoresOrdenados() {
        // Arrange
        repository.save(new CartaTarot("El Loco", Arcano.MAYOR, "Nuevos comienzos"));
        repository.save(new CartaTarot("El Mago", Arcano.MAYOR, "Poder de manifestación"));
        repository.save(new CartaTarot("As de Copas", Arcano.MENOR, "Nuevas emociones"));
        repository.save(new CartaTarot("La Sacerdotisa", Arcano.MAYOR, "Intuición"));

        // Act
        List<CartaTarot> mayores = repository.findByArcanoOrderByNombreAsc(Arcano.MAYOR);

        // Assert
        assertEquals(3, mayores.size(), "Deberían haber 3 Arcanos Mayores");
        assertEquals("El Loco", mayores.get(0).getNombre(), "El primero alfabéticamente debería ser El Loco");
        assertEquals("La Sacerdotisa", mayores.get(2).getNombre(), "El último debería ser La Sacerdotisa");
    }
}
