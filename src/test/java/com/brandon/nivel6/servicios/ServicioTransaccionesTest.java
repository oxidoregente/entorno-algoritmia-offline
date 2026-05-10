package com.brandon.nivel6.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import com.brandon.nivel4.repositorios.Transaccion;
import com.brandon.nivel4.repositorios.TransaccionRepository;
import com.brandon.nivel6.dto.TransaccionDTO;
import com.brandon.nivel6.excepciones.ErrorDeNegocioException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

/**
 * Test para el Nivel 6: Arquitectura Profesional.
 * Aquí usamos Mockito para probar el servicio sin necesidad de una base de datos real.
 */
@ExtendWith(MockitoExtension.class)
class ServicioTransaccionesTest {

    @Mock
    private TransaccionRepository repository;

    @InjectMocks
    private ServicioTransacciones servicio;

    @Test
    void testObtenerHistorialSeguroExitoso() {
        // Arrange
        Transaccion t = new Transaccion("APROBADO", 200.0);
        when(repository.findAll()).thenReturn(List.of(t));

        // Act
        List<TransaccionDTO> resultado = servicio.obtenerHistorialSeguro();

        // Assert
        assertEquals(1, resultado.size());
        assertEquals(200.0, resultado.get(0).monto());
        assertEquals("APROBADO", resultado.get(0).estado());
    }

    @Test
    void testLanzaExcepcionSiMontoNegativo() {
        // Arrange
        Transaccion tInvalida = new Transaccion("ERROR", -10.0);
        when(repository.findAll()).thenReturn(List.of(tInvalida));

        // Act & Assert
        assertThrows(ErrorDeNegocioException.class, () -> {
            servicio.obtenerHistorialSeguro();
        }, "Debería lanzar una excepción si detecta un monto negativo");
    }
}
