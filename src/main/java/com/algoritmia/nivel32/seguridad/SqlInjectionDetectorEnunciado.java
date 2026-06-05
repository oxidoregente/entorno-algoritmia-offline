package com.algoritmia.nivel32.seguridad;

/**
 * 🎓 RETO: Prevención de SQL Injection.
 * <b>Dificultad: Media</b>
 *
 * <p>La inyección SQL es una de las vulnerabilidades más antiguas y dañinas: consiste en
 * introducir código SQL malicioso en los campos de un formulario (<code>' OR '1'='1' -- </code>)
 * para manipular la consulta que ejecuta la aplicación. La defensa correcta es
 * <em>siempre</em> usar <em>Prepared Statements</em> o un ORM con绑定 de parámetros, pero
 * también resulta útil disponer de un saneador básico en el borde de la aplicación
 * para rechazar entradas obviamente hostiles antes de procesarlas.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Nunca concatenes la entrada del usuario en una query: <code>"SELECT * FROM users WHERE id = " + id</code> es una vulnerabilidad.</li>
 *   <li>Usa siempre <code>PreparedStatement</code> con <code>?</code> o el API de tu ORM (JPA, JOOQ, etc.).</li>
 *   <li>Como <em>defensa en profundidad</em>, filtra palabras y caracteres sospechosos: <code>'</code>, <code>--</code>, <code>;</code>, <code>DROP</code>, <code>UNION</code>, <code>xp_</code>...</li>
 *   <li>Devuelve <code>null</code> o lanza <code>IllegalArgumentException</code> si la entrada es sospechosa.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public String limpiarEntrada(String input) {
 *     if (input == null) return null;
 *     String blacklist = ".*('|--|;|\\bDROP\\b|\\bUNION\\b|\\bSELECT\\b).*";
 *     if (input.matches("(?i)" + blacklist)) {
 *         throw new IllegalArgumentException("Entrada sospechosa");
 *     }
 *     return input;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Trabaja con <code>Pattern</code>/<code>Matcher</code> o <code>String.replaceAll</code> en mayúsculas para detectar <em>UNION</em> y <em>union</em> igual.</li>
 *   <li>El saneador NUNCA sustituye al uso de <em>Prepared Statements</em>; es solo una capa más.</li>
 *   <li>Considera centralizar la validación con un <code>ConstraintValidator</code> de Bean Validation.</li>
 * </ul>
 */
public class SqlInjectionDetectorEnunciado {

    /**
     * Sanea una entrada de texto eliminando o marcando como sospechosa
     * la presencia de patrones típicos de inyección SQL.
     *
     * @param input texto introducido por el usuario que se va a filtrar.
     * @return el texto saneado, o <code>null</code> si la entrada es nula
     *         o todavía no se ha implementado el filtro.
     */
    public String limpiarEntrada(String input) {
        // TODO: Elimina caracteres peligrosos como ';', '--', 'DROP', etc.
        // Aunque la mejor solución es usar parámetros (?), implementa un filtro básico.
        return null;
    }
}
