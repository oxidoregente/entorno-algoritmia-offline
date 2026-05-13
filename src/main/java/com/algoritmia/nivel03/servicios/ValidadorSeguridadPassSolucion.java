package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel03.servicios.ValidadorSeguridadPassEnunciado.NivelSeguridad;

/**
 * SOLUCIÓN: Validador de Seguridad de Contraseñas.
 */
public class ValidadorSeguridadPassSolucion {

    public NivelSeguridad evaluar(String password) {
        if (password == null) return NivelSeguridad.DEBIL;

        int reglasCumplidas = 0;

        if (password.length() >= 8) reglasCumplidas++;
        if (password.matches(".*\\d.*")) reglasCumplidas++;
        if (password.matches(".*[!@#$%].*")) reglasCumplidas++;

        return switch (reglasCumplidas) {
            case 3 -> NivelSeguridad.FUERTE;
            case 2 -> NivelSeguridad.MEDIA;
            default -> NivelSeguridad.DEBIL;
        };
    }
}
