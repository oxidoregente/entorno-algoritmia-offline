package com.algoritmia.nivel02.logica;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Gestor de Inventario Crítico.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Determina si una orden de compra puede ser procesada según las reglas de inventario.</p>
 *
 * <p><b>Reglas de negocio:</b></p>
 * <ol>
 *   <li>Si la cantidad pedida es mayor que el stock disponible, devuelve `RECHAZADO_SIN_STOCK`.</li>
 *   <li>Si el producto es "VITAL" y después de procesar la orden el stock restante es menor a 5,
 *       devuelve `ALERTA_STOCK_BAJO`.</li>
 *   <li>De lo contrario, devuelve `PROCESADO_EXITOSO`.</li>
 * </ol>
 *
 * <h3>Ejemplos:</h3>
 * <pre>
 * stock=10, cantidad=5, esVital=true  -> PROCESADO_EXITOSO (restante 5 >= 5)
 * stock=10, cantidad=8, esVital=true  -> ALERTA_STOCK_BAJO (restante 2 < 5)
 * stock=5, cantidad=10, esVital=false -> RECHAZADO_SIN_STOCK
 * </pre>
 */
@Service
public class GestorInventarioEnunciado {

    public enum EstatusOrden { PROCESADO_EXITOSO, RECHAZADO_SIN_STOCK, ALERTA_STOCK_BAJO }

    /**
     * Procesa una orden de compra y devuelve su estatus según las reglas de inventario.
     *
     * @param stockActual   La cantidad actual en stock.
     * @param cantidadPedida La cantidad solicitada en la orden.
     * @param esVital        Indica si el producto es crítico/vital.
     * @return El estatus de la orden procesada.
     */
    public EstatusOrden procesarOrden(int stockActual, int cantidadPedida, boolean esVital) {
        // TODO: Implementa las validaciones de inventario
        return null;
    }
}
