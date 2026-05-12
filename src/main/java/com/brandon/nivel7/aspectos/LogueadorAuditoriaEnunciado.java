package com.brandon.nivel7.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * RETO: Aspecto de Auditoría (AOP).
 * 
 * Intercepta las llamadas a los servicios para medir tiempos.
 */
@Aspect
@Component
public class LogueadorAuditoriaEnunciado {

    @Around("execution(* com.brandon.*.servicios.*.*(..))")
    public Object auditarEjecucion(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Registrar inicio, ejecutar joinPoint.proceed() y registrar fin con tiempo total
        return joinPoint.proceed();
    }
}
