package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.springframework.context.ApplicationEventPublisher;
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
 *   <li><b>Validar Stock:</b> Usa {@code GestorInventarioEnunciado.procesarOrden(...)}.
 *       Si el estatus no es {@code PROCESADO_EXITOSO}, la orden completa se rechaza.</li>
 *   <li><b>Procesar Pago:</b> Usa {@code ProcesadorPagosFintechEnunciado.calcularComision(...)}.
 *       Si el cálculo falla, se revierte la orden de inventario.</li>
 *   <li><b>Notificar:</b> Si todo es exitoso, publica un evento de dominio usando
 *       {@link ApplicationEventPublisher}.</li>
 * </ol>
 *
 * <p><b>Enfoque de Testing:</b> Este reto se enfoca en orquestar múltiples dependencias
 * usando Mocks y verificar que todas fueron llamadas en el orden correcto.</p>
 *
 * <p><b>Nota arquitectónica:</b> Se usa {@code ApplicationEventPublisher} (interfaz nativa
 * de Spring) en lugar de importar una clase concreta de mensajería. Esto desacopla este
 * servicio del sistema de RabbitMQ, que se introduce en el nivel 14.</p>
 */
@Service
public class OrquestadorPedidosEnunciado {

    private final GestorInventarioEnunciado inventario;
    private final ProcesadorPagosFintechEnunciado pagos;
    private final ApplicationEventPublisher publicadorEventos;

    public OrquestadorPedidosEnunciado(GestorInventarioEnunciado inventario,
                                       ProcesadorPagosFintechEnunciado pagos,
                                       ApplicationEventPublisher publicadorEventos) {
        this.inventario = inventario;
        this.pagos = pagos;
        this.publicadorEventos = publicadorEventos;
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
    public boolean procesarPedido(String item, int cantidad, double monto, TipoTarjeta tipoTarjeta) {
        // TODO: Implementa la orquestación de servicios en el orden correcto
        return false;
    }
}
