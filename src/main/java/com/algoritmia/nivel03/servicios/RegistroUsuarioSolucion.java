package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.ValidadorEmailEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado;
import com.algoritmia.nivel02.logica.ValidadorSeguridadPassEnunciado.NivelSeguridad;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 🏆 SOLUCIÓN: Servicio de Registro de Usuarios.
 *
 * <p>Teoría:
 * Este servicio demuestra el patrón de <b>composición de beans</b> en Spring:
 * un servicio ({@code RegistroUsuarioSolucion}) consume otros servicios
 * ({@code ValidadorEmail}, {@code ValidadorSeguridadPass}) que a su vez
 * son {@code @Service}. Esto se llama <i>composición vertical</i>: cada
 * capa delega la lógica compleja a una capa inferior.</p>
 *
 * <p>Además, publica un evento de dominio usando
 * {@link ApplicationEventPublisher} cuando el registro es exitoso.
 * Este evento puede ser escuchado por cualquier otro bean del contexto
 * Spring (por ejemplo, un servicio de email o de auditoría).</p>
 */
public class RegistroUsuarioSolucion {

    private final ValidadorEmailEnunciado validadorEmail;
    private final ValidadorSeguridadPassEnunciado validadorPassword;
    private final ApplicationEventPublisher publicadorEventos;

    public RegistroUsuarioSolucion(ValidadorEmailEnunciado validadorEmail,
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
     * @return true si el registro es exitoso.
     */
    public boolean registrarUsuario(String email, String password) {
        if (!validadorEmail.esEmailValido(email)) {
            return false;
        }
        NivelSeguridad nivel = validadorPassword.evaluar(password);
        if (nivel == NivelSeguridad.DEBIL) {
            return false;
        }

        publicadorEventos.publishEvent("Usuario registrado: " + email);
        return true;
    }
}
