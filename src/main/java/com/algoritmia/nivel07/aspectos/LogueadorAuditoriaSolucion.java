package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SOLUCIÓN: Aspecto de Auditoría (AOP).
 */
public class LogueadorAuditoriaSolucion {

    private static final Logger logger = LoggerFactory.getLogger(LogueadorAuditoriaSolucion.class);

    public Object auditarEjecucion(ProceedingJoinPoint joinPoint) throws Throwable {
        long inicio = System.currentTimeMillis();
        Object resultado = joinPoint.proceed();
        long tiempoTotal = System.currentTimeMillis() - inicio;
        logger.info("Audit: {} | Time: {}ms", joinPoint.getSignature().toShortString(), tiempoTotal);
        return resultado;
    }
}
