package com.algoritmia.nivel03.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

import com.algoritmia.nivel14.mensajeria.ProductorMensajesEnunciado;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * 🎓 TUTORIAL DE TESTING - PARTE 2: Mocks y Aislamiento
 * 
 * En sistemas reales (como Spring Boot), las clases suelen depender de otras (Bases de datos, 
 * servicios de email, colas de mensajes). Si intentamos probar el "Procesador de Pagos" 
 * conectándonos a una base de datos real, el test sería lento y propenso a fallar por la red.
 * 
 * Aquí entra Mockito.
 */
@ExtendWith(MockitoExtension.class) // Habilita el uso de anotaciones de Mockito
class ProcesadorPagosFintechTest {

    /*
     * 🧪 ¿Qué es un @Mock?
     * Es un "doble de riesgo" o un simulador. El ProductorMensajes enviaría un mensaje real a 
     * RabbitMQ, pero aquí creamos una versión "hueca" que no hace nada, solo anota si fue llamada.
     */
    @Mock
    private ProductorMensajesEnunciado productor;

    /*
     * 🛠️ ¿Qué es @InjectMocks?
     * Es la clase que SÍ queremos probar. Mockito creará una instancia real de 
     * ProcesadorPagosFintechEnunciado e inyectará automáticamente los @Mocks que definimos arriba 
     * en su constructor.
     */
    @InjectMocks
    private ProcesadorPagosFintechEnunciado procesador;

    @Test
    void testComisionCredito() {
        // ARRANGE
        double monto = 100.0;
        
        // ACT
        double comision = procesador.calcularComision(monto, TipoTarjeta.CREDITO);
        
        // ASSERT
        assertEquals(3.0, comision, "La lógica de negocio debe aplicar el 3% a tarjetas de crédito.");
        
        /*
         * 🔍 VERIFY:
         * Con los mocks, no solo revisamos el retorno, sino el COMPORTAMIENTO.
         * verify() revisa si el servicio inyectado intentó llamar al productor de mensajes.
         */
        verify(productor).enviarEvento(anyString());
    }

    @Test
    void testComisionDebito() {
        double comision = procesador.calcularComision(100.0, TipoTarjeta.DEBITO);
        assertEquals(1.0, comision);
        verify(productor).enviarEvento(anyString());
    }
}
