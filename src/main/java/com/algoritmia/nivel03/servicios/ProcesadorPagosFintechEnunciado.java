package com.algoritmia.nivel03.servicios;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Procesador de Pagos Fintech. <b>Dificultad: Media</b>
 *
 * <p>
 * Este servicio calcula la comisión de una transacción basada en el tipo de
 * tarjeta y publica un evento de dominio para que otros componentes del sistema
 * (auditoría, notificaciones, analítica) puedan reaccionar de forma
 * desacoplada.
 * </p>
 *
 * <p>
 * <b>Reglas de comisión:</b>
 * </p>
 * <ul>
 * <li>DEBITO: 1% del monto.</li>
 * <li>CREDITO: 3% del monto.</li>
 * <li>CORPORATIVA: 5% del monto.</li>
 * </ul>
 *
 * <p>
 * <b>Nota:</b> Después de calcular la comisión, debes publicar un evento de
 * dominio usando {@code publisher.publishEvent(...)} para notificar el pago
 * procesado. Esto desacopla el procesador del sistema de mensajería (RabbitMQ),
 * que se introduce en el nivel 14.
 * </p>
 *
 * <h3>Ejemplo:</h3>
 * 
 * <pre>
 * monto=1000, tipo=CREDITO
 * Comisión: 1000 * 0.03 = 30.0
 * </pre>
 *
 * <p>
 * <b>Pistas:</b>
 * </p>
 * <ul>
 * <li>Usa un `switch` mejorado (Java 21) con expresión para calcular la
 * tasa.</li>
 * <li>Usa {@code ApplicationEventPublisher} (interfaz nativa de Spring) en
 * lugar de acoplarte a una clase concreta de mensajería.</li>
 * <li>Llama a
 * {@code publisher.publishEvent("Pago procesado - Monto: $X | Comisión: $Y")}
 * después de calcular la comisión.</li>
 * </ul>
 */
@Service
public class ProcesadorPagosFintechEnunciado {

    private final ApplicationEventPublisher publisher;

    public ProcesadorPagosFintechEnunciado(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public enum TipoTarjeta {
        DEBITO, CREDITO, CORPORATIVA
    }

    /**
     * Calcula la comisión según el tipo de tarjeta y publica un evento de dominio.
     *
     * @param monto El importe de la transacción.
     * @param tipo  El tipo de tarjeta utilizada.
     * @return El monto de la comisión calculada.
     */
    public double calcularComision(double monto, TipoTarjeta tipo) {
        // TODO: Implementa el cálculo con switch mejorado y publica el evento

        double comision = 0;

        switch (tipo) {
        case TipoTarjeta.DEBITO:
            comision = 0.01;
            break;
        case TipoTarjeta.CREDITO:
            comision = 0.03;
            break;
        case TipoTarjeta.CORPORATIVA:
            comision = 0.05;
            break;
        }

        publisher.publishEvent("Pago procesado - Monto: $" + monto + " | Comisión: $" + comision + "");

        return monto * comision;
    }
}
