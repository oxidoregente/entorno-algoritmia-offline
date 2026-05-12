package com.brandon.nivel07.aspectos;

import static org.mockito.Mockito.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Test para validar la interceptación de AOP.
 * Usamos lenient() para evitar UnnecessaryStubbingException durante el aprendizaje.
 */
@ExtendWith(MockitoExtension.class)
class LogueadorAuditoriaTest {

    @InjectMocks
    private LogueadorAuditoriaEnunciado aspecto;

    @Test
    void testInterceptacion() throws Throwable {
        ProceedingJoinPoint joinPoint = mock(ProceedingJoinPoint.class);
        Signature signature = mock(Signature.class);
        
        // Usamos lenient() porque el estudiante podría no haber implementado aún el acceso a la firma
        lenient().when(joinPoint.getSignature()).thenReturn(signature);
        lenient().when(signature.toShortString()).thenReturn("metodoPrueba()");

        aspecto.auditarEjecucion(joinPoint);

        // Verificamos que al menos se intente ejecutar el método original
        verify(joinPoint, atLeastOnce()).proceed();
    }
}
