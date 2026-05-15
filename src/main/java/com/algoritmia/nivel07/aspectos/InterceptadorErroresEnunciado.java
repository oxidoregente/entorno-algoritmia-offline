package com.algoritmia.nivel07.aspectos;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Interceptador de Errores Global.
 * <b>Dificultad: Media</b>
 * 
 * <p>Crea un aspecto que capture cualquier excepción lanzada por los 
 * controladores (Nivel 05) y registre el error en un log especial 
 * antes de que llegue al ManejadorGlobalExcepciones.</p>
 */
@Aspect
@Component
public class InterceptadorErroresEnunciado {

    @AfterThrowing(pointcut = "execution(* com.algoritmia.nivel05.api.*.*(..))", throwing = "ex")
    public void logearError(Exception ex) {
        // TODO: Muestra el nombre del método y el mensaje de la excepción por consola.
    }
}
