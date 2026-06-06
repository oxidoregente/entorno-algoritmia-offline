package com.algoritmia.nivel02.logica;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Validador de Seguridad de Contraseñas. <b>Dificultad: Fácil</b>
 *
 * <p>
 * Determina la fortaleza de una contraseña basándose en el cumplimiento de
 * múltiples reglas de seguridad:
 * </p>
 * <ol>
 * <li><b>Longitud:</b> Mínimo 8 caracteres.</li>
 * <li><b>Números:</b> Debe contener al menos un dígito (0-9).</li>
 * <li><b>Caracteres especiales:</b> Debe contener al menos uno de: !, @, #, $,
 * %.</li>
 * </ol>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * "abc"         -> DEBIL   (0 reglas)
 * "abcdefgh"    -> DEBIL   (1 regla: longitud)
 * "abc1defg"    -> MEDIA   (2 reglas: longitud, número)
 * "abc1defg!"   -> FUERTE  (3 reglas)
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa expresiones regulares o métodos helper para verificar cada
 * regla.</li>
 * <li>Cuenta cuántas reglas cumple la contraseña y asigna el nivel
 * correspondiente.</li>
 * </ul>
 */
@Service
public class ValidadorSeguridadPassEnunciado {

    public enum NivelSeguridad {
        DEBIL, MEDIA, FUERTE
    }

    /**
     * Evalúa la fortaleza de una contraseña según las reglas de seguridad.
     *
     * @param password La contraseña a evaluar.
     * @return El nivel de seguridad: DEBIL, MEDIA o FUERTE.
     */

    List<Character> caracteres = List.of('!', '@', '#', '$', '%');

    public NivelSeguridad evaluar(String password) {
        // TODO: Implementa la validación de las 3 reglas
        // Cumple 0 o 1 regla -> DEBIL, 2 reglas -> MEDIA, 3 reglas -> FUERTE

        if (password == null || password.trim().equals(""))
            throw new IllegalArgumentException();

        int seguridad = 0;

        if (password.length() > 8)
            seguridad++;

        for (char c : password.toCharArray()) {
            if (caracteres.contains(c)) {
                seguridad++;
                break;
            }
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                seguridad++;
                break;
            }
        }

        switch (seguridad) {
        case 0:
            return NivelSeguridad.DEBIL;

        case 1:
            return NivelSeguridad.DEBIL;

        case 2:
            return NivelSeguridad.MEDIA;

        case 3:
            return NivelSeguridad.FUERTE;
        }

        return null;
    }
}
