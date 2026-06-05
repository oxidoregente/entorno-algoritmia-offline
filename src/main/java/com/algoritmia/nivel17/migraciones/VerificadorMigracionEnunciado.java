package com.algoritmia.nivel17.migraciones;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Verificador de Migraciones.
 * <b>Dificultad: Media</b>
 *
 * <p>Las migraciones de Flyway se ejecutan al arrancar la
 * aplicación, pero rara vez se verifica <b>qué</b> quedó en
 * la base de datos. Un verificador post-migración permite
 * detectar regresiones, alertas tempranas y errores
 * silenciosos (ej. una columna agregada a una tabla que no
 * es la correcta). Esta clase comprueba la presencia de la
 * columna {@code usuario_creacion} introducida en la
 * migración V2.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link JdbcTemplate} ofrece acceso directo al datasource sin escribir boilerplate
 *       de {@code Connection}/{@code Statement}.</li>
 *   <li>Puedes consultar metadatos con
 *       {@code information_schema.columns} (estándar SQL, portable) o
 *       {@code DatabaseMetaData.getColumns(...)} (específico de JDBC).</li>
 *   <li>Otra alternativa, más simple, es intentar un {@code SELECT} sobre la nueva columna
 *       y capturar la excepción.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class VerificadorMigracionEnunciado {
 *     private final JdbcTemplate jdbcTemplate;
 *
 *     public VerificadorMigracionEnunciado(JdbcTemplate jdbcTemplate) {
 *         this.jdbcTemplate = jdbcTemplate;
 *     }
 *
 *     public boolean existeColumnaAuditoria() {
 *         Integer count = jdbcTemplate.queryForObject(
 *             "SELECT COUNT(*) FROM information_schema.columns " +
 *             "WHERE table_name = 'AUDITORIA' AND column_name = 'USUARIO_CREACION'",
 *             Integer.class);
 *         return count != null &amp;&amp; count &gt; 0;
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Asegúrate de usar mayúsculas o minúsculas según la convención del SGBD
 *       (PostgreSQL es case-sensitive en identificadores sin comillas).</li>
 *   <li>Encapsula la consulta en un método {@code private} para que el método público
 *       {@code existeColumnaAuditoria()} quede legible y testeable.</li>
 * </ul>
 */
@Service
public class VerificadorMigracionEnunciado {

    private final JdbcTemplate jdbcTemplate;

    public VerificadorMigracionEnunciado(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Verifica si la columna {@code usuario_creacion} existe en la base de datos
     * tras la migración V2 de Flyway.
     *
     * @return {@code true} si la columna está presente en la tabla correspondiente,
     *         {@code false} en caso contrario
     */
    public boolean existeColumnaAuditoria() {
        // TODO: Consulta la metadata o intenta un SELECT sobre la nueva columna
        return false;
    }
}
