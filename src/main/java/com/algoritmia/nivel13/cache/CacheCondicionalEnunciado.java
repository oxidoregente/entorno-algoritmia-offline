package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Caché Condicional.
 * <b>Dificultad: Media</b>
 *
 * <p>No siempre queremos cachear todo. A veces solo queremos cachear si se
 * cumple una condición (por ejemplo, únicamente para usuarios VIP) o si el
 * resultado no es nulo. Spring Cache permite condicionar el
 * almacenamiento con los atributos {@code condition} y {@code unless} de
 * {@link Cacheable}.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code condition}: evalúa los <i>argumentos</i> del método
 *       <b>antes</b> de ejecutarlo. Decide si se debe cachear el resultado.</li>
 *   <li>{@code unless}: evalúa el <i>resultado</i> (<code>#result</code>)
 *       <b>después</b> de ejecutar el método. Decide si el resultado
 *       <b>no</b> debe almacenarse.</li>
 *   <li>Las expresiones se escriben en SpEL (Spring Expression Language).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Cacheable(value = "datos", key = "#id", condition = "#cachear == true")
 * public String obtenerDato(String id, boolean cachear) { ... }
 *
 * &#64;Cacheable(value = "datos", key = "#id", unless = "#result.length() < 10")
 * public String obtenerDatoLargo(String id) { ... }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para condicionar por un argumento booleano:
 *       {@code condition = "#cachear"} o {@code condition = "#cachear == true"}.</li>
 *   <li>Para condicionar por el resultado: {@code unless = "#result == null"}
 *       o {@code unless = "#result.length() &lt; 10"}.</li>
 *   <li>Si la condición es <code>false</code>, el método se ejecuta y su
 *       resultado <b>no</b> se guarda en la caché.</li>
 * </ul>
 */
@Service
public class CacheCondicionalEnunciado {

    /**
     * Cachea el resultado solo si el parámetro {@code cachear} es verdadero.
     * <b>💡 Pista:</b> Usa el atributo {@code condition} de {@link Cacheable}.
     *
     * @param id      identificador lógico del dato a recuperar.
     * @param cachear si es {@code true}, el resultado se almacena en caché.
     * @return dato sensible asociado al {@code id}.
     */
    public String obtenerDato(String id, boolean cachear) {
        return "Dato sensible para " + id;
    }

    /**
     * Cachea el resultado solo si la longitud de la respuesta es mayor a 10.
     * <b>💡 Pista:</b> Usa el atributo {@code unless} con SpEL
     * (por ejemplo {@code #result.length() &lt; 10}).
     *
     * @param id identificador lógico del dato a recuperar.
     * @return respuesta textual que puede o no cachearse.
     */
    public String obtenerDatoLargo(String id) {
        return "Respuesta corta";
    }
}
