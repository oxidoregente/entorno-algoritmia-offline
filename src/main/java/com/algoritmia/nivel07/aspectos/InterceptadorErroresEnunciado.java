package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Interceptador de Errores Global (AOP).
 * <b>Dificultad: Media</b>
 *
 * <p>Crea un aspecto que capture cualquier excepción lanzada por los
 * controladores (Nivel 05) y registre el error en un log especial antes de
 * que llegue al {@code ManejadorGlobalExcepciones}. Es la primera línea de
 * observabilidad ante fallos en la API REST.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa la anotación {@code @AfterThrowing} con un <i>pointcut</i> que
 *       cubra todos los métodos del paquete {@code com.algoritmia.nivel05.api}.</li>
 *   <li>El atributo {@code throwing} debe coincidir con el nombre del parámetro
 *       de la excepción.</li>
 *   <li>No debes capturar (engullir) la excepción: el advice se ejecuta
 *       <i>después</i> de que la excepción ha sido lanzada y esta continúa
 *       propagándose hacia el {@code @ControllerAdvice}.</li>
 *   <li>Registra el nombre del método, el tipo y el mensaje de la excepción.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;AfterThrowing(
 *     pointcut = "execution(* com.algoritmia.nivel05.api.*.*(..))",
 *     throwing = "ex"
 * )
 * public void logearError(JoinPoint jp, Exception ex) {
 *     logger.error("Error en {}.{}: {}",
 *         jp.getTarget().getClass().getSimpleName(),
 *         jp.getSignature().getName(),
 *         ex.getMessage(), ex);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para registrar también el nombre del método, añade un parámetro
 *       {@code JoinPoint} antes de la excepción.</li>
 *   <li>En producción se recomienda enviar el error a un sistema de
 *       monitorización (Sentry, ELK, Datadog, etc.).</li>
 *   <li>No lances nada desde este advice: tu único trabajo es <i>observar</i>.</li>
 * </ul>
 */
@Aspect
@Component
public class InterceptadorErroresEnunciado {

    /**
     * Advice {@code @AfterThrowing} que registra en log cualquier excepción
     * lanzada por un controlador del Nivel 05.
     *
     * @param ex excepción lanzada por el método objetivo.
     */
    @AfterThrowing(pointcut = "execution(* com.algoritmia.nivel05.api.*.*(..))", throwing = "ex")
    public void logearError(Exception ex) {
        // TODO: Registra la excepción con el nombre del método y su mensaje
    }
}
