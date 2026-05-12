package com.brandon.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 🏆 SOLUCIÓN: Validador de Argumentos Nulos.
 */
public class ValidadorArgumentosSolucion {

    public Object validar(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg == null) {
                throw new IllegalArgumentException("Detección de argumento prohibido (NULL) en el servicio");
            }
        }
        return joinPoint.proceed();
    }
}
