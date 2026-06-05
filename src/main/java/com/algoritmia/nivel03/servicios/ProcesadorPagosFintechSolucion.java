package com.algoritmia.nivel03.servicios;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * SOLUCIÓN: Procesador de Pagos Fintech.
 *
 * <p>Teoría:
 * En Spring Boot, los servicios encapsulan la lógica de negocio. Usamos inyección
 * por constructor para asegurar que las dependencias estén presentes. Para emitir
 * eventos de dominio sin acoplarnos a la infraestructura de mensajería (RabbitMQ),
 * usamos {@link ApplicationEventPublisher}, una abstracción nativa de Spring que
 * permite desacoplar completamente al productor del consumidor del evento.</p>
 *
 * <p>El nivel 14 introduce RabbitMQ; cuando llegues a ese nivel, podrás suscribirte
 * a estos eventos mediante un {@code @EventListener} que los redirija a una cola
 * sin que este servicio tenga que cambiar una sola línea.</p>
 */
public class ProcesadorPagosFintechSolucion {

    private final ApplicationEventPublisher publisher;

    public ProcesadorPagosFintechSolucion(ApplicationEventPublisher publisher) {
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
        if (monto <= 0) return 0;

        double comision = switch (tipo) {
            case DEBITO -> monto * 0.01;
            case CREDITO -> monto * 0.03;
            case CORPORATIVA -> monto * 0.05;
        };

        publisher.publishEvent("Pago procesado - Monto: $" + monto + " | Comisión: $" + comision);

        return comision;
    }
}
