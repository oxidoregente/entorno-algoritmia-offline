package com.brandon.nivel3.servicios;

import com.brandon.nivel14.mensajeria.ProductorMensajes;
import org.springframework.stereotype.Service;

/**
 * Nivel 3: Lógica de Negocio con Spring Boot.
 * 
 * El uso de @Service indica a Spring que esta clase es un 'Bean' que contiene
 * la lógica principal de la aplicación. Esto permite que Spring maneje su ciclo de vida.
 */
@Service
public class ProcesadorPagosFintech {

    private final ProductorMensajes productor;

    public ProcesadorPagosFintech(ProductorMensajes productor) {
        this.productor = productor;
    }

    public enum TipoTarjeta {
        DEBITO, CREDITO, CORPORATIVA
    }

    /**
     * Calcula la comisión de una transacción basada en el tipo de tarjeta.
     */
    public double calcularComision(double monto, TipoTarjeta tipo) {
        if (monto <= 0) return 0;

        double comision = switch (tipo) {
            case DEBITO -> monto * 0.01;      // 1%
            case CREDITO -> monto * 0.03;     // 3%
            case CORPORATIVA -> monto * 0.05; // 5%
        };

        // Enviamos evento asíncrono vía RabbitMQ
        productor.enviarEvento("Pago procesado - Monto: $" + monto + " | Comisión: $" + comision);

        return comision;
    }
}
