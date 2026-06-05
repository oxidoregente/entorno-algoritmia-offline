package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Patrón TCC (Try-Confirm-Cancel).
 * <b>Dificultad: Difícil</b>
 *
 * <p>TCC es una alternativa al patrón Saga para coordinar transacciones distribuidas.
 * Cada participante expone tres operaciones: <em>Try</em> (reserva lógica de los
 * recursos), <em>Confirm</em> (hace la reserva permanente) y <em>Cancel</em> (libera
 * la reserva si algo falla). A diferencia de Saga, las acciones de TCC deben
 * implementarse en cada servicio, lo que da un control más fino sobre los bloqueos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><b>Try</b>: comprueba disponibilidad y reserva (sin llegar a confirmar).</li>
 *   <li><b>Confirm</b>: aplica los cambios de forma definitiva e idempotente.</li>
 *   <li><b>Cancel</b>: libera la reserva y restaura el estado, también idempotente.</li>
 *   <li>El coordinador decide si invoca <em>Confirm</em> en todos los participantes o <em>Cancel</em>.</li>
 *   <li>Requiere que cada servicio exponga las tres operaciones; no es retrocompatible con APIs existentes.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * // 1. Try
 * stockService.tryReserve(pedido);   // marca la fila como "reservada"
 * pagoService.tryCharge(pedido);     // autoriza pero no captura
 *
 * // 2a. Si todo OK → Confirm
 * stockService.confirm(pedido);
 * pagoService.confirm(pedido);
 *
 * // 2b. Si algo falla → Cancel
 * stockService.cancel(pedido);
 * pagoService.cancel(pedido);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Implementa cada operación como método idempotente: Confirm o Cancel pueden recibirse en duplicado.</li>
 *   <li>Centraliza la decisión en un coordinador o apóyate en un orquestador (Seata, Temporal, etc.).</li>
 *   <li>Define timeouts: si un Confirm no llega a tiempo, el sistema puede aplicar heurísticas (auto-Cancel).</li>
 * </ul>
 */
public class TccPatternEnunciado {

    /**
     * Fase <b>Try</b>: reserva los recursos de forma lógica sin hacerlos
     * todavía permanentes. Debe ser rápida y reversible.
     */
    public void tryOperation() {
        // Reservar recursos
    }

    /**
     * Fase <b>Confirm</b>: aplica de forma definitiva y permanente los
     * cambios reservados en la fase Try. Debe ser idempotente.
     */
    public void confirmOperation() {
        // Confirmar cambios permanentes
    }

    /**
     * Fase <b>Cancel</b>: libera las reservas realizadas en la fase Try
     * cuando la transacción distribuida se aborta. Debe ser idempotente.
     */
    public void cancelOperation() {
        // Liberar reservas
    }
}
