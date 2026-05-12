package com.brandon.nivel4.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.brandon.nivel4.repositorios.CartaTarotEnunciado.Arcano;

@DataJpaTest
class CartaTarotRepositoryTest {

    @Autowired
    private CartaTarotRepositoryEnunciado repository;

    @Test
    void testBuscarArcanosMayoresOrdenados() {
        repository.save(new CartaTarotEnunciado("El Loco", Arcano.MAYOR));
        repository.save(new CartaTarotEnunciado("El Mago", Arcano.MAYOR));

        // Act
        // List<CartaTarotEnunciado> mayores = repository.findByArcanoOrderByNombreAsc(Arcano.MAYOR);
        // assertNotNull(mayores);
    }
}
