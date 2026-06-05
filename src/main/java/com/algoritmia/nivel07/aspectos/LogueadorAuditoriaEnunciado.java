package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Aspecto de Auditoría (AOP - Around).
 * <b>Dificultad: Media</b>
 *
 * <p>Intercepta las llamadas a los servicios para medir y registrar tiempos
 * de ejecución. Registra el tiempo antes y después de ejecutar el método
 * objetivo, permitiendo detectar cuellos de botella y trazabilidad operativa
 * en producción.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa {@code @Around} con un <i>pointcut</i> que cubra todos los métodos
 *       de los paquetes {@code servicios} de la aplicación.</li>
 *   <li>Debes llamar a {@code joinPoint.proceed()} para continuar la ejecución;
 *       si no, el método original nunca se ejecutará.</li>
 *   <li>El valor de retorno de {@code proceed()} es el resultado del método
 *       objetivo, que debes retornar desde el advice.</li>
 *   <li>Captura el tiempo antes y después con {@code System.nanoTime()} o
 *       {@code Instant.now()}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Around("execution(* com.algoritmia.*.servicios.*.*(..))")
 * public Object auditarEjecucion(ProceedingJoinPoint joinPoint) throws Throwable {
 *     long inicio = System.nanoTime();
 *     try {
 *         return joinPoint.proceed();
 *     } finally {
 *         long ms = (System.nanoTime() - inicio) / 1_000_000;
 *         logger.info("{} tardó {} ms", joinPoint.getSignature().getName(), ms);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Envuelve {@code joinPoint.proceed()} en un bloque {@code try/finally} para
 *       asegurar que el tiempo se registra incluso si el método lanza excepción.</li>
 *   <li>Para producción se recomienda {@code @Around} con Micrometer/Timer para
 *       exponer métricas a Prometheus.</li>
 *   <li>No te olvides de retornar el valor de {@code proceed()}; el llamante espera
 *       el resultado original.</li>
 * </ul>
 */
@Aspect
@Component
public class LogueadorAuditoriaEnunciado {

    /**
     * Advice {@code @Around} que mide el tiempo de ejecución de los métodos de servicio.
     *
     * @param joinPoint punto de unión que envuelve la llamada al método original.
     * @return el resultado devuelto por el método objetivo.
     * @throws Throwable si el método objetivo lanza cualquier excepción.
     */
    @Around("execution(* com.algoritmia.*.servicios.*.*(..))")
    public Object auditarEjecucion(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Registrar inicio, ejecutar joinPoint.proceed() y registrar fin con tiempo total
        return joinPoint.proceed();
    }
}
