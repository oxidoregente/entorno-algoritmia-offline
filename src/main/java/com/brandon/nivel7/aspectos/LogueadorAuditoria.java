package com.brandon.nivel7.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Nivel 7: Observabilidad y AOP (Programación Orientada a Aspectos).
 * 
 * <p>Esta clase demuestra cómo manejar "Cross-Cutting Concerns" (preocupaciones transversales)
 * como el logging y la auditoría sin modificar el código de los servicios.</p>
 * 
 * <p>El @Aspect permite interceptar llamadas a métodos basándose en patrones (Pointcuts).</p>
 */
@Aspect
@Component
public class LogueadorAuditoria {

    private static final Logger logger = LoggerFactory.getLogger(LogueadorAuditoria.class);

    /**
     * Intercepta cualquier ejecución de métodos en los paquetes de servicios.
     * Mide el tiempo de respuesta y genera logs de auditoría automáticos.
     */
    @Around("execution(* com.brandon.*.servicios.*.*(..))")
    public Object auditarEjecucion(ProceedingJoinPoint joinPoint) throws Throwable {
        long inicio = System.currentTimeMillis();
        
        // Información antes de la ejecución
        logger.info(">> [AUDITORÍA] Iniciando ejecución de: {}", joinPoint.getSignature().toShortString());
        
        // Proceder con la ejecución del método original
        Object resultado = joinPoint.proceed();
        
        // Información después de la ejecución
        long tiempoTotal = System.currentTimeMillis() - inicio;
        logger.info("<< [AUDITORÍA] Finalizado: {} | Tiempo: {}ms", 
                    joinPoint.getSignature().toShortString(), tiempoTotal);
        
        return resultado;
    }
}
