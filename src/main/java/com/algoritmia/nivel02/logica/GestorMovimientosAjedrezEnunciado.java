package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Gestor de Movimientos de Ajedrez (Movimiento Vertical).
 * <b>Dificultad: Fácil</b>
 *
 * <p>
 * En una variante simplificada del ajedrez, las piezas solo pueden moverse
 * hacia arriba. Debes validar si una pieza puede moverse de la posición (x1,
 * y1) a (x2, y2).
 * </p>
 *
 * <p>
 * <b>Reglas:</b>
 * </p>
 * <ul>
 * <li>El tablero tiene dimensiones 8x8 (coordenadas de 0 a 7).</li>
 * <li>El movimiento debe ser hacia arriba (y2 > y1).</li>
 * <li><b>PEON:</b> Solo 1 paso adelante en vertical: x1 == x2, y2 == y1 +
 * 1.</li>
 * <li><b>TORRE:</b> Cualquier cantidad de pasos en vertical: x1 == x2.</li>
 * </ul>
 *
 * <h3>Ejemplos:</h3>
 * 
 * <pre>
 * PEON, (3,1) -> (3,2): true
 * PEON, (3,1) -> (3,3): false
 * TORRE, (4,0) -> (4,5): true
 * TORRE, (4,0) -> (5,5): false
 * </pre>
 */
@Service
public class GestorMovimientosAjedrezEnunciado {

    public enum Pieza {
        PEON, TORRE
    }

    /**
     * Valida si un movimiento de una pieza es válido según las reglas del juego.
     *
     * @param pieza Tipo de pieza (PEON o TORRE).
     * @param x1    Coordenada x de origen.
     * @param y1    Coordenada y de origen.
     * @param x2    Coordenada x de destino.
     * @param y2    Coordenada y de destino.
     * @return true si el movimiento es válido, false en caso contrario.
     */
    public boolean esMovimientoValido(Pieza pieza, int x1, int y1, int x2, int y2) {
        // TODO: Valida límites del tablero y movimiento por tipo de pieza
        if (
                (x1 != x2 || y2 < y1) || 
                (x2 > 7 || x2 < 0) || 
                (y2 > 7 || y2 < 0) || 
                (y2 > y1 + 1 && pieza != Pieza.TORRE)
                )
            return false;

        return true;
    }
}
