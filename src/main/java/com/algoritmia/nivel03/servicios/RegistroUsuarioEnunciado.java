package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.ValidadorEmailEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado.NivelSeguridad;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Registro de Usuarios.
 * <b>Dificultad: Media</b>
 *
 * <p>Este servicio orquesta el registro de un nuevo usuario en el sistema.
 * Combina validaciones de lógica pura (nivel 02) con inyección de dependencias
 * de Spring para emitir un evento de dominio cuando el registro es exitoso.</p>
 *
 * <p><b>Flujo de negocio:</b></p>
 * <ol>
 *   <li>Valida el email usando {@link ValidadorEmailEnunciado}.</li>
 *   <li>Evalúa la contraseña con {@link ValidadorSeguridadPassEnunciado}.
 *       El nivel mínimo aceptable es {@code MEDIA}.</li>
 *   <li>Si ambas validaciones pasan, publica un evento de dominio
 *       usando {@code ApplicationEventPublisher} (no usa RabbitMQ directo).</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * registro.registrarUsuario("ana@empresa.com", "Clave123!")
 * // Si todo OK: publica evento y retorna true
 * // Si email/password inválidos: retorna false
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Las dependencias {@code validadorEmail} y {@code validadorPassword}
 *       se inyectan por constructor (estilo Spring, no uses {@code @Autowired}).</li>
 *   <li>El método real es {@code validadorEmail.esEmailValido(email)} (no {@code esValido}).</li>
 *   <li>El método real es {@code validadorPassword.evaluar(password)} y retorna un
 *       {@code NivelSeguridad} (DEBIL, MEDIA, FUERTE). Acepta MEDIA o superior.</li>
 *   <li>El {@code publicadorEventos} también se inyecta por constructor.</li>
 *   <li>Usa {@code publishEvent("Usuario registrado: " + email)} como mensaje.</li>
 * </ul>
 */
@Service
public class RegistroUsuarioEnunciado {

    private final ValidadorEmailEnunciado validadorEmail;
    private final ValidadorSeguridadPassEnunciado validadorPassword;
    private final ApplicationEventPublisher publicadorEventos;

    public RegistroUsuarioEnunciado(ValidadorEmailEnunciado validadorEmail,
                                    ValidadorSeguridadPassEnunciado validadorPassword,
                                    ApplicationEventPublisher publicadorEventos) {
        this.validadorEmail = validadorEmail;
        this.validadorPassword = validadorPassword;
        this.publicadorEventos = publicadorEventos;
    }

    /**
     * Registra un usuario tras validar email y contraseña.
     *
     * @param email     Dirección de correo del nuevo usuario.
     * @param password  Contraseña propuesta.
     * @return {@code true} si el registro es exitoso, {@code false} en caso contrario.
     */
    public boolean registrarUsuario(String email, String password) {
        // TODO: Implementa la orquestación:
        //   1. Validar email con esEmailValido().
        //   2. Validar password con evaluar() (nivel mínimo: MEDIA).
        //   3. Si pasan, publicar evento y retornar true.
        //   4. Si alguna falla, retornar false.
        return false;
    }
}
