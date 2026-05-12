package com.brandon.nivel06.excepciones;

/**
 * Excepción personalizada para manejar errores de lógica de negocio.
 */
public class ErrorDeNegocioException extends RuntimeException {
    public ErrorDeNegocioException(String mensaje) {
        super(mensaje);
    }
}
