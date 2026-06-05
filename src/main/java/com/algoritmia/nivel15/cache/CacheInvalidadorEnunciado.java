package com.algoritmia.nivel15.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Invalidación de Caché (Cache Eviction).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Mantener la coherencia de los datos es vital. Cuando un dato cambia en
 * la base de datos, debemos eliminar la versión antigua de la caché para
 * evitar servir información obsoleta. Spring Cache lo consigue con la
 * anotación {@link CacheEvict}, que se aplica en métodos de escritura
 * (update/delete).</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link CacheEvict} elimina entradas <b>después</b> de la ejecución
 *       exitosa del método.</li>
 *   <li>El atributo {@code key} indica qué entrada(s) borrar. Si no se
 *       especifica, se usa la misma convención que {@code @Cacheable}.</li>
 *   <li>El atributo {@code allEntries = true} borra <b>todas</b> las
 *       entradas de la caché (útil para limpiezas globales).</li>
 *   <li>Por defecto, la eviction se ejecuta aunque el método lance
 *       excepción; cámbialo con {@code beforeInvocation = true} si lo
 *       prefieres antes.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;CacheEvict(value = "perfiles", key = "#email")
 * public void actualizarPerfil(String email) {
 *     // lógica de actualización
 * }
 *
 * &#64;CacheEvict(value = "perfiles", allEntries = true)
 * public void limpiarTodo() {
 *     // lógica de limpieza
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>La clave por defecto se calcula con todos los parámetros del
 *       método. Para usar solo {@code #email} decláralo explícitamente.</li>
 *   <li>Si borras y escribes a la vez, considera {@code @Caching} para
 *       combinar varias anotaciones en un mismo método.</li>
 *   <li>El método puede estar vacío: lo importante es la anotación.</li>
 * </ul>
 */
@Service
public class CacheInvalidadorEnunciado {

    /**
     * Elimina el perfil del usuario de la caché cuando se actualiza.
     * <b>💡 Pista:</b> Usa {@link CacheEvict} especificando el nombre de la
     * caché {@code "perfiles"}.
     *
     * @param email identificador del usuario cuyo perfil debe invalidarse.
     */
    public void actualizarPerfil(String email) {
        // Simulación de actualización en DB
    }

    /**
     * Limpia TODA la caché de perfiles.
     * <b>💡 Pista:</b> Usa {@code allEntries = true}.
     */
    public void limpiarTodo() {
    }
}
