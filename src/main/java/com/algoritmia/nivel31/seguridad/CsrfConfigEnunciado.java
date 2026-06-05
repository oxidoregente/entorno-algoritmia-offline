package com.algoritmia.nivel31.seguridad;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * 🎓 RETO: Configuración de CSRF (Cross-Site Request Forgery).
 * <b>Dificultad: Media</b>
 *
 * <p>CSRF (Cross-Site Request Forgery) es un ataque que engaña al navegador de un
 * usuario autenticado para que ejecute acciones no deseadas en otro sitio (p. ej. una
 * transferencia bancaria). Spring Security lo mitiga exigiendo un token impredecible
 * por petición, que el atacante no puede leer. En APIs REST sin sesión se suele
 * deshabilitar; en apps web tradicionales se mantiene y se almacena en cookies.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Por defecto Spring Security activa CSRF en cualquier ruta que no sea GET/HEAD/TRACE/OPTIONS.</li>
 *   <li>Para APIs REST stateless con tokens JWT/Bearer se deshabilita: <code>http.csrf(csrf -&gt; csrf.disable())</code>.</li>
 *   <li>Para SPAs autenticadas con cookies, conviene usar un repositorio basado en <code>CookieCsrfTokenRepository</code>.</li>
 *   <li>El token CSRF debe enviarse en una cabecera como <code>X-XSRF-TOKEN</code> para que no sea accesible por JS sin SameSite adecuado.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Bean
 * SecurityFilterChain chain(HttpSecurity http) throws Exception {
 *     return http
 *         .csrf(csrf -&gt; csrf
 *             .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
 *             .ignoringRequestMatchers("/api/**"))
 *         .build();
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Deshabilita CSRF solo en endpoints sin estado (APIs REST con tokens), no en formularios web.</li>
 *   <li>Usa <code>CookieCsrfTokenRepository.withHttpOnlyFalse()</code> para que el frontend pueda leer el token.</li>
 *   <li>Recuerda añadir el token en cada <em>POST/PUT/DELETE</em> desde el cliente en una cabecera <code>X-XSRF-TOKEN</code>.</li>
 * </ul>
 */
public class CsrfConfigEnunciado {

    /**
     * Configura la protección CSRF de la aplicación: define si se
     * deshabilita (APIs REST) o cómo se gestiona el repositorio de tokens.
     *
     * @param http builder de {@link HttpSecurity} sobre el que aplicar la configuración.
     * @throws Exception si la configuración de la cadena de seguridad falla.
     */
    public void configurarCsrf(HttpSecurity http) throws Exception {
        // TODO: ¿Cómo deshabilitarías CSRF para APIs REST que no usan sesiones?
        // TODO: ¿Cómo configurarías un repositorio de tokens CSRF en cookies?
    }
}
