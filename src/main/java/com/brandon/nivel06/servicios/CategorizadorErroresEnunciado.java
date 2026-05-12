package com.brandon.nivel06.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Categorizador de Errores Técnicos.
 * 
 * En arquitecturas reales, traducimos excepciones técnicas a mensajes de negocio.
 */
@Service
public class CategorizadorErroresEnunciado {

    public record ErrorRespuesta(String codigo, String mensajeUsuario) {}

    public ErrorRespuesta categorizar(Exception ex) {
        // TODO: Si la excepción es NullPointerException -> Codigo "E001", Mensaje "Error de datos incompletos"
        // TODO: Si la excepción es IllegalArgumentException -> Codigo "E002", Mensaje "Solicitud inválida"
        // TODO: Cualquier otra -> Codigo "E999", Mensaje "Error interno desconocido"
        return null;
    }
}
