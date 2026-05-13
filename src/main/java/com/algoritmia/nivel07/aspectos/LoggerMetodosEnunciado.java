package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Logger de Métodos.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Implementa un aspecto que registre en consola el nombre de cada método 
 * ejecutado dentro del paquete de servicios antes de su ejecución real.</p>
 */
@Aspect
@Component
public class LoggerMetodosEnunciado {

    // TODO: Define el @Before para capturar ejecuciones en com.algoritmia.*.servicios.*
    public void registrarLlamada(JoinPoint joinPoint) {
        // TODO: Imprime el nombre del método usando joinPoint.getSignature().getName()
    }
}
