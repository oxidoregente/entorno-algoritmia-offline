package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Orquestador de Pedidos.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Coordina el flujo completo de un proceso de venta. El pedido debe pasar por 3 fases
 * secuenciales para ser considerado exitoso:</p>
 *
 * <p><b>Flujo:</b></p>
 * <ol>
 *   <li><b>Validar Stock:</b> Usa `GestorInventarioEnunciado.procesarOrden(...)`.
 *       Si falla, la orden completa se rechaza.</li>
 *   <li><b>Procesar Pago:</b> Usa `ProcesadorPagosFintechEnunciado.calcularComision(...)`.
 *       Si falla, se revierte la orden.</li>
 *   <li><b>Notificar:</b> Si todo es exitoso, envía un mensaje con `ProductorMensajesEnunciado.enviarEvento(...)`.</li>
 * </ol>
 *
 * <p><b>Enfoque de Testing:</b> Este reto se enfoca en orquestar múltiples dependencias
 * usando Mocks y verificar que todas fueron llamadas en el orden correcto.</p>
 */
@Service
public class OrquestadorPedidosEnunciado {

    private final GestorInventarioEnunciado inventario;
    private final ProcesadorPagosFintechEnunciado pagos;
    private final ProductorMensajesEnunciado productor;

    public OrquestadorPedidosEnunciado(GestorInventarioEnunciado inventario,
                                     ProcesadorPagosFintechEnunciado pagos,
                                     ProductorMensajesEnunciado productor) {
        this.inventario = inventario;
        this.pagos = pagos;
        this.productor = productor;
    }

    /**
     * Procesa un pedido completo validando stock, procesando pago y notificando.
     *
     * @param item        El identificador del producto.
     * @param cantidad    La cantidad solicitada.
     * @param monto       El monto total de la venta.
     * @param tipoTarjeta El tipo de tarjeta para el pago.
     * @return true si el pedido se procesa exitosamente, false en caso contrario.
     */
    public boolean procesarPedido(String item, int cantidad, double monto, String tipoTarjeta) {
        // TODO: Implementa la orquestación de servicios en el orden correcto
        return false;
    }
}
