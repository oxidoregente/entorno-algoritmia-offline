package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Patrón TCC (Try-Confirm-Cancel).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>TCC es otra forma de gestionar transacciones distribuidas. 
 * Primero se reservan los recursos (Try), luego se confirma (Confirm) 
 * o se liberan si algo falla (Cancel).</p>
 */
public class TccPatternEnunciado {

    public void tryOperation() {
        // Reservar recursos
    }

    public void confirmOperation() {
        // Confirmar cambios permanentes
    }

    public void cancelOperation() {
        // Liberar reservas
    }
}
