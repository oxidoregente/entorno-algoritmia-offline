package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel06.dto.TransaccionDTO;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🏆 SOLUCIÓN: Orquestador de Mappers.
 */
public class OrquestadorHistorialSolucion {

    public List<TransaccionDTO> procesarHistorial(List<TransaccionEnunciado> entidades) {
        if (entidades == null) return List.of();
        return entidades.stream()
                .map(e -> new TransaccionDTO(
                        e.getId(),
                        e.getEstado(),
                        e.getMonto(),
                        "Impuesto: " + (e.getMonto() * 0.15)
                ))
                .collect(Collectors.toList());
    }
}
