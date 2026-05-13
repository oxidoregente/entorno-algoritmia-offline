package com.brandon.nivel17.migraciones;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 🏆 SOLUCIÓN: Verificador de Migraciones.
 */
public class VerificadorMigracionSolucion {

    private final JdbcTemplate jdbcTemplate;

    public VerificadorMigracionSolucion(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean existeColumnaAuditoria() {
        try {
            jdbcTemplate.queryForObject("SELECT usuario_creacion FROM transaccion LIMIT 1", String.class);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
