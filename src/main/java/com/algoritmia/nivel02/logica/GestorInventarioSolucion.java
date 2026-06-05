package com.algoritmia.nivel02.logica;

import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;

/**
 * SOLUCIÓN: Gestor de Inventario Crítico.
 */
public class GestorInventarioSolucion {

    public EstatusOrden procesarOrden(int stockActual, int cantidadPedida, boolean esVital) {
        if (cantidadPedida > stockActual) {
            return EstatusOrden.RECHAZADO_SIN_STOCK;
        }

        int stockRestante = stockActual - cantidadPedida;

        if (esVital && stockRestante < 5) {
            return EstatusOrden.ALERTA_STOCK_BAJO;
        }

        return EstatusOrden.PROCESADO_EXITOSO;
    }
}
