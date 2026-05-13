package com.algoritmia.nivel03.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO B: Gestor de Movimientos de Ajedrez (Survival Vertical).
 * 
 * En este juego, las piezas solo pueden moverse hacia arriba.
 * Debes validar si una pieza puede moverse de (x1, y1) a (x2, y2).
 * 
 * Reglas Simplificadas:
 * - El tablero es de 8x8 (0-7).
 * - El movimiento debe ser hacia arriba (y2 > y1).
 * - 'PEON': Solo 1 paso adelante vertical (x1 == x2, y2 == y1 + 1).
 * - 'TORRE': Cualquier cantidad de pasos vertical (x1 == x2).
 */
@Service
public class GestorMovimientosAjedrezEnunciado {

    public enum Pieza { PEON, TORRE }

    public boolean esMovimientoValido(Pieza pieza, int x1, int y1, int x2, int y2) {
        // TODO: Valida límites del tablero (0-7)
        // TODO: Valida que y2 > y1
        // TODO: Implementa lógica por tipo de pieza
        return false;
    }
}
