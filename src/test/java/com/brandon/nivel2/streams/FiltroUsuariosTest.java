package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.FiltroUsuariosEnunciado.Usuario;

class FiltroUsuariosTest {

    @Test
    void testFiltroUsuariosMayores() {
        List<Usuario> usuarios = List.of(
            new Usuario("Zulema", 25, "zule@mail.com"),
            new Usuario("Brandon", 20, "brandon@mail.com"),
            new Usuario("Ana", 15, "ana@mail.com"),
            new Usuario("Carlos", 30, "carlos@mail.com")
        );
        FiltroUsuariosEnunciado filtro = new FiltroUsuariosEnunciado();

        List<String> emails = filtro.obtenerEmailsUsuariosMayores(usuarios);

        // Assert: Solo 3 mayores, ordenados por nombre: Brandon, Carlos, Zulema
        assertEquals(3, emails.size());
        assertEquals("brandon@mail.com", emails.get(0));
        assertEquals("carlos@mail.com", emails.get(1));
        assertEquals("zule@mail.com", emails.get(2));
    }
}
