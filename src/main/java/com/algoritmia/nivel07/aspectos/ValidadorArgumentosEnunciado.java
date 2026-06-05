package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Validador de Argumentos Nulos (AOP).
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un aspecto que intercepte cualquier método de la capa de
 * servicios y verifique si alguno de los argumentos recibidos es {@code null}.
 * Si encuentra un argumento nulo, debe lanzar una
 * {@link IllegalArgumentException} con un mensaje claro que indique qué
 * parámetro falló. Esto evita el temido {@link NullPointerException} en
 * mitad de la lógica de negocio.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa {@code @Around} con un <i>pointcut</i> que cubra todos los métodos
 *       de los paquetes {@code servicios}.</li>
 *   <li>Itera sobre {@code joinPoint.getArgs()} y comprueba cada posición.</li>
 *   <li>Si un argumento es {@code null}, lanza {@code IllegalArgumentException}
 *       indicando el índice y/o el nombre del parámetro.</li>
 *   <li>El aspecto <b>no</b> debe ejecutarse si no hay argumentos.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Around("execution(* com.algoritmia.*.servicios.*.*(..))")
 * public Object validar(ProceedingJoinPoint joinPoint) throws Throwable {
 *     Object[] args = joinPoint.getArgs();
 *     for (int i = 0; i &lt; args.length; i++) {
 *         if (args[i] == null) {
 *             throw new IllegalArgumentException(
 *                 "Argumento nulo en posición " + i
 *                 + " del método " + joinPoint.getSignature().getName()
 *             );
 *         }
 *     }
 *     return joinPoint.proceed();
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code joinPoint.getArgs()} devuelve un {@code Object[]} con todos los
 *       argumentos posicionales del método interceptado.</li>
 *   <li>En Java 21 también puedes usar {@code Arrays.stream(args).anyMatch(Objects::isNull)}.</li>
 *   <li>Para conocer el nombre del parámetro (no solo su índice) necesitas
 *       {@code joinPoint.getSignature()} combinado con un {@code MethodSignature}
 *       y sus {@code parameterNames}.</li>
 *   <li>Si la validación es correcta, no olvides retornar el valor de
 *       {@code joinPoint.proceed()}.</li>
 * </ul>
 */
@Aspect
@Component
public class ValidadorArgumentosEnunciado {

    /**
     * Advice {@code @Around} que valida que ningún argumento del método de
     * servicio sea {@code null}.
     *
     * @param joinPoint punto de unión que envuelve la llamada al método original.
     * @return el resultado devuelto por el método objetivo.
     * @throws IllegalArgumentException si algún argumento es {@code null}.
     * @throws Throwable                 si el método objetivo lanza cualquier excepción.
     */
    @Around("execution(* com.algoritmia.*.servicios.*.*(..))")
    public Object validar(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Valida argumentos nulos, lanza excepción o permite ejecución
        return null;
    }
}
