package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Medidor de Tiempo de Ejecución (Profiling AOP).
 * <b>Dificultad: Media</b>
 *
 * <p>Crea un aspecto que mida cuánto tiempo tarda en ejecutarse cualquier
 * método de los servicios de un paquete específico (en este caso,
 * {@code nivel03.servicios}). Permite detectar hot-spots de rendimiento y
 * validar SLAs de negocio.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa la anotación {@code @Around} con un <i>pointcut</i> restringido a
 *       un paquete concreto ({@code execution(* com.algoritmia.nivel03.servicios.*.*(..))}).</li>
 *   <li>Mide el tiempo transcurrido entre antes y después de invocar
 *       {@code joinPoint.proceed()}.</li>
 *   <li>Loguea la duración junto al nombre del método objetivo.</li>
 *   <li>No debes capturar la excepción: propágalo usando {@code throws Throwable}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Around("execution(* com.algoritmia.nivel03.servicios.*.*(..))")
 * public Object medirTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
 *     long inicio = System.nanoTime();
 *     try {
 *         return joinPoint.proceed();
 *     } finally {
 *         long ms = (System.nanoTime() - inicio) / 1_000_000;
 *         logger.info("[PERF] {} -&gt; {} ms", joinPoint.getSignature().getName(), ms);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El <i>pointcut</i> de este reto es <b>más restrictivo</b> que el del
 *       aspecto de auditoría: solo afecta a los servicios de un nivel concreto.</li>
 *   <li>Para convertir nanosegundos a milisegundos: divide entre {@code 1_000_000}.</li>
 *   <li>Si quieres aplicar el profiling solo a métodos anotados con una anotación
 *       propia, define una anotación marker y reemplaza el <i>pointcut</i> por
 *       {@code &#64;annotation(MiAnotacion)}.</li>
 * </ul>
 */
@Aspect
@Component
public class ManejadorTiempoEjecucionEnunciado {

    /**
     * Advice {@code @Around} que mide el tiempo de ejecución de los métodos
     * del paquete {@code nivel03.servicios}.
     *
     * @param joinPoint punto de unión que envuelve la llamada al método original.
     * @return el resultado devuelto por el método objetivo.
     * @throws Throwable si el método objetivo lanza cualquier excepción.
     */
    @Around("execution(* com.algoritmia.nivel03.servicios.*.*(..))")
    public Object medirTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Mide y registra el tiempo de ejecución del método
        return joinPoint.proceed();
    }
}
