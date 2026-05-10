package com.brandon.nivel6.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * Nivel 6 (Extensión): Manejo Global de Errores.
 * 
 * Esta clase intercepta las excepciones lanzadas por cualquier Controller
 * y las transforma en una respuesta JSON amigable para el cliente.
 */
@RestControllerAdvice
public class ManejadorGlobalExcepciones {

    @ExceptionHandler(ErrorDeNegocioException.class)
    public ResponseEntity<Map<String, Object>> manejarErrorDeNegocio(ErrorDeNegocioException ex) {
        Map<String, Object> cuerpo = Map.of(
            "timestamp", LocalDateTime.now(),
            "status", HttpStatus.BAD_REQUEST.value(),
            "error", "Error de Negocio",
            "mensaje", ex.getMessage()
        );
        
        return new ResponseEntity<>(cuerpo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> manejarErroresGenericos(Exception ex) {
        Map<String, Object> cuerpo = Map.of(
            "timestamp", LocalDateTime.now(),
            "status", HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "error", "Error Interno del Servidor",
            "mensaje", "Ocurrió un error inesperado. Por favor, contacte al soporte."
        );
        
        return new ResponseEntity<>(cuerpo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
