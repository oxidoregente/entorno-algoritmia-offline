package com.algoritmia.nivel18.automatizacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class VerificadorConexionTest {

    @InjectMocks
    private VerificadorConexionEnunciado verificador;

    @Test
    void testEjecucionSinErrores() {
        // El test verifica que el método no lance excepciones al ser invocado manualmente
        assertDoesNotThrow(() -> verificador.verificar());
    }
}
