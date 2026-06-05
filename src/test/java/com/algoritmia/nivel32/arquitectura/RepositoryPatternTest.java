package com.algoritmia.nivel32.arquitectura;

import static org.junit.jupiter.api.Assertions.*;
import com.algoritmia.nivel32.arquitectura.RepositoryPatternEnunciado.RepositorioUsuarioEnMemoria;
import com.algoritmia.nivel32.arquitectura.RepositoryPatternEnunciado.Usuario;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import java.util.UUID;

class RepositoryPatternTest {

    @Test
    void testGuardarYBuscar() {
        RepositorioUsuarioEnMemoria repo = new RepositorioUsuarioEnMemoria();
        Usuario ana = new Usuario(UUID.randomUUID(), "Ana", "ana@mail.com");

        repo.guardar(ana);
        Optional<Usuario> encontrado = repo.buscarPorId(ana.id());

        assertTrue(encontrado.isPresent());
        assertEquals("Ana", encontrado.get().nombre());
    }

    @Test
    void testEliminar() {
        RepositorioUsuarioEnMemoria repo = new RepositorioUsuarioEnMemoria();
        Usuario ana = new Usuario(UUID.randomUUID(), "Ana", "ana@mail.com");

        repo.guardar(ana);
        repo.eliminar(ana.id());
        assertTrue(repo.buscarPorId(ana.id()).isEmpty());
    }
}
