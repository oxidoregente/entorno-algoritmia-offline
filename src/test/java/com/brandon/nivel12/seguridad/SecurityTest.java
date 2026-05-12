package com.brandon.nivel12.seguridad;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SecurityTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAccesoPublicoAuth() throws Exception {
        // El login debe ser público
        mockMvc.perform(get("/api/v1/auth/login")
                .param("usuario", "test")
                .param("password", "test"))
                .andExpect(status().is4xxClientError()); // 4xx porque las credenciales fallan, pero no 403 Forbidden
    }

    @Test
    @WithMockUser(roles = "USER")
    void testAccesoDenegadoAdmin() throws Exception {
        // Un usuario normal NO debe entrar a la zona de pagos
        mockMvc.perform(get("/api/v1/pagos/comision")
                .param("monto", "100")
                .param("tipo", "CREDITO"))
                .andExpect(status().isForbidden());
    }
}
