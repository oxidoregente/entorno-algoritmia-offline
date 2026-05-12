package com.brandon.nivel06.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.brandon.nivel04.repositorios.ClienteEnunciado;
import com.brandon.nivel06.dto.ClienteDTO;
import org.junit.jupiter.api.Test;

class ClienteMapperTest {

    @Test
    void testMapeoEntidadADTO() {
        ClienteEnunciado entidad = new ClienteEnunciado("brandon");
        ClienteMapperEnunciado mapper = new ClienteMapperEnunciado();
        
        ClienteDTO dto = mapper.mapear(entidad);
        
        // assertNotNull(dto);
        // assertEquals("BRANDON", dto.nombreMayusculas());
    }
}
