package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Validador de Email Empresarial.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un servicio que verifique si un correo electrónico cumple con los
 * estándares básicos de la empresa.</p>
 *
 * <p><b>Reglas:</b></p>
 * <ol>
 *   <li>Debe contener exactamente un símbolo '@'.</li>
 *   <li>Debe terminar en '.com' o '.org'.</li>
 *   <li>NO debe contener espacios en blanco.</li>
 * </ol>
 *
 * <h3>Ejemplos:</h3>
 * <pre>
 * "user@company.com"  -> true
 * "user@company.org"  -> true
 * "user@company.net"  -> false
 * "user name@com"     -> false
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `String.contains("@")` y cuenta las ocurrencias con bucles o `replace`.</li>
 *   <li>Usa `String.endsWith(".com")` o `endsWith(".org")`.</li>
 *   <li>Usa `String.contains(" ")` para detectar espacios.</li>
 * </ul>
 */
@Service
public class ValidadorEmailEnunciado {

    /**
     * Verifica si un email cumple con los estándares empresariales.
     *
     * @param email El correo electrónico a validar.
     * @return true si es válido, false en caso contrario.
     */
    public boolean esEmailValido(String email) {
        // TODO: Implementa la validación del correo
        return false;
    }
}
