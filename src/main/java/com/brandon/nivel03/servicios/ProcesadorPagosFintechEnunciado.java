package com.brandon.nivel03.servicios;

import com.brandon.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.springframework.stereotype.Service;

/**
 * RETO: Procesador de Pagos Fintech.
 * 
 * Este servicio debe calcular la comisión de una transacción basada en el tipo de tarjeta.
 * Además, debe notificar cada pago procesado a través del ProductorMensajesEnunciado (Nivel 14).
 * 
 * Reglas:
 * - DEBITO: 1%
 * - CREDITO: 3%
 * - CORPORATIVA: 5%
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
     * Calcula la comisión y envía un evento asíncrono.
     * 
     * @param monto El importe de la transacción.
     * @param tipo El tipo de tarjeta utilizada.
     * @return El monto de la comisión calculada.
     */
    public double calcularComision(double monto, TipoTarjeta tipo) {
        // TODO: Implementa el cálculo usando un switch mejorado (Java 21)
        // TODO: Envía el evento usando productor.enviarEvento()
        return 0;
    }
}
