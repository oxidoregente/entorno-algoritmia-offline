package com.brandon.nivel07.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 🏆 SOLUCIÓN: Logger de Métodos.
 */
public class LoggerMetodosSolucion {

    private static final Logger logger = LoggerFactory.getLogger(LoggerMetodosSolucion.class);

    @Before("execution(* com.brandon.*.servicios.*.*(..))")
    public void registrarLlamada(JoinPoint joinPoint) {
        logger.info(">> [LOG] Ejecutando método: {}", joinPoint.getSignature().getName());
    }
}
