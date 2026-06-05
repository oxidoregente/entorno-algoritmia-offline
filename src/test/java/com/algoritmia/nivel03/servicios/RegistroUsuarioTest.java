package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import com.algoritmia.nivel02.logica.ValidadorEmailEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado.NivelSeguridad;

/**
 * Test para el Servicio de Registro de Usuarios.
 * Valida la composición de beans y publicación de eventos.
 */
@ExtendWith(MockitoExtension.class)
class RegistroUsuarioTest {

    @Mock private ValidadorEmailEnunciado validadorEmail;
    @Mock private ValidadorSeguridadPassEnunciado validadorPassword;
    @Mock private ApplicationEventPublisher publicadorEventos;

    @InjectMocks
    private RegistroUsuarioEnunciado servicio;

    @Test
    void testRegistroExitoso() {
        when(validadorEmail.esEmailValido("ana@empresa.com")).thenReturn(true);
        when(validadorPassword.evaluar("Clave123!")).thenReturn(NivelSeguridad.FUERTE);

        boolean resultado = servicio.registrarUsuario("ana@empresa.com", "Clave123!");

        assertTrue(resultado);
        verify(publicadorEventos).publishEvent(anyString());
    }

    @Test
    void testRegistroFallidoPorEmail() {
        when(validadorEmail.esEmailValido("invalido")).thenReturn(false);

        boolean resultado = servicio.registrarUsuario("invalido", "Clave123!");

        assertFalse(resultado);
        verifyNoInteractions(publicadorEventos);
    }

    @Test
    void testRegistroFallidoPorPassword() {
        when(validadorEmail.esEmailValido("ana@empresa.com")).thenReturn(true);
        when(validadorPassword.evaluar("123")).thenReturn(NivelSeguridad.DEBIL);

        boolean resultado = servicio.registrarUsuario("ana@empresa.com", "123");

        assertFalse(resultado);
        verifyNoInteractions(publicadorEventos);
    }
}
