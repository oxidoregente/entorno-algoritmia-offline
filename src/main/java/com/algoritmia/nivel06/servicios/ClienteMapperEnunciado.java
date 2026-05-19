package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel04.repositorios.ClienteEnunciado;
import com.algoritmia.nivel06.dto.ClienteDTO;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Mapper de Clientes (Entidad a DTO).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un servicio que transforme una entidad `ClienteEnunciado`
 * en un DTO `ClienteDTO` usando un Java Record.</p>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>ClienteDTO debe ser un record con los campos relevantes del cliente.</li>
 *   <li>Usa el constructor del record para mapear los datos de la entidad.</li>
 * </ul>
 */
@Service
public class ClienteMapperEnunciado {

    /**
     * Mapea una entidad ClienteEnunciado a un ClienteDTO.
     *
     * @param entidad La entidad JPA a transformar.
     * @return ClienteDTO con los datos mapeados.
     */
    public ClienteDTO mapear(ClienteEnunciado entidad) {
        // TODO: Mapea la entidad al Record ClienteDTO
        return null;
    }
}
