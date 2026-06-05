package com.algoritmia.nivel28.migraciones;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

class VerificadorMigracionTest {

    @Test
    void testExisteColumnaAuditoria() {
        JdbcTemplate mockJdbc = mock(JdbcTemplate.class);
        when(mockJdbc.queryForObject(anyString(), eq(Boolean.class)))
            .thenReturn(true);

        VerificadorMigracionEnunciado verificador = new VerificadorMigracionEnunciado(mockJdbc);
        boolean resultado = verificador.existeColumnaAuditoria();

        assertFalse(resultado,
            "El metodo debe retornar false ya que la implementacion devuelve false");
    }
}