package com.brandon.nivel03.servicios;

import com.brandon.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Orquestador de Pedidos.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Coordina el flujo completo de una venta. Para que el pedido sea exitoso 
 * debe pasar por 3 fases:</p>
 * 
 * <p><b>Flujo:</b>
 * 1. Validar Stock: Usa 'GestorInventarioEnunciado'. Si falla, lanza excepción.
 * 2. Procesar Pago: Usa 'ProcesadorPagosFintechEnunciado'. Si falla, lanza excepción.
 * 3. Notificar: Si todo ok, envía un mensaje con 'ProductorMensajesEnunciado'.</p>
 * 
 * <p><b>El Reto de Testing:</b> Aprenderás a orquestar múltiples Mocks y 
 * verificar que todos fueron llamados en el orden correcto.</p>
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

    public boolean procesarPedido(String item, int cantidad, double monto, String tipoTarjeta) {
        // TODO: Implementa la orquestación de servicios
        // 1. inventario.procesarOrden(...)
        // 2. pagos.calcularComision(...)
        // 3. productor.enviarEvento(...)
        return false;
    }
}
