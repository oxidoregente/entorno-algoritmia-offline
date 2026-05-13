package com.algoritmia.nivel06.servicios;

import com.algoritmia.nivel06.excepciones.ErrorDeNegocioException;

/**
 * 🏆 SOLUCIÓN: Validador de Transacciones.
 */
public class ValidadorTransaccionNegocioSolucion {

    public void validarMonto(double monto) {
        if (monto > 10000) {
            throw new ErrorDeNegocioException("Monto excede el límite permitido por transacción");
        }
    }
}
