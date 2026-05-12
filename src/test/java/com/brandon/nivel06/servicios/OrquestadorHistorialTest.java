package com.brandon.nivel06.servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel06.dto.TransaccionDTO;
import org.junit.jupiter.api.Test;
import java.util.List;

class OrquestadorHistorialTest {

    @Test
    void testProcesamientoMasivo() {
        TransaccionEnunciado t1 = new TransaccionEnunciado("OK", 100.0);
        OrquestadorHistorialEnunciado orquestador = new OrquestadorHistorialEnunciado();
        
        List<TransaccionDTO> dtos = orquestador.procesarHistorial(List.of(t1));
        
        // assertEquals(1, dtos.size());
        // assertEquals("Impuesto: 15.0", dtos.get(0).mensajeInformativo());
    }
}
