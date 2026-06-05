package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Sincronización de Caché (Cache Put).
 * <b>Dificultad: Media</b>
 *
 * <p>A diferencia de {@code @Cacheable}, {@link CachePut} siempre ejecuta
 * el método y, además, <b>actualiza</b> la caché con el resultado
 * devuelto. Es la anotación ideal para métodos de escritura que también
 * deben refrescar la versión cacheada de un dato.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code @CachePut} nunca <i>evita</i> la ejecución del método:
 *       siempre se ejecuta y su resultado se almacena en la caché.</li>
 *   <li>La clave por defecto se calcula con todos los parámetros; usa
 *       {@code key} para fijarla (por ejemplo {@code key = "#id"}).</li>
 *   <li>Si combinas {@code @CachePut} con {@code @Cacheable} en el mismo
 *       método, considera {@code @Caching} para mayor claridad.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;CachePut(value = "usuarios", key = "#id")
 * public String actualizarNombre(String id, String nuevoNombre) {
 *     return nuevoNombre;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si la entrada no existía en la caché, {@code @CachePut} la crea; si
 *       ya existía, la sobreescribe con el valor devuelto.</li>
 *   <li>La clave debe coincidir con la que usas en {@code @Cacheable} para
 *       apuntar al mismo slot de caché.</li>
 *   <li>{@code @CachePut} no consulta la caché antes: cada llamada produce
 *       una escritura.</li>
 * </ul>
 */
@Service
public class CachePutEnunciado {

    /**
     * Actualiza la información del usuario en la caché {@code "usuarios"}
     * cada vez que este método es llamado.
     * <b>💡 Pista:</b> Usa {@link CachePut} con la clave basada en
     * {@code id}.
     *
     * @param id         identificador del usuario.
     * @param nuevoNombre nuevo nombre a guardar y a cachear.
     * @return el mismo nombre (ya cacheado) para que el llamante pueda
     *         confirmar la operación.
     */
    public String actualizarNombre(String id, String nuevoNombre) {
        return nuevoNombre;
    }
}
