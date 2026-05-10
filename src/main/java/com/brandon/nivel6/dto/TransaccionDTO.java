package com.brandon.nivel6.dto;

/**
 * Usamos 'record' de Java 21. Es inmutable, genera getters, 
 * equals, hashCode y toString automáticamente. Ideal para DTOs.
 */
public record TransaccionDTO(
    Long id,
    String estado,
    Double monto,
    String mensajeInformativo
) {}
