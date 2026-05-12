package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Validador de Seguridad de Contraseñas.
 * 
 * Determina la fortaleza de una contraseña basándose en múltiples reglas.
 * 
 * Reglas de Seguridad:
 * 1. Mínimo 8 caracteres.
 * 2. Debe contener al menos un número.
 * 3. Debe contener al menos un carácter especial (!, @, #, $, %).
 */
@Service
public class ValidadorSeguridadPassEnunciado {

    public enum NivelSeguridad { DEBIL, MEDIA, FUERTE }

    public NivelSeguridad evaluar(String password) {
        // TODO: Implementa la validación de las 3 reglas
        // - Cumple 0 o 1 regla: DEBIL
        // - Cumple 2 reglas: MEDIA
        // - Cumple las 3 reglas: FUERTE
        return null;
    }
}
