package com.algoritmia.nivel06.servicios;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Categorizador de Errores Técnicos.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En arquitecturas reales, las excepciones técnicas se traducen a mensajes
 * amigables para el usuario. Este servicio clasifica excepciones según su tipo
 * y devuelve un código y mensaje de error estandarizados.</p>
 *
 * <p><b>Mapeo de errores:</b></p>
 * <ul>
 *   <li>NullPointerException    -> Código "E001", Mensaje "Error de datos incompletos"</li>
 *   <li>IllegalArgumentException -> Código "E002", Mensaje "Solicitud inválida"</li>
 *   <li>Cualquier otra          -> Código "E999", Mensaje "Error interno desconocido"</li>
 * </ul>
 */
@Service
public class CategorizadorErroresEnunciado {

    public record ErrorRespuesta(String codigo, String mensajeUsuario) {}

    /**
     * Clasifica una excepción técnica en una respuesta de error estandarizada.
     *
     * @param ex La excepción a clasificar.
     * @return ErrorRespuesta con código y mensaje para el usuario.
     */
    public ErrorRespuesta categorizar(Exception ex) {
        // TODO: Implementa la clasificación por tipo de excepción
        return null;
    }
}
