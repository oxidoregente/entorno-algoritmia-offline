package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

import com.brandon.nivel14.mensajeria.ProductorMensajes;
import com.brandon.nivel3.servicios.ProcesadorPagosFintech.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Test unitario para el Procesador de Pagos.
 * Usamos @ExtendWith(MockitoExtension.class) para una prueba rápida y aislada,
 * sin necesidad de levantar el contexto de Spring o conectar a RabbitMQ.
 */
@ExtendWith(MockitoExtension.class)
class ProcesadorPagosFintechTest {

    @Mock
    private ProductorMensajes productor;

    @InjectMocks
    private ProcesadorPagosFintech procesador;

    @Test
    void testComisionCredito() {
        double monto = 100.0;
        double comision = procesador.calcularComision(monto, TipoTarjeta.CREDITO);
        
        // Assert: 100 * 0.03 = 3.0
        assertEquals(3.0, comision);
        // Verificamos que se intentó enviar el mensaje de auditoría
        verify(productor).enviarEvento(anyString());
    }

    @Test
    void testComisionDebito() {
        double monto = 100.0;
        double comision = procesador.calcularComision(monto, TipoTarjeta.DEBITO);
        
        // Assert: 100 * 0.01 = 1.0
        assertEquals(1.0, comision);
        verify(productor).enviarEvento(anyString());
    }
}
