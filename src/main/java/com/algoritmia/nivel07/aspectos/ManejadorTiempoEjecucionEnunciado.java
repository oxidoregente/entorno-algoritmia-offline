package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Medidor de Tiempo de Ejecución (Profiling).
 * <b>Dificultad: Media</b>
 * 
 * <p>Crea un aspecto que mida cuánto tiempo tarda en ejecutarse cualquier 
 * método anotado con una anotación personalizada o que esté dentro de un 
 * paquete específico.</p>
 */
@Aspect
@Component
public class ManejadorTiempoEjecucionEnunciado {

    @Around("execution(* com.algoritmia.nivel03.servicios.*.*(..))")
    public Object medirTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
        // TODO: Registra el tiempo de inicio, ejecuta el método, 
        // registra el tiempo de fin y muestra la duración por consola.
        return joinPoint.proceed();
    }
}
