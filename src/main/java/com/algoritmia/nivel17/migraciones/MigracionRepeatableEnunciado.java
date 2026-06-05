package com.algoritmia.nivel17.migraciones;

/**
 * 🎓 RETO: Migraciones Repetibles (Repeatable).
 * <b>Dificultad: Media</b>
 *
 * <p>Las migraciones versionadas se ejecutan una sola vez en
 * orden ascendente. Las <b>repetibles</b>, en cambio, se
 * ejecutan cada vez que cambia su contenido (checksum). Esto
 * es ideal para objetos derivados del modelo, como <b>vistas</b>,
 * <b>funciones almacenadas</b>, <b>stored procedures</b> o
 * <b>triggers</b>, cuya definición debe mantenerse alineada
 * con el código cada vez que se despliega.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Prefijo {@code R} (mayúscula) en lugar de {@code V}.</li>
 *   <li>No llevan número de versión, solo descripción separada por doble guion bajo:
 *       {@code R__refresh_views.sql}.</li>
 *   <li>Se ejecutan después de todas las migraciones versionadas, en orden alfabético.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * src/main/resources/db/migration/
 *   ├── V1__init.sql
 *   ├── V2__add_auditoria.sql
 *   └── R__refresh_v_ventas_diarias.sql  -- vista recalculada en cada deploy
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El prefijo correcto es {@code R__} (con dos guiones bajos).</li>
 *   <li>Si la vista referencia tablas, asegúrate de declarar
 *       {@code DROP VIEW IF EXISTS v_ventas_diarias; CREATE VIEW ...}
 *       para que la migración repetible sea realmente idempotente.</li>
 * </ul>
 */
public class MigracionRepeatableEnunciado {

    /**
     * Devuelve el prefijo usado por Flyway para las migraciones repetibles.
     *
     * @return prefijo {@code R__} que distingue migraciones repetibles de versionadas
     */
    public String obtenerPrefijo() {
        // TODO: Retorna el prefijo para migraciones repetibles (ej: R__)
        return "";
    }
}
