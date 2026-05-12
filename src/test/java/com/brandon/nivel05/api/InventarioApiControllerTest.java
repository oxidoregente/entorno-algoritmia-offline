package com.brandon.nivel05.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(InventarioApiControllerEnunciado.class)
class InventarioApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCrearItem() throws Exception {
        String json = "{\"nombre\":\"Laptop\", \"stock\":5, \"categoria\":\"Electrónica\"}";
        
        mockMvc.perform(post("/api/v1/items")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("Item 'Laptop' creado con éxito en la categoría Electrónica"));
    }
}
