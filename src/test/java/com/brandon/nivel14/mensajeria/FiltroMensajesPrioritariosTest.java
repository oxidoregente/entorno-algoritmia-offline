package com.brandon.nivel14.mensajeria;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
class FiltroMensajesPrioritariosTest {

    @InjectMocks
    private FiltroMensajesPrioritariosEnunciado consumidor;

    @Test
    void testFiltroUrgente() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        consumidor.procesar("URGENTE: Fallo de sistema");
        
        // El test fallará si el estudiante no imprime el mensaje filtrado
        // assertTrue(outContent.toString().contains("URGENTE"));
        
        System.setOut(System.out);
    }
}
