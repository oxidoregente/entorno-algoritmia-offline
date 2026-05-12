package com.brandon.nivel6.servicios;

import com.brandon.nivel4.repositorios.TransaccionEnunciado;
import com.brandon.nivel4.repositorios.TransaccionRepositoryEnunciado;
import com.brandon.nivel6.dto.TransaccionDTO;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * RETO: Servicio de Transacciones con DTO.
 * 
 * Este servicio debe transformar las entidades de base de datos a DTOs (Records).
 * Además, debe validar que el monto no sea negativo.
 */
@Service
public class ServicioTransaccionesEnunciado {

    private final TransaccionRepositoryEnunciado repositorio;

    public ServicioTransaccionesEnunciado(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    public List<TransaccionDTO> obtenerHistorialSeguro() {
        // TODO: Recuperar todas las transacciones
        // TODO: Validar montos negativos -> Lanzar ErrorDeNegocioException
        // TODO: Mapear a TransaccionDTO usando Java 21 Records
        return null;
    }
}
