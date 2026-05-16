package com.algoritmia.nivel12.seguridad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServicioUsuariosTest {

    @Autowired
    private ServicioUsuariosEnunciado servicio;

    @Test
    void testLoadUserAdmin() {
        try {
            UserDetails user = servicio.loadUserByUsername("admin@algoritmia.com");
            assertNotNull(user);
            assertEquals("admin@algoritmia.com", user.getUsername());
            assertTrue(user.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN")));
        } catch (Exception e) {
            // Fallará si no está implementado
            fail("Excepción lanzada: " + e.getMessage());
        }
    }

    @Test
    void testLoadUserNotFound() {
        assertThrows(UsernameNotFoundException.class, () -> {
            servicio.loadUserByUsername("desconocido@example.com");
        });
    }
}
