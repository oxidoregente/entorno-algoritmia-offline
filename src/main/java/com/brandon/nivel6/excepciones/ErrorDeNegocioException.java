package com.brandon.nivel6.excepciones;

/**
 * Excepción personalizada para manejar errores de lógica de negocio.
 */
public class ErrorDeNegocioException extends RuntimeException {
    public ErrorDeNegocioException(String mensaje) {
        super(mensaje);
    }
}
