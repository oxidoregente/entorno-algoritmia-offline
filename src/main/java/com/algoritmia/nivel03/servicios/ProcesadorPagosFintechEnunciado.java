package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Procesador de Pagos Fintech.
 * <b>Dificultad: Media</b>
 *
 * <p>Este servicio calcula la comisión de una transacción basada en el tipo de tarjeta
 * y notifica cada pago procesado a través del sistema de mensajería.</p>
 *
 * <p><b>Reglas de comisión:</b></p>
 * <ul>
 *   <li>DEBITO: 1% del monto.</li>
 *   <li>CREDITO: 3% del monto.</li>
 *   <li>CORPORATIVA: 5% del monto.</li>
 * </ul>
 *
 * <p><b>Nota:</b> Después de calcular la comisión, debes enviar un evento asíncrono
 * usando `productor.enviarEvento(...)` para notificar el pago procesado.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * monto=1000, tipo=CREDITO
 * Comisión: 1000 * 0.03 = 30.0
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa un `switch` mejorado (Java 21) con expresión para calcular la tasa.</li>
 *   <li>Llama a `productor.enviarEvento(datosDelPago)` después de calcular la comisión.</li>
 * </ul>
 */
@Service
public class ProcesadorPagosFintechEnunciado {

    private final ProductorMensajesEnunciado productor;

    public ProcesadorPagosFintechEnunciado(ProductorMensajesEnunciado productor) {
        this.productor = productor;
    }

    public enum TipoTarjeta {
        DEBITO, CREDITO, CORPORATIVA
    }

    /**
     * Calcula la comisión según el tipo de tarjeta y envía un evento de notificación.
     *
     * @param monto El importe de la transacción.
     * @param tipo  El tipo de tarjeta utilizada.
     * @return El monto de la comisión calculada.
     */
    public double calcularComision(double monto, TipoTarjeta tipo) {
        // TODO: Implementa el cálculo con switch mejorado y envía evento
        return 0;
    }
}
