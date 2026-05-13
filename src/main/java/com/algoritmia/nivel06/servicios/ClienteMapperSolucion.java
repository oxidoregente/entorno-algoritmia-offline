package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.ClienteEnunciado;
import com.algoritmia.nivel06.dto.ClienteDTO;

/**
 * 🏆 SOLUCIÓN: Mapper de Clientes.
 */
public class ClienteMapperSolucion {

    public ClienteDTO mapear(ClienteEnunciado entidad) {
        if (entidad == null) return null;
        return new ClienteDTO(
            entidad.getId(),
            entidad.getNombre().toUpperCase()
        );
    }
}
