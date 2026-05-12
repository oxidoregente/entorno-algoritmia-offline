package com.brandon.nivel6.servicios;

import com.brandon.nivel6.servicios.CategorizadorErroresEnunciado.ErrorRespuesta;

/**
 * SOLUCIÓN: Categorizador de Errores Técnicos.
 */
public class CategorizadorErroresSolucion {

    public ErrorRespuesta categorizar(Exception ex) {
        if (ex instanceof NullPointerException) {
            return new ErrorRespuesta("E001", "Error de datos incompletos");
        } else if (ex instanceof IllegalArgumentException) {
            return new ErrorRespuesta("E002", "Solicitud inválida");
        }
        return new ErrorRespuesta("E999", "Error interno desconocido");
    }
}
