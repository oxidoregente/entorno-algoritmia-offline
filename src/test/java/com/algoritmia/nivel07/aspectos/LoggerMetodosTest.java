package com.algoritmia.nivel07.aspectos;

import static org.mockito.Mockito.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LoggerMetodosTest {

    @InjectMocks
    private LoggerMetodosEnunciado aspecto;

    @Test
    void testLoggerInvocado() {
        JoinPoint joinPoint = mock(JoinPoint.class);
        Signature signature = mock(Signature.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        when(signature.getName()).thenReturn("testMetodo");

        aspecto.registrarLlamada(joinPoint);
        
        // Verificamos que se obtuvo el nombre de la firma
        verify(joinPoint, atLeastOnce()).getSignature();
    }
}
