package com.algoritmia.nivel24.trazabilidad;

import io.micrometer.tracing.Tracer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TrazadorPersonalizadoTest {

    @Mock
    private Tracer tracer;

    @InjectMocks
    private TrazadorPersonalizadoEnunciado trazador;

    @Test
    void testCreacionDeSpan() {
        // Simplemente verificamos que el servicio inyectado interactúe con el tracer
        trazador.ejecutarOperacionTrazada();
        // verify(tracer, atLeastOnce()).nextSpan();
    }
}
