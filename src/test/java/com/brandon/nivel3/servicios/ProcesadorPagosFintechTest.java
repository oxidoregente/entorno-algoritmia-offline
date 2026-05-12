package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

import com.brandon.nivel14.mensajeria.ProductorMensajes;
import com.brandon.nivel3.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Test para validar ProcesadorPagosFintechEnunciado.
 * El estudiante debe implementar la lógica para que estos tests pasen.
 */
@ExtendWith(MockitoExtension.class)
class ProcesadorPagosFintechTest {

    @Mock
    private ProductorMensajes productor;

    @InjectMocks
    private ProcesadorPagosFintechEnunciado procesador;

    @Test
    void testComisionCredito() {
        double comision = procesador.calcularComision(100.0, TipoTarjeta.CREDITO);
        
        assertEquals(3.0, comision, "La comisión de crédito (3%) de 100 debe ser 3");
        verify(productor).enviarEvento(anyString());
    }

    @Test
    void testComisionDebito() {
        double comision = procesador.calcularComision(100.0, TipoTarjeta.DEBITO);
        
        assertEquals(1.0, comision, "La comisión de débito (1%) de 100 debe ser 1");
        verify(productor).enviarEvento(anyString());
    }
}
