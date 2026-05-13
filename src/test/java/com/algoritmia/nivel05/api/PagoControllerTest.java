package com.algoritmia.nivel05.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Test para validar el Controlador de Pagos (Nivel 5).
 * El estudiante debe configurar las anotaciones @GetMapping en el Enunciado.
 */
@WebMvcTest(PagoControllerEnunciado.class)
class PagoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProcesadorPagosFintechEnunciado procesador;

    @Test
    @WithMockUser(roles = "ADMIN")
    void testEndpointComision() throws Exception {
        // Este test fallará si el endpoint no está mapeado en PagoControllerEnunciado
        mockMvc.perform(get("/api/v1/pagos/comision")
                .param("monto", "100.0")
                .param("tipo", "CREDITO"))
                .andExpect(status().isOk());
    }
}
