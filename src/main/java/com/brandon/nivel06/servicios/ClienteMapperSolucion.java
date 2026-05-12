package com.brandon.nivel06.servicios;

import com.brandon.nivel04.repositorios.ClienteEnunciado;
import com.brandon.nivel06.dto.ClienteDTO;

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
