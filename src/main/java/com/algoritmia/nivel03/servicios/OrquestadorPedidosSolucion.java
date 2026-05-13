package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel14.mensajeria.ProductorMensajesEnunciado;
import com.algoritmia.nivel03.servicios.GestorInventarioEnunciado.EstatusOrden;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;

/**
 * 🏆 SOLUCIÓN: Orquestador de Pedidos.
 */
public class OrquestadorPedidosSolucion {

    private final GestorInventarioEnunciado inventario;
    private final ProcesadorPagosFintechEnunciado pagos;
    private final ProductorMensajesEnunciado productor;

    public OrquestadorPedidosSolucion(GestorInventarioEnunciado inventario, 
                                     ProcesadorPagosFintechEnunciado pagos, 
                                     ProductorMensajesEnunciado productor) {
        this.inventario = inventario;
        this.pagos = pagos;
        this.productor = productor;
    }

    public boolean procesarPedido(String item, int cantidad, double monto, TipoTarjeta tipoTarjeta) {
        // 1. Validar Inventario
        EstatusOrden status = inventario.procesarOrden(100, cantidad, false);
        if (status != EstatusOrden.PROCESADO_EXITOSO) {
            throw new RuntimeException("Fallo de Inventario");
        }

        // 2. Procesar Pago
        pagos.calcularComision(monto, tipoTarjeta);

        // 3. Notificar
        productor.enviarEvento("Pedido de " + item + " completado");

        return true;
    }
}
