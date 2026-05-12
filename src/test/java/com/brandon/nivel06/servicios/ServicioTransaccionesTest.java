package com.brandon.nivel06.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import com.brandon.nivel06.dto.TransaccionDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class ServicioTransaccionesTest {

    @Mock
    private TransaccionRepositoryEnunciado repository;

    @InjectMocks
    private ServicioTransaccionesEnunciado servicio;

    @Test
    void testObtenerHistorialDTO() {
        TransaccionEnunciado t = new TransaccionEnunciado("OK", 100.0);
        lenient().when(repository.findAll()).thenReturn(List.of(t));

        List<TransaccionDTO> resultados = servicio.obtenerHistorialSeguro();

        // assertNotNull(resultados);
        // assertEquals(1, resultados.size());
    }
}
