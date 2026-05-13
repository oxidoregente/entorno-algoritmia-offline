package com.algoritmia.nivel05.api;

import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import java.util.Map;

/**
 * SOLUCIÓN: Pago Controller.
 */
public class PagoControllerSolucion {

    private final ProcesadorPagosFintechEnunciado procesador;

    public PagoControllerSolucion(ProcesadorPagosFintechEnunciado procesador) {
        this.procesador = procesador;
    }

    public Map<String, Object> obtenerComision(double monto, TipoTarjeta tipo) {
        double comision = procesador.calcularComision(monto, tipo);
        return Map.of(
            "montoOriginal", monto,
            "tipoTarjeta", tipo,
            "comisionCalculada", comision,
            "total", monto + comision
        );
    }
}
