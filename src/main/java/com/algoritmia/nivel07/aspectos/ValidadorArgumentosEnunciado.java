package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Validador de Argumentos Nulos.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un aspecto que intercepte cualquier método de servicio y verifique 
 * si alguno de los argumentos pasados es NULL. Si es así, debe lanzar una 
 * IllegalArgumentException.</p>
 */
@Aspect
@Component
public class ValidadorArgumentosEnunciado {

    @Around("execution(* com.algoritmia.*.servicios.*.*(..))")
    public Object validar(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Obtén los argumentos con joinPoint.getArgs()
        // TODO: Si hay algún nulo, lanza IllegalArgumentException
        // TODO: De lo contrario, permite la ejecución con joinPoint.proceed()
        return null;
    }
}
