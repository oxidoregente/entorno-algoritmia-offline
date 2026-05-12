package com.brandon.nivel7.aspectos;

import static org.mockito.Mockito.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LogueadorAuditoriaTest {

    @InjectMocks
    private LogueadorAuditoriaEnunciado aspecto;

    @Test
    void testInterceptacion() throws Throwable {
        ProceedingJoinPoint joinPoint = mock(ProceedingJoinPoint.class);
        Signature signature = mock(Signature.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        when(signature.toShortString()).thenReturn("metodoPrueba()");

        aspecto.auditarEjecucion(joinPoint);

        // Debería invocar a proceed si el estudiante implementa el aspecto
        verify(joinPoint, times(1)).proceed();
    }
}
