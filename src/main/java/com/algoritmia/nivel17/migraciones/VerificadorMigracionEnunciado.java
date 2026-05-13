package com.algoritmia.nivel17.migraciones;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Verificador de Migraciones.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un método que verifique si la nueva columna 'usuario_creacion' 
 * existe en la base de datos tras la migración V2 de Flyway.</p>
 */
@Service
public class VerificadorMigracionEnunciado {

    private final JdbcTemplate jdbcTemplate;

    public VerificadorMigracionEnunciado(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean existeColumnaAuditoria() {
        // TODO: Consulta la metadata o intenta un SELECT sobre la nueva columna
        return false;
    }
}
