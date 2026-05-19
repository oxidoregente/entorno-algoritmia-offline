package com.algoritmia.nivel12.seguridad;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 🎓 RETO: Controlador de Autenticación con Asignación de Roles.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un controlador REST para simular un proceso de inicio de sesión
 * y la asignación de roles. El objetivo es generar un token JWT para un usuario
 * autenticado y, de manera simplificada, asignar un rol específico si el usuario
 * es "admin".</p>
 *
 * <p>Utilizarás un `JwtUtil` para la generación de tokens, que ya está inyectado
 * en la clase.</p>
 *
 * <h3>Endpoint a implementar:</h3>
 * <p><code>POST /api/v1/auth/login</code></p>
 *
 * <h3>Parámetros de la petición:</h3>
 * <ul>
 *   <li>`usuario`: String, el nombre de usuario.</li>
 *   <li>`password`: String, la contraseña del usuario.</li>
 * </ul>
 *
 * <h3>Comportamiento esperado:</h3>
 * <ul>
 *   <li>Si las credenciales son válidas (ej. "admin" / "admin123"), el método debe:
 *     <ol>
 *       <li>Generar un token JWT utilizando `jwtUtil.generarToken(usuario)`.</li>
 *       <li>Devolver un `Map` que contenga el "token" generado y el "rol" asignado.
 *           Para el usuario "admin", el rol debe ser "ADMIN". Para otros usuarios,
 *           puedes definir un rol predeterminado o dejarlo simple por ahora.</li>
 *     </ol>
 *   </li>
 *   <li>Si las credenciales son inválidas, debe lanzar una excepción o devolver un error apropiado.</li>
 * </ul>
 *
 * <h3>Ejemplo (con credenciales válidas "admin"/"admin123"):</h3>
 * <pre>
 * Petición: POST /api/v1/auth/login?usuario=admin&password=admin123
 * Respuesta (ejemplo, el token variará):
 * {
 *   "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhd...[resto_del_token]",
 *   "rol": "ADMIN"
 * }
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `@RequestParam` para capturar los parámetros de la URL.</li>
 *   <li>La lógica de autenticación y asignación de roles puede ser simplificada para el propósito del reto.</li>
 *   <li>Considera cómo manejar las credenciales inválidas (lanzar `RuntimeException` es aceptable para este ejercicio).</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthControllerEnunciado {

    private final JwtUtil jwtUtil;

    public AuthControllerEnunciado(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    /**
     * Simula el proceso de inicio de sesión y genera un token JWT con asignación de roles.
     * Si las credenciales son válidas, devuelve un token y un rol; de lo contrario,
     * lanza una excepción.
     *
     * @param usuario El nombre de usuario para la autenticación.
     * @param password La contraseña del usuario para la autenticación.
     * @return Un mapa que contiene el token JWT generado y el rol asignado al usuario.
     * @throws RuntimeException Si las credenciales proporcionadas son inválidas.
     */
    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String usuario, @RequestParam String password) {
        // TODO: Simular login. Si es 'admin', asignar rol 'ROLE_ADMIN'.
        return null;
    }
}
