package com.algoritmia.nivel17.migraciones;

/**
 * 🎓 RETO: Convención de Nombres en Flyway.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Flyway identifica las migraciones por el nombre del
 * archivo, que sigue una convención estricta. Respetarla
 * es indispensable: un archivo mal nombrado se ignora o
 * puede provocar errores difíciles de diagnosticar en
 * producción. La convención es
 * {@code V{version}__{descripcion}.sql} para versiones y
 * {@code R__{descripcion}.sql} para repetibles.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Prefijo {@code V} para migraciones versionadas: {@code V1__init.sql}.</li>
 *   <li>Doble guion bajo {@code __} como separador entre versión y descripción.</li>
 *   <li>La descripción debe ser corta, en snake_case y describir la intención,
 *       ej. {@code V3__add_audit_table.sql}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * src/main/resources/db/migration/
 *   ├── V1__init.sql
 *   ├── V2__add_users_index.sql
 *   └── V3__add_audit_table.sql
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para la versión 3 con tabla auditoría, el nombre es
 *       {@code V3__add_auditoria.sql}.</li>
 *   <li>Evita espacios, tildes y caracteres especiales en la descripción; usa siempre
 *       snake_case en inglés (recomendado para equipos distribuidos).</li>
 * </ul>
 */
public class MigracionNamingEnunciado {

    /**
     * Devuelve el nombre correcto del archivo de migración para la versión 3
     * que añade la tabla de auditoría.
     *
     * @return nombre siguiendo la convención {@code V{version}__{descripcion}.sql}
     */
    public String obtenerNombreCorrecto() {
        // TODO: Retorna el nombre del archivo (ej: V1__nombre.sql)
        return "";
    }
}
