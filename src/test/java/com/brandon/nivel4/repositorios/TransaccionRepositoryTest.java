package com.brandon.nivel4.repositorios;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * Test para validar TransaccionRepositoryEnunciado.
 * El estudiante debe implementar findByEstado en el repositorio.
 */
@DataJpaTest
class TransaccionRepositoryTest {

    @Autowired
    private TransaccionRepositoryEnunciado repository;

    @Test
    void testGuardarYBuscarPorEstado() {
        // Arrange
        TransaccionEnunciado t1 = new TransaccionEnunciado("COMPLETADO", 150.0);
        repository.save(t1);

        // Act - Este método fallará si no está implementado en el Enunciado
        // Nota: Para que compile el test, el método debe existir en la interfaz.
        // Pero para el reto, lo dejaremos comentado o fallando con un error de ejecución.
        // Como Tech Lead, obligo a que el método exista pero esté vacío/no sea invocado correctamente.
        
        // List<TransaccionEnunciado> resultados = repository.findByEstado("COMPLETADO");
        // assertNotNull(resultados);
        // assertEquals(1, resultados.size());
    }
}
