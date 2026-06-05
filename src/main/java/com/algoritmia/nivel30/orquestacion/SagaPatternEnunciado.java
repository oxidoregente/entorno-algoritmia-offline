package com.algoritmia.nivel30.orquestacion;

/**
 * 🎓 RETO: Patrón Saga (Orquestación).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Una transacción distribuida (que involucra varios microservicios) no puede apoyarse
 * en un ACID clásico. El patrón <em>Saga</em> la modela como una cadena de
 * transacciones locales: si una falla, se ejecutan las <em>acciones compensatorias</em>
 * que deshacen lógicamente los pasos previos. La variante de <em>orquestación</em>
 * centraliza el flujo en un coordinador que guía a cada servicio.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Cada paso tiene su contrapeso compensatorio (p. ej. <code>reservarStock</code> ↔ <code>liberarStock</code>).</li>
 *   <li>El orquestador decide el siguiente paso en función del resultado del anterior.</li>
 *   <li>Las compensaciones no siempre son rollback "técnico": a menudo son acciones de negocio (anular reserva, reembolsar).</li>
 *   <li>Es <em>eventually consistent</em>: el sistema no queda consistente al instante, sino tras completarse la saga.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stockService.reservar(pedido);
 * try {
 *     pagoService.cobrar(pedido);
 * } catch (PagoFallidoException e) {
 *     stockService.liberar(pedido);
 *     throw e;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encadena los pasos con <code>try/catch</code> o con un orquestador explícito (clase, máquina de estados, Temporal/Cadence…).</li>
 *   <li>Las acciones compensatorias deben ser idempotentes por si se reintentan.</li>
 *   <li>Loggea cada paso para tener trazabilidad ante fallos de larga duración.</li>
 * </ul>
 */
public class SagaPatternEnunciado {

    /**
     * Ejecuta la saga de un pedido: reserva de stock y, si tiene éxito,
     * procesamiento del pago. Si el pago falla, compensa liberando el stock.
     */
    public void ejecutarTransaccion() {
        // TODO: Simula un flujo: 1. Reservar Stock, 2. Procesar Pago.
        // Si el Pago falla, llama a liberarStock().
    }

    /**
     * Acción compensatoria que libera el stock previamente reservado
     * cuando una saga debe deshacerse por un fallo posterior.
     */
    private void liberarStock() {
        // Acción compensatoria
    }
}
