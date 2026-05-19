package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.ClienteEnunciado;
import com.algoritmia.nivel06.dto.ClienteDTO;

/**
 * SOLUCIÓN: Mapper de Clientes.
 * 
 * <p>Transforma una entidad {@link ClienteEnunciado} en un
 * {@link ClienteDTO}, aplicando reglas de negocio como
 * convertir el nombre a mayúsculas.</p>
 */
public class ClienteMapperSolucion {

    /**
     * Mapea una entidad Cliente a su DTO correspondiente.
     *
     * @param entidad la entidad origen (puede ser {@code null})
     * @return el DTO mapeado, o {@code null} si la entidad es {@code null}
     */
    public ClienteDTO mapear(ClienteEnunciado entidad) {
        if (entidad == null) return null;
        return new ClienteDTO(
            entidad.getId(),
            entidad.getNombre().toUpperCase()
        );
    }
}
