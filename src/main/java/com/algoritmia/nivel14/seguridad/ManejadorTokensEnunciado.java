package com.algoritmia.nivel14.seguridad;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Manejador de Tokens JWT.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa un servicio que analice la validez de un token JWT y
 * verifique si el usuario embebido en su <i>payload</i> tiene privilegios
 * de administrador. Este tipo de <i>guard</i> se usa en endpoints
 * protegidos con Spring Security para autorizar o denegar el acceso.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>El token se valida con {@link JwtUtil#validarToken(String)}: si no
 *       es válido, devuelve {@code false} inmediatamente.</li>
 *   <li>Si el token es válido, se extrae el <i>subject</i> (nombre de
 *       usuario) y se compara con la cadena {@code "admin"}.</li>
 *   <li>El método debe ser robusto frente a tokens malformados o
 *       expirados: la validación debe delegarse siempre en {@link JwtUtil}.</li>
 *   <li>Mantén la dependencia inyectada por constructor (sin
 *       {@code @Autowired} en campos).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * // Token válido con subject = "admin"
 * boolean ok = manejador.esAdminValido("eyJhbGciOiJIUzI1NiJ9..."); // true
 *
 * // Token válido con subject = "user"
 * boolean no = manejador.esAdminValido("eyJhbGciOiJIUzI1NiJ9..."); // false
 *
 * // Token expirado o malformado
 * boolean no = manejador.esAdminValido("basura");                    // false
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@link JwtUtil} expone métodos como {@code validarToken(String)},
 *       {@code obtenerUsername(String)} o
 *       {@code obtenerClaim(String, Function)}.</li>
 *   <li>En una app real, el rol se almacena en un <i>claim</i> específico
 *       (por ejemplo {@code roles}); aquí se simplifica comparando el
 *       subject.</li>
 *   <li>Recuerda que validar y autorizar son dos pasos distintos: primero
 *       valida, luego comprueba los permisos.</li>
 * </ul>
 */
@Service
public class ManejadorTokensEnunciado {

    private final JwtUtil jwtUtil;

    /**
     * Constructor con inyección de dependencias. Mantén el campo
     * {@code final} y no uses {@code @Autowired} sobre el campo.
     *
     * @param jwtUtil utilidad de tokens JWT (validación y parseo).
     */
    public ManejadorTokensEnunciado(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    /**
     * Indica si el token es válido y pertenece a un usuario administrador.
     *
     * @param token cadena JWT a validar (sin el prefijo {@code "Bearer "}).
     * @return {@code true} si el token es válido y su subject es
     *         {@code "admin"}, {@code false} en cualquier otro caso.
     */
    public boolean esAdminValido(String token) {
        // TODO: Valida el token usando jwtUtil.validarToken()
        // TODO: Obtén el usuario y verifica si es igual a "admin"
        return false;
    }
}
