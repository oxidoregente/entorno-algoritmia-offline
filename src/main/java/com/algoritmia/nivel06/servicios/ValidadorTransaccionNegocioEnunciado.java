package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel06.excepciones.ErrorDeNegocioException;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Validador de Transacciones Críticas.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa una validación de negocio que lance una excepción personalizada
 * si las reglas no se cumplen.</p>
 *
 * <p><b>Regla:</b> El monto de transferencia no puede ser superior a 10,000.
 * Si se supera este límite, debe lanzar una `ErrorDeNegocioException`.</p>
 *
 * <p>Este patrón es común en arquitecturas limpias para separar las reglas de negocio
 * de la capa de presentación (controladores).</p>
 */
@Service
public class ValidadorTransaccionNegocioEnunciado {

    /**
     * Valida que el monto de una transacción no supere el límite permitido.
     *
     * @param monto El monto de la transacción a validar.
     * @throws ErrorDeNegocioException Si el monto supera los 10,000.
     */
    public void validarMonto(double monto) {
        // TODO: Si monto > 10000 -> lanzar ErrorDeNegocioException
    }
}
