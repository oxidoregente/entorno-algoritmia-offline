package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 🏆 SOLUCIÓN: Medidor de Tiempo de Ejecución (Profiling).
 * 
 * <p>Esta solución utiliza un aspecto 'Around' para envolver la ejecución 
 * del método. Es la forma más común de realizar profiling o telemetría 
 * personalizada.</p>
 * 
 * <p><b>Ejemplo de uso:</b></p>
 * <pre>
 * long inicio = System.currentTimeMillis();
 * Object result = joinPoint.proceed();
 * long fin = System.currentTimeMillis();
 * log.info("Duración: {}ms", (fin - inicio));
 * </pre>
 */
public class ManejadorTiempoEjecucionSolucion {

    private static final Logger log = LoggerFactory.getLogger(ManejadorTiempoEjecucionSolucion.class);

    public Object medir(ProceedingJoinPoint joinPoint) throws Throwable {
        long inicio = System.currentTimeMillis();
        
        try {
            return joinPoint.proceed();
        } finally {
            long fin = System.currentTimeMillis();
            log.info("MÉTODO PROFILED: {} | DURACIÓN: {}ms", 
                joinPoint.getSignature().getName(), (fin - inicio));
        }
    }
}
