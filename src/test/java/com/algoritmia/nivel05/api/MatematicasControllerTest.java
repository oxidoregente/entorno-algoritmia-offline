package com.algoritmia.nivel05.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MatematicasControllerEnunciado.class)
class MatematicasControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSumaExitosa() throws Exception {
        mockMvc.perform(get("/api/v1/sumar")
                .param("a", "5")
                .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.resultado").value(15));
    }

    @Test
    void testSumaNegativaFalla() throws Exception {
        // Debería devolver 400 Bad Request gracias al ManejadorGlobalExcepciones
        mockMvc.perform(get("/api/v1/sumar")
                .param("a", "-1")
                .param("b", "10"))
                .andExpect(status().isBadRequest());
    }
}
