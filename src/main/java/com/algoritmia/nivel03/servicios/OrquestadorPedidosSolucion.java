package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel03.servicios.GestorInventarioEnunciado.EstatusOrden;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 🏆 SOLUCIÓN: Orquestador de Pedidos.
 *
 * <p>Teoría:
 * El patrón Orquestador centraliza el flujo de un proceso de negocio que involucra
 * varios servicios. La clave es definir claramente el orden de las llamadas y
 * manejar los fallos de forma adecuada.</p>
 *
 * <p>Acoplamiento: usamos {@link ApplicationEventPublisher} para publicar el evento
 * de "pedido completado" en lugar de llamar directamente a un servicio de mensajería.
 * Cuando en el nivel 14 se introduzca RabbitMQ, bastará con un {@code @EventListener}
 * que escuche estos eventos y los publique en una cola.</p>
 */
public class OrquestadorPedidosSolucion {

    private final GestorInventarioEnunciado inventario;
    private final ProcesadorPagosFintechEnunciado pagos;
    private final ApplicationEventPublisher publicadorEventos;

    public OrquestadorPedidosSolucion(GestorInventarioEnunciado inventario,
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
        // 1. Validar Inventario
        EstatusOrden status = inventario.procesarOrden(100, cantidad, false);
        if (status != EstatusOrden.PROCESADO_EXITOSO) {
            throw new RuntimeException("Fallo de Inventario: " + status);
        }

        // 2. Procesar Pago
        pagos.calcularComision(monto, tipoTarjeta);

        // 3. Notificar (publicar evento de dominio)
        publicadorEventos.publishEvent("Pedido de " + item + " completado");

        return true;
    }
}
