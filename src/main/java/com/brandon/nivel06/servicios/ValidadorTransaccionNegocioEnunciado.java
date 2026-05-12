package com.brandon.nivel06.servicios;

import com.brandon.nivel06.excepciones.ErrorDeNegocioException;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Validador de Transacciones Críticas.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa una validación que lance una excepción personalizada 
 * si las reglas de negocio no se cumplen.</p>
 * 
 * <p><b>Regla:</b> El monto de transferencia no puede ser superior a 10,000.</p>
 */
@Service
public class ValidadorTransaccionNegocioEnunciado {

    public void validarMonto(double monto) {
        // TODO: Si monto > 10000 -> lanzar ErrorDeNegocioException
    }
}
