package com.brandon.nivel3.servicios;

import com.brandon.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.springframework.stereotype.Service;

/**
 * SOLUCIÓN: Procesador de Pagos Fintech.
 * 
 * <p>Teoría:
 * En Spring Boot, los servicios encapsulan la lógica de negocio. Usamos inyección
 * por constructor para asegurar que las dependencias (como ProductorMensajesEnunciado) 
 * estén presentes.</p>
 */
public class ProcesadorPagosFintechSolucion {

    private final ProductorMensajesEnunciado productor;

    public ProcesadorPagosFintechSolucion(ProductorMensajesEnunciado productor) {
        this.productor = productor;
    }


    public enum TipoTarjeta {
        DEBITO, CREDITO, CORPORATIVA
    }

    public double calcularComision(double monto, TipoTarjeta tipo) {
        if (monto <= 0) return 0;

        double comision = switch (tipo) {
            case DEBITO -> monto * 0.01;
            case CREDITO -> monto * 0.03;
            case CORPORATIVA -> monto * 0.05;
        };

        productor.enviarEvento("Pago procesado - Monto: $" + monto + " | Comisión: $" + comision);

        return comision;
    }
}
