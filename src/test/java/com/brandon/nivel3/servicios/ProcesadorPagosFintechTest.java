package com.brandon.nivel3.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.brandon.nivel3.servicios.ProcesadorPagosFintech.TipoTarjeta;

/**
 * Probando un servicio de Spring Boot.
 * @SpringBootTest levanta el contexto mínimo necesario para inyectar beans.
 */
@SpringBootTest(classes = ProcesadorPagosFintech.class)
class ProcesadorPagosFintechTest {

    @Autowired
    private ProcesadorPagosFintech procesador;

    @Test
    void testComisionCredito() {
        double monto = 100.0;
        double comision = procesador.calcularComision(monto, TipoTarjeta.CREDITO);
        
        // Assert: 100 * 0.03 = 3.0
        assertEquals(3.0, comision);
    }

    @Test
    void testComisionDebito() {
        double monto = 100.0;
        double comision = procesador.calcularComision(monto, TipoTarjeta.DEBITO);
        
        // Assert: 100 * 0.01 = 1.0
        assertEquals(1.0, comision);
    }
}
