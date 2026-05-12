package com.brandon.nivel6.servicios;

import com.brandon.nivel4.repositorios.TransaccionEnunciado;
import com.brandon.nivel4.repositorios.TransaccionRepositoryEnunciado;
import com.brandon.nivel6.dto.TransaccionDTO;
import com.brandon.nivel6.excepciones.ErrorDeNegocioException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Nivel 6: Arquitectura Profesional.
 * Uso de DTOs para no exponer la Entidad JPA directamente y manejo de excepciones.
 */
@Service
public class ServicioTransacciones {

    private final TransaccionRepositoryEnunciado repositorio;

    // Inyección por constructor: La forma más segura y testeable.
    public ServicioTransacciones(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Obtiene el historial transformado a DTOs con validaciones.
     * Se almacena en caché para mejorar el rendimiento.
     */
    @Cacheable(value = "historial_transacciones")
    public List<TransaccionDTO> obtenerHistorialSeguro() {
        return repositorio.findAll().stream()
            .map(this::mapearADto)
            .collect(Collectors.toList());
    }

    private TransaccionDTO mapearADto(TransaccionEnunciado t) {
        // Validación de integridad
        if (t.getMonto() != null && t.getMonto() < 0) {
            throw new ErrorDeNegocioException("Detección de monto inválido en transacción: " + t.getId());
        }

        return new TransaccionDTO(
            t.getId(),
            t.getEstado(),
            t.getMonto(),
            "Procesada el: " + (t.getFecha() != null ? t.getFecha().toString() : "Fecha no disponible")
        );
    }
}
