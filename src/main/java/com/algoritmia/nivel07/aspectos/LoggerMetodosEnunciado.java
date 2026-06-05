package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Logger de Métodos (AOP).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un aspecto transversal que registre en consola el nombre de cada
 * método ejecutado dentro del paquete de servicios (capa de negocio) antes de
 * que el método se ejecute realmente. Es la base del logging de auditoría y
 * trazabilidad en una aplicación empresarial.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa la anotación {@code @Before} con un <i>pointcut</i> que apunte a
 *       todos los métodos del paquete {@code com.algoritmia.*.servicios}.</li>
 *   <li>El {@link JoinPoint} recibido como parámetro expone información del
 *       método interceptado (nombre, argumentos, target, etc.).</li>
 *   <li>Para logging en producción se recomienda SLF4J + Logback, no
 *       {@code System.out.println}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Before("execution(* com.algoritmia.*.servicios.*.*(..))")
 * public void registrarLlamada(JoinPoint joinPoint) {
 *     logger.info("Llamando a: {}", joinPoint.getSignature().getName());
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Un <i>pointcut</i> con {@code execution(* com.algoritmia.*.servicios.*.*(..))}
 *       captura cualquier método público de cualquier servicio del proyecto.</li>
 *   <li>{@code joinPoint.getSignature().getName()} devuelve el nombre del método interceptado.</li>
 *   <li>Si quieres añadir el nombre de la clase: {@code joinPoint.getTarget().getClass().getSimpleName()}.</li>
 * </ul>
 */
@Aspect
@Component
public class LoggerMetodosEnunciado {

    // TODO: Define el @Before con pointcut para servicios
    /**
     * Advice {@code @Before} que se ejecuta antes de cada método del paquete de servicios.
     *
     * @param joinPoint punto de unión que representa al método interceptado.
     */
    public void registrarLlamada(JoinPoint joinPoint) {
        // TODO: Registra el nombre del método ejecutado
    }
}
