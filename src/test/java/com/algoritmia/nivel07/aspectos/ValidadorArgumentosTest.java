package com.algoritmia.nivel07.aspectos;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidadorArgumentosTest {

    @InjectMocks
    private ValidadorArgumentosEnunciado aspecto;

    @Test
    void testFallaConArgumentoNulo() throws Throwable {
        ProceedingJoinPoint joinPoint = mock(ProceedingJoinPoint.class);
        when(joinPoint.getArgs()).thenReturn(new Object[]{ "texto", null });

        assertThrows(IllegalArgumentException.class, () -> {
            aspecto.validar(joinPoint);
        });
    }

    @Test
    void testExitoSinNulos() throws Throwable {
        ProceedingJoinPoint joinPoint = mock(ProceedingJoinPoint.class);
        when(joinPoint.getArgs()).thenReturn(new Object[]{ "texto", 123 });
        
        aspecto.validar(joinPoint);
        verify(joinPoint).proceed();
    }
}
