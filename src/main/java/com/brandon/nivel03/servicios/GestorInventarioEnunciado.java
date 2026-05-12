package com.brandon.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Gestor de Inventario Crítico.
 * 
 * Determina si una orden de compra puede ser procesada.
 * 
 * Reglas:
 * 1. Si la cantidad pedida es mayor que el stock, devuelve "RECHAZADO_SIN_STOCK".
 * 2. Si el producto es "VITAL" y el stock restante es menor a 5, devuelve "ALERTA_STOCK_BAJO".
 * 3. De lo contrario, devuelve "PROCESADO_EXITOSO".
 */
@Service
public class GestorInventarioEnunciado {

    public enum EstatusOrden { PROCESADO_EXITOSO, RECHAZADO_SIN_STOCK, ALERTA_STOCK_BAJO }

    public EstatusOrden procesarOrden(int stockActual, int cantidadPedida, boolean esVital) {
        // TODO: Implementa las validaciones de inventario
        return null;
    }
}
