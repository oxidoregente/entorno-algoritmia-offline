package com.algoritmia.nivel31.seguridad;

/**
 * 🎓 RETO: Prevención de XSS (Cross-Site Scripting).
 * <b>Dificultad: Media</b>
 *
 * <p>XSS (Cross-Site Scripting) ocurre cuando un atacante consigue inyectar código
 * JavaScript en una página que otros usuarios visualizan, robando cookies, sesiones
 * o datos sensibles. La defensa principal es <em>escapar</em> el HTML en el punto de
 * salida: convertir caracteres como <code>&lt;</code>, <code>&gt;</code>, <code>&amp;</code>
 * o <code>"</code> en sus entidades HTML para que el navegador los muestre como texto.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Reemplaza <code>&lt;</code> → <code>&amp;lt;</code>, <code>&gt;</code> → <code>&amp;gt;</code>, <code>&amp;</code> → <code>&amp;amp;</code>, <code>"</code> → <code>&amp;quot;</code>, <code>'</code> → <code>&amp;#39;</code>.</li>
 *   <li>El escapado debe hacerse en el servidor, justo antes de renderizar (principio de "escape at the boundary").</li>
 *   <li>Para plantillas HTML con datos del usuario, prefiere motores que escapen por defecto (Thymeleaf, Handlebars, …).</li>
 *   <li>Complementa con cabeceras <code>Content-Security-Policy</code> para reducir el impacto de un eventual XSS.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public String escaparHtml(String html) {
 *     if (html == null) return null;
 *     return html.replace("&", "&amp;")
 *                .replace("&lt;", "&amp;lt;")
 *                .replace("&gt;", "&amp;gt;")
 *                .replace("\"", "&quot;")
 *                .replace("'", "&#39;");
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El orden importa: primero escapa <code>&amp;</code> y luego el resto para no re-escapear entidades.</li>
 *   <li>Para evitar reinventar la rueda, considera la clase <code>org.springframework.web.util.HtmlUtils.htmlEscape(...)</code>.</li>
 *   <li>No basta con escapar: añade CSP y validación de entrada para una defensa en profundidad.</li>
 * </ul>
 */
public class XssDetectorEnunciado {

    /**
     * Escapa los caracteres peligrosos de un fragmento HTML para evitar
     * la ejecución de scripts en el navegador del cliente.
     *
     * @param html cadena potencialmente peligrosa introducida por el usuario.
     * @return la misma cadena con los caracteres críticos escapados a entidades HTML,
     *         o <code>null</code> si la entrada es nula o aún no se ha implementado.
     */
    public String escaparHtml(String html) {
        // TODO: Convierte caracteres como '<' en '&lt;' y '>' en '&gt;'.
        return null;
    }
}
