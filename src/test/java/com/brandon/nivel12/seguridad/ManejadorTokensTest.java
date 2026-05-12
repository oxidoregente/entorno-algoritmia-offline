package com.brandon.nivel12.seguridad;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ManejadorTokensTest {

    @Mock
    private JwtUtil jwtUtil;

    @InjectMocks
    private ManejadorTokensEnunciado manejador;

    @Test
    void testAdminValido() {
        String token = "dummy-token";
        when(jwtUtil.validarToken(token)).thenReturn(true);
        when(jwtUtil.obtenerUsuario(token)).thenReturn("admin");

        boolean esAdmin = manejador.esAdminValido(token);
        // assertTrue(esAdmin);
    }

    @Test
    void testUsuarioNoAdminFalla() {
        String token = "dummy-token";
        when(jwtUtil.validarToken(token)).thenReturn(true);
        when(jwtUtil.obtenerUsuario(token)).thenReturn("user");

        boolean esAdmin = manejador.esAdminValido(token);
        assertFalse(esAdmin);
    }
}
