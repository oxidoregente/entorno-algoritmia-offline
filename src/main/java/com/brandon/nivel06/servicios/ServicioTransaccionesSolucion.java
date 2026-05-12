package com.brandon.nivel06.servicios;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import com.brandon.nivel06.dto.TransaccionDTO;
import com.brandon.nivel06.excepciones.ErrorDeNegocioException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Servicio de Transacciones con DTO.
 */

public class ServicioTransaccionesSolucion {

    private final TransaccionRepositoryEnunciado repositorio;

    public ServicioTransaccionesSolucion(TransaccionRepositoryEnunciado repositorio) {
        this.repositorio = repositorio;
    }

    public List<TransaccionDTO> obtenerHistorialSeguro() {
        return repositorio.findAll().stream()
            .map(this::mapear)
            .collect(Collectors.toList());
    }

    private TransaccionDTO mapear(TransaccionEnunciado t) {
        if (t.getMonto() < 0) throw new ErrorDeNegocioException("Monto negativo");
        return new TransaccionDTO(t.getId(), t.getEstado(), t.getMonto(), "Validado");
    }
}
