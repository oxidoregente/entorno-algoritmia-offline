package com.brandon.nivel04.repositorios;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class EmpresaRepositoryTest {

    @Autowired
    private EmpresaRepositoryEnunciado repository;

    @Test
    void testBuscarPorCiudad() {
        // repository.save(new EmpresaEnunciado("Tech", new DireccionEnunciado("Calle 1", "Medellin")));
        
        // Act
        // List<EmpresaEnunciado> resultado = repository.findByDireccionCiudad("Medellin");
        // assertNotNull(resultado);
    }
}
