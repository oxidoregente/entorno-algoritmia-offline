package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;

/**
 * SOLUCIÓN B: Gestor de Movimientos de Ajedrez.
 */
@Service
public class GestorMovimientosAjedrezSolucion {

    public enum Pieza { PEON, TORRE }

    public boolean esMovimientoValido(Pieza pieza, int x1, int y1, int x2, int y2) {
        // Fuera del tablero
        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7 || x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) {
            return false;
        }

        // Solo hacia arriba
        if (y2 <= y1) return false;

        return switch (pieza) {
            case PEON -> x1 == x2 && y2 == y1 + 1;
            case TORRE -> x1 == x2;
        };
    }
}
